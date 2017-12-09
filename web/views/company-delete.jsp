<%@page import="java.util.List"%>
<%@page import="general.Configs"%>
<%@page import="general.App"%>
<%@page import="model.Company"%>
<%@page import="dao.CompanyDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    App magnaApp = new App();

    // Id do registro atual
    int id = (request.getParameter("id") != null && !request.getParameter("id").isEmpty()) ? Integer.parseInt(request.getParameter("id")) : 0;

    try {

        CompanyDAO dao = new CompanyDAO();
        dao.delete(id);

        magnaApp.addMsgSuccess("Registro excluído com sucesso.");

    } catch (Exception e) {
        magnaApp.addMsgError(e.getMessage());
    }
%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <base href="<%= Configs.getMainUrl()%>"/>

        <title>Deletar Empresa | MAGNA</title>

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
                                <li class="item"><i class="fa fa-caret-right" aria-hidden="true"></i> Deletar Empresa</li>
                            </ul>
                        </div>
                    </div>
                </div>

                <div class="container">

                    <div class="panel-main">
                        <h1>Deletar Empresa</h1>

                        <div class="row">
                            <div class="col-12">
                                <%= magnaApp.getMsgHTML()%>
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