<%@page import="java.util.List"%>
<%@page import="general.Configs"%>
<%@page import="general.App"%>
<%@page import="model.Company"%>
<%@page import="dao.CompanyDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <base href="<%= Configs.getMainUrl()%>"/>

        <title>Empresa | MAGNA</title>

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
                                <li class="item"><i class="fa fa-caret-right" aria-hidden="true"></i> Empresa</li>
                            </ul>
                        </div>
                    </div>
                </div>

                <div class="container">

                    <div class="panel-main">

                        <h3>Empresa</h3>

                        <div class="row">
                            <div class="col-6">

                                <%
                                    // Id do registro atual
                                    int id = (request.getParameter("id") != null && !request.getParameter("id").isEmpty()) ? Integer.parseInt(request.getParameter("id")) : 0;

                                    CompanyDAO dao = new CompanyDAO();
                                    Company result = dao.selectOne(id);

                                    if (result != null) {
                                %>
                                <p><strong>ID:</strong> <%= result.getIdCompanay()%></p>
                                <p><strong>Tipo:</strong> <%= result.getTipo()%></p>
                                <p><strong>CNPJ:</strong> <%= result.getCnpj()%></p>
                                <p><strong>Razão Social:</strong> <%= result.getRazaoSocial()%></p>
                                <p><strong>Nome Fantasia:</strong> <%= result.getNomeFantasia()%></p>
                                <p><strong>Email:</strong> <%= result.getEmail()%></p>

                                <br>
                                <h5>Endereço</h5>
                                <p><strong>ID:</strong> <%= result.getEndereco().getIdEndereco()%></p>
                                <p><strong>Rua:</strong> <%= result.getEndereco().getRua()%></p>
                                <p><strong>Número:</strong> <%= result.getEndereco().getRua()%></p>
                                <p><strong>Bairro:</strong> <%= result.getEndereco().getBairro()%></p>
                                <p><strong>Complemento:</strong> <%= result.getEndereco().getComplemento()%></p>
                                <p><strong>CEP:</strong> <%= result.getEndereco().getCep()%></p>
                                <p><strong>Cidade:</strong> <%= result.getEndereco().getCidade()%></p>
                                <p><strong>Estado:</strong> <%= result.getEndereco().getEstado()%></p>
                                <p><strong>País:</strong> <%= result.getEndereco().getPais()%></p>

                                <a href="<%= Configs.getUrlCompanyEdit(result.getIdCompanay())%>" class="btn -success"><i class="fa fa-pencil-square"></i> Editar</a>

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