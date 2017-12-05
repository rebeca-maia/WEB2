<%@page import="general.Configs"%>
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
                                <p><strong>ID:</strong> 1</p>
                                <p><strong>Rua</strong> R. Felipe Santiago</p>
                                <p><strong>Número</strong> 257</p>
                                <p><strong>Bairro</strong> Vila Matoso</p>
                                <p><strong>Complemento</strong> Próximo a Policlínica</p>
                                <p><strong>CEP</strong> 62900-000</p>
                                <p><strong>Cidade</strong> Russas</p>
                                <p><strong>Estado</strong> Ceará</p>
                                <p><strong>País</strong> Brasil</p>

                                <a href="<%= Configs.getUrlAddressEdit("1")%>" class="btn -success"><i class="fa fa-pencil-square"></i> Editar</a>
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