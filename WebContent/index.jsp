<%@page import="general.Configs"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
	if( session.getAttribute("id") == null ){
		response.sendRedirect( Configs.getMainUrl() + "login.jsp");
	}
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    
    <title>Painel | MAGNA</title>

    <!-- Magna Imports Header -->
    <%@ include file="inc/header-imports.jsp" %>

</head>
<body>

    <!-- Menu Main -->
    <%@ include file="inc/menu-main.jsp" %>
    <!-- //Menu Main -->

    <!-- Wrapper Main -->
    <div class="wrapper-main">
        
        <!-- Sidebar Main -->
        <%@ include file="inc/sidebar-main.jsp" %>
        <!-- //Sidebar Main -->

        <!-- Content Main -->
        <div class="content-main">

            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <ul class="breadcrumbs">
                            <!-- <li class="item"><a href="">Home<i class="fa fa-caret-right" aria-hidden="true"></i></a></li> -->
                            <li class="item"><i class="fa fa-caret-right" aria-hidden="true"></i> Home</li>
                        </ul>
                    </div>
                </div>
            </div>

            <div class="container">
                <div class="panel-main">

                    <h1>Página Inicial</h1>

                    <div class="row">
                        <div class="col-12">
                            
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer sit amet urna vel magna eleifend venenatis. Etiam eu enim luctus, varius eros eu, porta ante. Interdum et malesuada fames ac ante ipsum primis in faucibus. Maecenas at molestie metus. Nulla ac diam quis lacus molestie scelerisque non quis tellus. Cras sed odio enim. Nullam congue, elit nec egestas varius, elit purus porttitor mauris, id efficitur quam dolor vel magna. Fusce dictum lectus eros, molestie tempus augue pharetra sit amet. Mauris porta dui libero, in mattis magna egestas sed.</p>

                            <div class="row">
                                <div class="col-6">
                                    <div class="panel">
                                        <div class="head">
                                            Painel Secondário
                                        </div>

                                        <div class="content">
                                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer sit amet urna vel magna eleifend venenatis. Etiam eu enim luctus, varius eros eu, porta ante.</p>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-6">
                                    <div class="panel">
                                        <div class="head">
                                            Painel Secondário
                                        </div>

                                        <div class="content">
                                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer sit amet urna vel magna eleifend venenatis. Etiam eu enim luctus, varius eros eu, porta ante.</p>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <ul class="pagination">
                                <li class="item">
                                    <a href="#" aria-label="Previous">
                                        <span aria-hidden="true">&laquo;</span>
                                    </a>
                                </li>
                                <li class="item -active">1</li>
                                <li class="item"><a href="#">2</a></li>
                                <li class="item"><a href="#">3</a></li>
                                <li class="item"><a href="#">4</a></li>
                                <li class="item"><a href="#">5</a></li>
                                <li class="item">
                                    <a href="#" aria-label="Next">
                                        <span aria-hidden="true">&raquo;</span>
                                    </a>
                                </li>
                            </ul>

                        </div>
                    </div>

                </div>
            </div>

            <div class="container">
                <div class="panel-main">

                    <h1>Título de Exemplo</h1>

                    <div class="row">
                        <div class="col-6">
                            
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer sit amet urna vel magna eleifend venenatis. Etiam eu enim luctus, varius eros eu, porta ante. Interdum et malesuada fames ac ante ipsum primis in faucibus. Maecenas at molestie metus. Nulla ac diam quis lacus molestie scelerisque non quis tellus. Cras sed odio enim. Nullam congue, elit nec egestas varius, elit purus porttitor mauris, id efficitur quam dolor vel magna. Fusce dictum lectus eros, molestie tempus augue pharetra sit amet. Mauris porta dui libero, in mattis magna egestas sed.</p>

                        </div>

                        <div class="col-6">
                            
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer sit amet urna vel magna eleifend venenatis. Etiam eu enim luctus, varius eros eu, porta ante. Interdum et malesuada fames ac ante ipsum primis in faucibus. Maecenas at molestie metus. Nulla ac diam quis lacus molestie scelerisque non quis tellus. Cras sed odio enim. Nullam congue, elit nec egestas varius, elit purus porttitor mauris, id efficitur quam dolor vel magna. Fusce dictum lectus eros, molestie tempus augue pharetra sit amet. Mauris porta dui libero, in mattis magna egestas sed.</p>

                        </div>
                    </div>

                </div>
            </div>
            
        </div>
        <!-- //Content Main -->
        
    </div>
    <!-- //Wrapper Main -->
    
<%@ include file="inc/footer.jsp" %>