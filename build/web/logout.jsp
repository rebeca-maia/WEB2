<%@page import="general.Configs"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    request.getSession().invalidate();
    response.sendRedirect(Configs.getMainUrl() + "login.jsp");
%>
