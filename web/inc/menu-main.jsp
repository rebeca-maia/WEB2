<%@page import="general.Configs"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="nav-bar -default">
    <div class="container">

        <div class="brand">
            MAGNA
        </div>

        <ul class="list-items">


            <li class="item">
                <a class="btn-drop" href="#"><i class="fa fa-user" aria-hidden="true"></i><%= session.getAttribute("nome")%> <i class="fa fa-caret-down" aria-hidden="true"></i></a>
                <ul class="dropdown">
                    <li class="item"><a href="#">Meu Perfil</a></li>
                    <li class="item"><a href="<%= Configs.getMainUrl()%>logout.jsp">Sair</a></li>
                </ul>
            </li>

        </ul>

    </div>
</div>