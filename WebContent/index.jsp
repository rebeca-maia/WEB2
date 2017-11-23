<%@page import="controller.Main"%>
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
    <base href="<%= Configs.getMainUrl() %>"/>
    
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
        
        	<!-- View -->
        	<% String viewMain = controller.Main.getView(request.getParameter("page")); %>
        	<jsp:include page="<%= viewMain %>" flush="true" />
        	<!-- //View -->
            
        </div>
        <!-- //Content Main -->
        
    </div>
    <!-- //Wrapper Main -->
    
<%@ include file="inc/footer.jsp" %>