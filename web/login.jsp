<%@page import="general.Configs"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (session.getAttribute("id") != null) {
        response.sendRedirect(Configs.getMainUrl());
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
            <div class="panel-main">
                <div class="row">

                    <div class="col-6">
                        <h1>Magna</h1>

                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et leo lectus. Praesent neque diam, vestibulum at nisi id, pharetra hendrerit mi. Ut id placerat lacus, eget placerat lorem. Nunc tempor nulla sit amet velit dapibus malesuada ac non enim. Etiam sit amet commodo nisl. Pellentesque nec nulla congue, lobortis ex eu, rhoncus ex.</p>

                    </div>

                    <div class="col-2"></div>

                    <div class="col-4">

                        <div class="login">
                            <h4>Faça Login</h4>

                            <% String mess = "";
                                if (request.getAttribute("msgError") != null) {
                            %>
                            <div class="alert -danger"><%= request.getAttribute("msgError")%></div>
                            <%
                                }
                            %>

                            <form class="form-data -block" action="<%= Configs.getMainUrl() + "LoginServlet"%>" method="post">

                                <div class="group">
                                    <label class="label" for="idEmail">Email<span class="required">*</span></label>
                                    <input class="field" id="idEmail" type="email" name="email" value="${param.email}" placeholder="Insira o seu email aqui ...">
                                </div>

                                <div class="group">
                                    <label class="label" for="idPass">Senha<span class="required">*</span></label>
                                    <input class="field" id="idPass" type="password" name="pass" placeholder="Insira a sua senha aqui ...">
                                </div>

                                <div class="group">
                                    <button class="btn -success" type="submit">Entrar</button>
                                </div>

                                <a href="cadastrar.html">Cadastra-se!</a>

                            </form>
                        </div>

                    </div>

                </div>
            </div>
        </div>

    </body>
</html>
