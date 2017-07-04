<%-- 
    Document   : Home
    Created on : 26/jun/2017, 17:10:09
    Author     : joao
--%>

<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="siaadao.User"%>
<%@page import="siaadao.User"%>
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
        <script>
            $(document).ready(function(){
                $('[data-toggle="tooltip"]').tooltip(); 
                $('[data-toggle="popover"]').popover(); 

            });
        </script>
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
                            <span class="glyphicon glyphicon-user"></span>&nbsp; <%= request.getAttribute("username")%>
                            <span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="Index?logout=true"><span class="glyphicon glyphicon-log-out"></span> &nbsp;Sair</a></li>
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
                        <div class="panel panel-info" >
                             <!--onmouseenter="this.style.border='2px solid black'"
                             onmouseleave="this.style.border='0px solid black'"
                             onclick="window.location.href = window.location.href.slice(0,window.location.href.length-4) 
                                         + 'Project/project_name='+${recentProjects[0]}">-->
                            <header class="panel-heading">
                                <a href="Tarefa?project_name=${project.getNome()}&project_description=${project.getDescricao()}"><h2 style="color:black" class="panel-title">${project.getNome()}</h2></a>
                            </header>
                            <section class="panel-body">
                                <p style="text-align:right;overflow: hidden;text-overflow: ellipsis;height:60px;">${project.getDescricao()}</p>
                            </section>
                        </div>
                    </div>
                </c:forEach>
            </div>


            <br>

            <div class="row">
                <div class="row">
                    <div class="col-sm-4">
                         <h1>Todos os projetos</h1>
                    </div>
                    <div class="col-sm-8">
                        <script>
                            function fillAndSubmitForm(data){
                                document.getElementById('projects_filter_status').value = data;
                                document.getElementById('projects_filter_form').submit();
                            }
                        </script>
                        <div class="dropdown">
                            <br><button class="btn btn-warning dropdown-toggle" type="button" data-toggle="dropdown">
                                <span class="glyphicon glyphicon-filter"></span> 
                                    <%= request.getAttribute("projects_filter_status")%>
                                     &nbsp;
                                <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu" style="background-color:lightgray;">
                                <li><a href="#" onclick="fillAndSubmitForm(this.innerHTML)">Todos os projetos</a></li>
                                <li><a href="#" onclick="fillAndSubmitForm(this.innerHTML)">Em progresso</a></li>
                                <li><a href="#" onclick="fillAndSubmitForm(this.innerHTML)">Parado</a></li>
                                <li><a href="#" onclick="fillAndSubmitForm(this.innerHTML)">Fechado</a></li>
                            </ul>
                        </div>

                        <form id="projects_filter_form" action="Login" method="post">
                            <input id="projects_filter_status" type="hidden" name="projects_filter_status">
                        </form>
                    </div>
                </div>
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
                    <div class="panel panel-primary"> <!--style="height:134.2px;">-->
                        <header class="panel-heading">
                            <a href="#" style="color:white" data-toggle="modal" data-target="#myModal">
                                <h2 class="panel-title">
                                    <!--<span class="glyphicon glyphicon-plus">&nbsp;</span>-->
                                    Novo projeto</h2>
                            </a>
                        </header>
                        <section class="panel-body"> <!--style="height:95.6px;">-->
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
                                
                                <div class="row">
                                    <div class="col-sm-10"  data-toggle="tooltip" data-placement="top" title="Abrir projeto '${project.getNome()}'">
                                        <a href="Tarefa?project_name=${project.getNome()}&project_description=${project.getDescricao()}">
                                            <h2 style="color:white" class="panel-title">${project.getNome()}</h2></a>
                                    </div>
                                    <div class="col-sm-2">
                                        <a href="#"><span class="glyphicon glyphicon-cog" data-toggle="modal" 
                                            data-target="#projectPropertiesModal${project.getNome().replaceAll(" ","")}"
                                            title="Propriedades do projeto" style="color:white"></span></a>
                                        
                                    </div>
                                </div>
                                
                               
                            </header>
                            <section class="panel-body"  style="height:95.6px;">
                                <p style="text-align:left;overflow: hidden;text-overflow: ellipsis;height:60px;">${project.getDescricao()}</p>
                            </section>
                        </div>
                    </div>     
                                     
                                     
                    <!-- 
                        ------------------------------
                        MODALS: Propriedades de projeto
                        ------------------------------
                    -->

                    <div class="modal fade" id="projectPropertiesModal${project.getNome().replaceAll(" ","")}" role="dialog">
                        <div class="modal-dialog">

                            <!-- Modal content-->
                            <div class="modal-content">
                                <div class="modal-header" style="background-color:lightgray;">
                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                    <h4 class="modal-title" style="text-align: left">Propriedades de <b>${project.getNome()}</b></h4>
                                    <!--<h5><label>Tarefa: </label> ${task}</h5>-->
                                </div>
                                <div class="modal-body">

                                    <div class="row" >
                                        <div class="col-sm-6" style="text-align:right">
                                            <h5 style="font-size:16px;"><b>Título: </b></h5>
                                        </div>
                                        <div class="col-sm-6" style="text-align:left">
                                            <h5 style="font-size:16px;">${project.getNome()}</h5>
                                        </div>
                                    </div>

                                    <div class="row" >
                                        <div class="col-sm-6" style="text-align:right">
                                            <h5 style="font-size:16px;"><b>Descrição: </b></h5>
                                        </div>
                                        <div class="col-sm-6" style="text-align:left">
                                            <h5 style="font-size:16px;text-overflow: ellipsis">${project.getDescricao()}</h5>  
                                        </div>
                                    </div>

                                    <div class="row" >
                                        <div class="col-sm-6" style="text-align:right">
                                            <h5 style="font-size:16px;"><b>Estado: </b></h5>
                                        </div>
                                        <div class="col-sm-6" style="text-align:left">
                                            <h5 style="font-size:16px;">${project.getEstado()}</h5>
                                        </div>
                                    </div>

                                    <div class="row" >
                                        <div class="col-sm-6" style="text-align:right">
                                            <h5 style="font-size:16px;"><b>Data de criação: </b></h5>
                                        </div>
                                        <div class="col-sm-6" style="text-align:left">
                                            <h5 style="font-size:16px;">${project.getData_criacaoString()}</h5>
                                        </div>
                                    </div>

                                    <div class="row" >
                                        <div class="col-sm-6" style="text-align:right">
                                            <h5 style="font-size:16px;"><b>Última modificação: </b></h5>
                                        </div>
                                        <div class="col-sm-6" style="text-align:left">
                                            <h5 style="font-size:16px;">${project.getLast_updatedString()}</h5>
                                        </div>
                                    </div>
                                        
                                    <div class="row" >
                                        <div class="col-sm-6" style="text-align:right">
                                            <h5 style="font-size:16px;"><b>Data de fecho: </b></h5>
                                        </div>
                                        <div class="col-sm-6" style="text-align:left">
                                            <h5 style="font-size:16px;">${project.getData_fimString()}</h5>
                                        </div>
                                    </div>

                                    <div class="row" >
                                        <div class="col-sm-6" style="text-align:right">
                                            <h5 style="font-size:16px;"><b>Membros: </b></h5>
                                        </div>
                                        <div class="col-sm-6" style="text-align:left">
                                            <span style="font-size:16px;">
                                            <c:forEach var="member" items="${project.getMembers()}">
                                                <span class="label label-primary">${member.getUsername()}</span>
                                            </c:forEach>
                                        </div>
                                    </div>

                                    <div class="row" >
                                        <div class="col-sm-6" style="text-align:right">
                                            <h5 style="font-size:16px;"><b>Tempo total de trabalho: </b></h5>
                                        </div>
                                        <div class="col-sm-6" style="text-align:left">
                                            <h5 style="font-size:16px;">${project.getTempoTrabalhoString()}</h5>
                                        </div>
                                    </div>

                                    <div class="row" >
                                        <div class="col-sm-6" style="text-align:right">
                                            <h5 style="font-size:16px;"><b>Tempo total por membro:</b></h5>
                                        </div>
                                        <div class="col-sm-6" style="text-align:left">
                                            <div class="table-responsive">          
                                                <table class="table table-hover">
                                                  <thead>
                                                    <tr>
                                                      <th>Membro</th>
                                                      <th>Tempo</th>
                                                    </tr>
                                                  </thead>
                                                  <tbody>

                                                    <c:forEach var="pair" items="${project.getTempos().entrySet()}">
                                                        <tr>
                                                          <td>${pair.getKey()}</td>
                                                          <td>${pair.getValue()}</td>
                                                        </tr>
                                                    </c:forEach>
                                                  </tbody>
                                                </table>
                                                </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

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
                        <form id="new_project" action="Project" method="post"> <!--onsubmit="alert(this.firstChild.value)"-->
                            <div class="form-group">
                                <label for="project_name">Título:</label>
                                <input type="text" id="project_name" class="form-control" name="project_name" value="" required="required" placeholder="Título do projeto">
                            </div>
                            <div class="form-group">
                                <label for="project_description">Descrição:</label>
                                <textarea class="form-control" rows="4" cols="76" name="project_description" form="new_project" required="required" placeholder="Descrição do projeto"></textarea>
                            </div>
                            <button type="submit" class="btn btn-default btn-success">Criar projeto</button>
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