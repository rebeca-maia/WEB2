<%@page import="general.Util"%>
<%@page import="general.Configs"%>
<%@page import="general.App"%>
<%@page import="model.Company"%>
<%@page import="dao.CompanyDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    App magnaApp = new App();

    // Verificando se esta logado
    if (magnaApp.isLoggedIn(session.getAttribute("user_logged"))) {
        response.sendRedirect(Configs.getMainUrlHome());
    }

    /**
     * -------------------------------------------------------------------------
     * | Processando a requisição
     * -------------------------------------------------------------------------
     */
    if (request.getParameter("btnLogin") != null) {

        try {

            Company user = new Company();
            CompanyDAO dao = new CompanyDAO();

            // Captura dos dados
            user.setEmail(request.getParameter("email"));
            user.setSenha(request.getParameter("pass"));

            Company result = dao.authenticate(user);

            if (result != null) {

                session.setAttribute("user_logged", result);

                response.sendRedirect(Configs.getMainUrlHome());

            } else {
                magnaApp.addMsgError("Email ou senha estão inválidos!");
            }

        } catch (Exception e) {
            magnaApp.addMsgError(e.getMessage());
        }
    }
%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <title>Login | MAGNA</title>

        <!-- Magna Imports -->
        <%@ include file="inc/header-imports.jsp" %>

    </head>
    <body>

        <div class="container">
            <div class="panel-main -login">
                <div class="row">

                    <div class="col-12">

                        <div class="login">
                            <h4>Faça Login</h4>

                            <%= magnaApp.getMsgHTML()%>

                            <form class="form-data -block" action="" method="post">

                                <div class="group">
                                    <label class="label" for="idEmail">Email<span class="required">*</span></label>
                                    <input class="field" id="idEmail" type="email" name="email" value="${param.email}" placeholder="Insira o seu email aqui ...">
                                </div>

                                <div class="group">
                                    <label class="label" for="idPass">Senha<span class="required">*</span></label>
                                    <input class="field" id="idPass" type="password" name="pass" placeholder="Insira a sua senha aqui ...">
                                </div>

                                <div class="group">
                                    <button class="btn -success" type="submit" name="btnLogin">Entrar</button>
                                </div>

                                <!--<a href="cadastrar.html">Cadastra-se!</a>-->

                            </form>
                        </div>

                    </div>

                </div>
            </div>
        </div>

    </body>
</html>