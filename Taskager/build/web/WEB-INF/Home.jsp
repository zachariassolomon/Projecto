<%-- 
    Document   : Home
    Created on : 26/jun/2017, 17:10:09
    Author     : joao
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <title>Taskager</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <!-- Optional theme -->
        <!--<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">-->

        <!-- Compiled and minified FontAwesome CSS -->
        <!--<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">-->
        <style>
            a:link{
                text-decoration:none;
            }
        </style>
    </head>

    <body style="background-color:#8ec2da;">

        <nav class="navbar navbar-inverse"><!--#337ab7-->
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="Index" style="color:white;">
                        <span class="glyphicon glyphicon-tasks"></span> &nbsp;Taskager
                    </a>
                </div>
                <ul class="nav navbar-nav navbar-right">                    
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#" style="color:white;">
                            <span class="glyphicon glyphicon-user"></span>&nbsp; ${request.getParameter("username")}
                            <span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="#"><span class="glyphicon glyphicon-cog"></span> &nbsp;O meu perfil</a></li>
                            <li><a href="Index"><span class="glyphicon glyphicon-log-out"></span> &nbsp;Sair</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="container">
            <div class="row">                
                <h1>Projetos recentes</h1>
                <br>
                <!--<hr style="border:1px solid black; background-color:black;">-->
                <c:forEach var="project" items="${recentProjects}">
                    <div class="col-sm-4">
                        <div class="panel panel-info" onmouseenter="this.style.border='2px solid black'"
                             onmouseleave="this.style.border='0px solid black'"
                             onclick="window.location.href = window.location.href.slice(0,window.location.href.length-4) 
                                         + 'Project/project_name='+${recentProjects[0]}">
                            <header class="panel-heading">
                                <a href="Project?project_name=${project[0]}"><h2 style="color:black" class="panel-title">${project[0]}</h2></a>
                            </header>
                            <section class="panel-body">
                                <p style="text-align:right">${project[1]}</p>
                            </section>
                        </div>
                    </div>
                </c:forEach>
            </div>


            <br>

            <div class="row">
                <h1>Todos os projetos</h1>
                <br>
                
                <!--<hr style="border:1px solid black; background-color:black;">
                <div class="col-sm-3">
                    <a style="font-size:500%;" class="navbar-brand" data-toggle="modal" data-target="#myModal">
                        &nbsp;&nbsp;&nbsp;
                        <span class="glyphicon glyphicon-plus"></span>
                    </a>
                </div>-->
                
                <!--<hr style="border:1px solid black; background-color:black;">-->
                <div class="col-sm-3">
                    <div class="panel panel-primary">
                        <header class="panel-heading">
                            <a style="color:white" data-toggle="modal" data-target="#myModal">
                                <h2 class="panel-title">
                                    <!--<span class="glyphicon glyphicon-plus">&nbsp;</span>-->
                                    Novo projeto</h2>
                            </a>
                        </header>
                        <section class="panel-body">
                            <a style="font-size:330%; margin-top:30px;" data-toggle="modal" data-target="#myModal">
                                <!--&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-->
                                <span style="margin-left:40%;" class="glyphicon glyphicon-plus"></span>
                                <!--&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-->
                            </a>
                        </section>
                    </div>
                </div>
                <c:forEach var="project" items="${projects}">
                    <div class="col-sm-3">
                        <div class="panel panel-primary">
                            <header class="panel-heading">
                                <a href="Project?project_name=${project[0]}"><h2 style="color:white" class="panel-title">${project[0]}</h2></a>
                            </header>
                            <section class="panel-body">
                                <p style="text-align:left">${project[1]}</p>
                            </section>
                        </div>
                    </div>                    
                </c:forEach>
            </div>
        </div>

        <!-- Modal -->
        <div class="modal fade" id="myModal" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Criar novo projeto</h4>
                    </div>
                    <div class="modal-body">
                        <form id="new_project" action="Project" method="post">
                            <div class="form-group">
                                <label for="project_name">Título:</label>
                                <input type="text" id="project_name" class="form-control" name="titulo" value="" required="required" placeholder="Título do projeto">
                            </div>
                            <div class="form-group">
                                <label for="project_description">Descrição:</label>
                                <textarea class="form-control" rows="4" cols="76" name="descricao" form="new_project" required="required" placeholder="Descrição do projeto"></textarea>
                            </div>
                            <button class="btn btn-default btn-success">Criar projeto</button>
                        </form>
                    </div>
                    <!--<div class="modal-footer">
                        <button type="button" class="btn btn-default btn-danger" data-dismiss="modal">Cancelar</button>
                    </div>-->
                </div>

            </div>
        </div>
    </body>
</html>

