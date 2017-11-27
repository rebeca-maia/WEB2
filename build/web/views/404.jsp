<%@page import="general.Configs"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container">
    <div class="row">
        <div class="col-12">
            <ul class="breadcrumbs">
                <li class="item"><a href="<%= Configs.getMainUrlHome()%>"><i class="fa fa-caret-right" aria-hidden="true"></i>Início</a></li>
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