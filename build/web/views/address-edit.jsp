<%@page import="general.Configs"%>
<%@page import="general.App"%>
<%@page import="model.Address"%>
<%@page import="dao.AddressDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    App magnaApp = new App();

    // Id do registro atual
    int id = (request.getParameter("id") != null && !request.getParameter("id").isEmpty()) ? Integer.parseInt(request.getParameter("id")) : 0;

    /**
     * -------------------------------------------------------------------------
     * | Processando a requisição
     * -------------------------------------------------------------------------
     */
    if (request.getParameter("btnSubmit") != null) {

        try {
            Address address = new Address();

            address.setIdEndereco(id);
            address.setRua(request.getParameter("rua"));
            address.setNumero(request.getParameter("numero"));
            address.setBairro(request.getParameter("bairro"));
            address.setComplemento(request.getParameter("complemento"));
            address.setCep(request.getParameter("cep"));
            address.setCidade(request.getParameter("cidade"));
            address.setEstado(request.getParameter("estado"));
            address.setPais(request.getParameter("pais"));

            AddressDAO dao = new AddressDAO();
            dao.update(address);

            magnaApp.addMsgSuccess("Registro editado com sucesso.");

        } catch (Exception e) {
            magnaApp.addMsgError(e.getMessage());
        }
    }
%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <base href="<%= Configs.getMainUrl()%>"/>

        <title>Editar Endereço | MAGNA</title>

        <!-- Magna Imports Header -->
        <%@ include file="../inc/header-imports.jsp" %>

    </head>
    <body>

        <!-- Menu Main -->
        <%@ include file="../inc/menu-main.jsp" %>
        <!-- //Menu Main -->

        <!-- Wrapper Main -->
        <div class="wrapper-main">

            <!-- Sidebar Main -->
            <%@ include file="../inc/sidebar-main.jsp" %>
            <!-- //Sidebar Main -->

            <!-- Content Main -->
            <div class="content-main">

                <!-- View -->
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <ul class="breadcrumbs">
                                <li class="item"><a href="<%= Configs.getMainUrlHome()%>"><i class="fa fa-caret-right" aria-hidden="true"></i>Início</a></li>
                                <li class="item"><i class="fa fa-caret-right" aria-hidden="true"></i> Editar Endereço</li>
                            </ul>
                        </div>
                    </div>
                </div>

                <div class="container">

                    <div class="panel-main">
                        <h1>Editar Endereço</h1>

                        <div class="row">
                            <div class="col-6">

                                <%
                                    AddressDAO dao = new AddressDAO();
                                    Address result = dao.selectOne(id);

                                    if (result != null) {
                                %>

                                <%= magnaApp.getMsgHTML()%>

                                <form class="form-data -block" action="" method="post">

                                    <div class="group">
                                        <label class="label" for="rua">Rua<span class="required">*</span></label>
                                        <input class="field" id="rua" type="text" name="rua" value="<%= result.getRua()%>" required="">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="numero">Número<span class="required">*</span></label>
                                        <input class="field" id="numero" type="text" name="numero" value="<%= result.getNumero()%>" required="">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="bairro">Bairro<span class="required">*</span></label>
                                        <input class="field" id="bairro" type="text" name="bairro" value="<%= result.getBairro()%>">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="complemento">Complemento</label>
                                        <input class="field" id="complemento" type="text" name="complemento" value="<%= result.getComplemento()%>">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="cep">CEP<span class="required">*</span></label>
                                        <input class="field cep" id="cep" type="text" name="cep" value="<%= result.getCep()%>" required="">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="cidade">Cidade<span class="required">*</span></label>
                                        <input class="field" id="cidade" type="text" name="cidade" value="<%= result.getCidade()%>" required="">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="estado">Estado<span class="required">*</span></label>
                                        <input class="field" id="estado" type="text" name="estado" value="<%= result.getEstado()%>" required="">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="pais">País<span class="required">*</span></label>
                                        <input class="field" id="pais" type="text" name="pais" value="<%= result.getPais()%>" required="">
                                    </div>

                                    <div class="group">
                                        <button class="btn -success" type="submit" name="btnSubmit">Editar</button>
                                    </div>

                                </form>
                                <%
                                } else {
                                %>
                                <div class="alert -danger">
                                    <ul>
                                        <li>Registro não encontrado!</li>
                                    </ul>
                                </div>
                                <%
                                    }
                                %>

                            </div>
                        </div>
                    </div>

                </div>
                <!-- //View -->

            </div>
            <!-- //Content Main -->

        </div>
        <!-- //Wrapper Main -->

        <%@ include file="../inc/footer.jsp" %>