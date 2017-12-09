<%@page import="general.Configs"%>
<%@page import="general.App"%>
<%@page import="model.Company"%>
<%@page import="model.Address"%>
<%@page import="dao.CompanyDAO"%>
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
            Company company = new Company();
            Address address = new Address();

            int idEndereco = (request.getParameter("idEndereco") != null && !request.getParameter("idEndereco").isEmpty()) ? Integer.parseInt(request.getParameter("idEndereco")) : 0;
            address.setIdEndereco(idEndereco);

            company.setIdCompany(id);
            company.setEndereco(address);
            company.setTipo(request.getParameter("tipo"));
            company.setCnpj(request.getParameter("cnpj"));
            company.setRazaoSocial(request.getParameter("razao_social"));
            company.setNomeFantasia(request.getParameter("nome_fantasia"));
            company.setEmail(request.getParameter("email"));

            if (request.getParameter("senha1") != null && !request.getParameter("senha1").isEmpty()) {
                company.setSenha(request.getParameter("senha1"), request.getParameter("senha2"));
            }

            CompanyDAO dao = new CompanyDAO();
            dao.update(company);

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

        <title>Editar Empresa | MAGNA</title>

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
                                <li class="item"><a href="<%= Configs.getUrlCompanyListAll()%>"><i class="fa fa-caret-right" aria-hidden="true"></i>Lista de Empresas</a></li>
                                <li class="item"><i class="fa fa-caret-right" aria-hidden="true"></i> Editar Empresa</li>
                            </ul>
                        </div>
                    </div>
                </div>

                <div class="container">

                    <div class="panel-main">
                        <h1>Editar Empresa</h1>

                        <div class="row">
                            <div class="col-6">

                                <%
                                    CompanyDAO dao = new CompanyDAO();
                                    Company result = dao.selectOne(id);

                                    if (result != null) {
                                %>

                                <%= magnaApp.getMsgHTML()%>

                                <form class="form-data -block" action="" method="post">

                                    <div class="group">
                                        <label class="label" for="idEndereco">ID do Endereço<span class="required">*</span></label>
                                        <input class="field" id="idEndereco" type="text" name="idEndereco" value="<%= result.getEndereco().getIdEndereco()%>" required="">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="tipo">CNPJ<span class="required">*</span></label>
                                        <select class="field" id="tipo" name="tipo">
                                            <option value="FORNECEDOR" <%= (result.getTipo().equals("FORNECEDOR")) ? "selected" : ""%>>FORNECEDOR</option>
                                            <option value="CLIENTE" <%= (result.getTipo().equals("CLIENTE")) ? "selected" : ""%>>CLIENTE</option>
                                        </select>
                                    </div>

                                    <div class="group">
                                        <label class="label" for="cnpj">CNPJ<span class="required">*</span></label>
                                        <input class="field cnpj" id="cnpj" type="text" name="cnpj" value="<%= result.getCnpj()%>" required="">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="razao_social">Razão Social<span class="required">*</span></label>
                                        <input class="field" id="razao_social" type="text" name="razao_social" value="<%= result.getRazaoSocial()%>" required="">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="nome_fantasia">Nome Fantasia<span class="required">*</span></label>
                                        <input class="field" id="nome_fantasia" type="text" name="nome_fantasia" value="<%= result.getNomeFantasia()%>" required="">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="email">Email<span class="required">*</span></label>
                                        <input class="field" id="email" type="text" name="email" value="<%= result.getEmail()%>" required="">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="senha1">Senha</label>
                                        <input class="field" id="senha1" type="password" name="senha1" value="" placeholder="Deixe em branco caso não queira alterar">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="senha2">Confirme a Senha</label>
                                        <input class="field" id="senha2" type="password" name="senha2" value="">
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