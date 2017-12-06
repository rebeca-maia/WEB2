<%@page import="general.Configs"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <base href="<%= Configs.getMainUrl()%>"/>

        <title>Editar Endereço | MAGNA</title>

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
                                <li class="item"><i class="fa fa-caret-right" aria-hidden="true"></i> Editar Endereço</li>
                            </ul>
                        </div>
                    </div>
                </div>

                <div class="container">

                    <div class="panel-main">
                        <h1>Editar Endereço</h1>

                        <div class="row">
                            <div class="col-6">

                                <form class="form-data -block" action="" method="post">

                                    <div class="group">
                                        <label class="label" for="rua">Rua<span class="required">*</span></label>
                                        <input class="field" id="rua" type="text" name="rua" value="R. Felipe Santiago" required="">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="num">Número<span class="required">*</span></label>
                                        <input class="field" id="num" type="text" name="num" value="257" required="">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="bairro">Bairro<span class="required">*</span></label>
                                        <input class="field" id="bairro" type="text" name="bairro" value="Vila Matoso">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="complemento">Complemento</label>
                                        <input class="field" id="complemento" type="text" name="complemento" value="Próximo a Policlínica">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="cep">CEP<span class="required">*</span></label>
                                        <input class="field cep" id="cep" type="text" name="cep" value="62900-000" required="">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="cidade">Cidade<span class="required">*</span></label>
                                        <input class="field" id="cidade" type="text" name="cidade" value="Russas" required="">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="estado">Estado<span class="required">*</span></label>
                                        <input class="field" id="estado" type="text" name="estado" value="Ceará" required="">
                                    </div>

                                    <div class="group">
                                        <label class="label" for="pais">País<span class="required">*</span></label>
                                        <input class="field" id="pais" type="text" name="pais" value="Brasil" required="">
                                    </div>

                                    <div class="group">
                                        <button class="btn -success" type="submit" name="btnSubmit">Editar</button>
                                    </div>

                                </form>

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