<%@page import="general.App"%>
<%@page import="general.Configs"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");%>
<%
    App magnaApp = new App(request.getParameter("view"));

    // Verificando se não esta logado
    if (!magnaApp.isLoggedIn(session.getAttribute("user_logged"))) {
        response.sendRedirect(Configs.getMainUrl() + "login.jsp");
    }
%>
<jsp:include page="<%= magnaApp.getView()%>" />