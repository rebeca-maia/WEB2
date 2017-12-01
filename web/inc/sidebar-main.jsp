<%@page import="general.Configs"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="sidebar-main nav-bar -sidebar">

    <ul class="list-items">

        <li class="item"><a href="<%= Configs.getMainUrlHome()%>"><i class="fa fa-home" aria-hidden="true"></i>Home</a></li>

        <li class="item">
            <a class="btn-drop" href="#"><i class="fa fa-user" aria-hidden="true"></i>Usuário <i class="fa fa-caret-down" aria-hidden="true"></i></a>
            <ul class="dropdown">
                <li class="item"><a href="#"><i class="fa fa-sign-in" aria-hidden="true"></i>Cadastrar</a></li>
                <li class="item"><a href="#"><i class="fa fa-list" aria-hidden="true"></i>Listar</a></li>
            </ul>
        </li>

        <li class="item">
            <a class="btn-drop" href="#"><i class="fa fa-diamond" aria-hidden="true"></i>Ofertas<i class="fa fa-caret-down" aria-hidden="true"></i></a>
            <ul class="dropdown">
                <li class="item"><a href="#"><i class="fa fa-sign-in" aria-hidden="true"></i>Cadastrar</a></li>
                <li class="item"><a href="#"><i class="fa fa-list" aria-hidden="true"></i>Listar</a></li>
            </ul>
        </li>

    </ul>

</div>