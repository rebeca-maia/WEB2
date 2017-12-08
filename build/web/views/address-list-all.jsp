<%@page import="general.Configs"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <base href="<%= Configs.getMainUrl()%>"/>

        <title>Lista de Endereços | MAGNA</title>

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
                                <li class="item"><i class="fa fa-caret-right" aria-hidden="true"></i> Lista de Endereços</li>
                            </ul>
                        </div>
                    </div>
                </div>

                <div class="container">

                    <div class="panel-main">
                        <h1>Lista de Endereços</h1>

                        <div class="row">
                            <div class="col-12">

                                <table class="table">

                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>Rua</th>
                                            <th>Número</th>
                                            <th>CEP</th>
                                            <th>Cidade</th>
                                            <th>Estado</th>
                                            <th>País</th>
                                            <th class="actions">Ações</th>
                                        </tr>
                                    </thead>

                                    <tbody>

                                        <tr>
                                            <td>1</td>
                                            <td>R. Felipe Santiago</td>
                                            <td>257</td>
                                            <td>62900-000</td>
                                            <td>Russas</td>
                                            <td>CE</td>
                                            <td>Brasil</td>
                                            <td class="actions">
                                                <a href="<%= Configs.getUrlAddressListOne("1")%>" class="btn -primary"><i class="fa fa-eye"></i></a>
                                                <a href="<%= Configs.getUrlAddressEdit("1")%>" class="btn -success"><i class="fa fa-pencil-square"></i></a>
                                                <a href="<%= Configs.getUrlAddressDelete("1")%>" class="btn -danger btn-delete"><i class="fa fa-minus-circle"></i></a>
                                            </td>
                                        </tr>

                                        <tr>
                                            <td colspan="8"><b>1 registro(s) encontrado(s).</b></td>
                                        </tr>

                                    </tbody>

                                </table>

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