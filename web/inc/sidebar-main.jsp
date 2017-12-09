<%@page import="general.Configs"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="sidebar-main nav-bar -sidebar">

    <ul class="list-items">

        <li class="item"><a href="<%= Configs.getMainUrlHome()%>"><i class="fa fa-home" aria-hidden="true"></i>Início</a></li>

        <li class="item">
            <a class="btn-drop" href="#"><i class="fa fa-user" aria-hidden="true"></i>Empresa <i class="fa fa-caret-down" aria-hidden="true"></i></a>
            <ul class="dropdown">
                <li class="item"><a href="<%= Configs.getUrlCompanyListAll()%>"><i class="fa fa-list" aria-hidden="true"></i>Listar</a></li>
                <li class="item"><a href="<%= Configs.getUrlCompanyRegister()%>"><i class="fa fa-sign-in" aria-hidden="true"></i>Cadastrar</a></li>
            </ul>
        </li>

        <li class="item">
            <a class="btn-drop" href="#"><i class="fa fa-map-marker" aria-hidden="true"></i>endereço <i class="fa fa-caret-down" aria-hidden="true"></i></a>
            <ul class="dropdown">
                <li class="item"><a href="<%= Configs.getUrlAddressListAll()%>"><i class="fa fa-list" aria-hidden="true"></i>Listar</a></li>
                <li class="item"><a href="<%= Configs.getUrlAddressRegister()%>"><i class="fa fa-sign-in" aria-hidden="true"></i>Cadastrar</a></li>
            </ul>
        </li>

        <li class="item"><a href="<%= Configs.getUrlNavigationMap()%>"><i class="fa fa-map" aria-hidden="true"></i>Mapa de Navegação</a></li>

        <!--        <li class="item">
                    <a class="btn-drop" href="#"><i class="fa fa-diamond" aria-hidden="true"></i>Ofertas<i class="fa fa-caret-down" aria-hidden="true"></i></a>
                    <ul class="dropdown">
                        <li class="item"><a href="index.jsp?view=offer-list"><i class="fa fa-list" aria-hidden="true"></i>Listar</a></li>
                        <li class="item"><a href="index.jsp?view=offer-register"><i class="fa fa-sign-in" aria-hidden="true"></i>Cadastrar</a></li>
                    </ul>
                </li>-->

    </ul>

</div>