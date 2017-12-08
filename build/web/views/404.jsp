<%@page import="general.Configs"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <base href="<%= Configs.getMainUrl()%>"/>

        <title>Painel | MAGNA</title>

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
                                <li class="item"><a href=""><i class="fa fa-caret-right" aria-hidden="true"></i>Início</a></li>
                                <li class="item"><i class="fa fa-caret-right" aria-hidden="true"></i> Erro 404</li>
                            </ul>
                        </div>
                    </div>
                </div>

                <div class="container">
                    <div class="panel-main">
                        <h1>Erro 404</h1>

                        <div class="row">
                            <div class="col-12">
                                <h4><i class="fa fa-warning"></i> Oops! Página não encontrada.</h4>
                                <p>Não conseguimos encontrar a página que estava procurando. Retorne ao <a href="<%= Configs.getMainUrlHome()%>">página inicial.</a></p>
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