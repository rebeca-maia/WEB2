<%@page import="general.Configs"%>
<%@page import="general.App"%>
<%@page import="model.Address"%>
<%@page import="dao.AddressDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <base href="<%= Configs.getMainUrl()%>"/>

        <title>Endereço | MAGNA</title>

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
                                <li class="item"><a href="<%= Configs.getUrlAddressListAll()%>"><i class="fa fa-caret-right" aria-hidden="true"></i>Lista de Endereços</a></li>
                                <li class="item"><i class="fa fa-caret-right" aria-hidden="true"></i> Endereço</li>
                            </ul>
                        </div>
                    </div>
                </div>

                <div class="container">

                    <div class="panel-main">

                        <h3>Endereço</h3>

                        <div class="row">
                            <div class="col-6">

                                <%
                                    // Id do registro atual
                                    int id = (request.getParameter("id") != null && !request.getParameter("id").isEmpty()) ? Integer.parseInt(request.getParameter("id")) : 0;

                                    AddressDAO dao = new AddressDAO();
                                    Address result = dao.selectOne(id);

                                    if (result != null) {
                                %>
                                <p><strong>ID:</strong> <%= result.getIdEndereco()%></p>
                                <p><strong>Rua</strong> <%= result.getRua()%></p>
                                <p><strong>Número</strong> <%= result.getNumero()%></p>
                                <p><strong>Bairro</strong> <%= result.getBairro()%></p>
                                <p><strong>Complemento</strong> <%= result.getComplemento()%></p>
                                <p><strong>CEP</strong> <%= result.getCep()%></p>
                                <p><strong>Cidade</strong> <%= result.getCidade()%></p>
                                <p><strong>Estado</strong> <%= result.getEstado()%></p>
                                <p><strong>País</strong> <%= result.getPais()%></p>

                                <a href="<%= Configs.getUrlAddressEdit(result.getIdEndereco())%>" class="btn -success"><i class="fa fa-pencil-square"></i> Editar</a>

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