<%-- 
    Document   : ProjectAux
    Created on : 29/jun/2017, 14:10:37
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
        
        <script>
            
            function func2(task, times){
                document.getElementById(task).style.backgroundColor = 'white';
                if (times!=0) this.setTimeout(func, 100, task, times-1);
            }
            function func(task, times){
                document.getElementById(task).style.backgroundColor = '#337ab7';
                this.setTimeout(func2, 100, task, times);
            }
        </script>
        
        <script>
            $(document).ready(function(){
                $('[data-toggle="tooltip"]').tooltip(); 
                $('[data-toggle="popover"]').popover(); 

            });
        </script>
        
        <style>

            div.scrollmenu {
                background-color: #333;
                overflow: auto;
                white-space: nowrap;
            }
            div.well{
                color:black;
            }
            div.well:hover{
                background-color:gray;
            }
            div.tasklist {
                display: inline-block;
                border: 2px solid black;
                color: white;
                vertical-align: text-top;
                text-decoration: none;
                margin-top:0px;
                height:auto;
                width:24.68%;
                /*width:33.05%;*/
                
            }

            @media (min-width:400px) and (max-width:699px){
                div.tasklist {
                    width:48.99%;
                }
            }

            @media (max-width:399px){
                div.scrollmenu div {
                    width:100%;
                }
            }

            div.scrollmenu a:hover {
                background-color: #777;
            }

            ::-webkit-scrollbar
            {
                width: 12px;  /* for vertical scrollbars */
                height: 12px; /* for horizontal scrollbars */
            }

            ::-webkit-scrollbar-track
            {
                background: #337ab7;
                border-radius:10px;
            }

            ::-webkit-scrollbar-thumb
            {
                background: rgba(0, 0, 0, 0.5);
                border-radius:10px;
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
                <ul class="nav navbar-nav navbar-left">                    
                    <li><li><a href="Home">Projetos</a></li></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">       
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#" style="color:white;">
                            <span class="glyphicon glyphicon-user"></span>&nbsp; João
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
        
        <div style="margin-left:1%;width:98%;">
            <div class="row">
                <div class="col-sm-10">
                    <h2 style="text-align:left">                
                        <span class="glyphicon glyphicon-folder-open" ></span>&nbsp;
                        <b><%=request.getParameter("project_name")%></b>
                        <span style="text-align:left; font-size:16px;">&nbsp;&nbsp;<%= request.getAttribute("project_description")%></span>
                    </h2>
                </div>
                <div class="col-sm-1">
                    <script>
                        function fillAndSubmitProjectForm(data){
                            document.getElementById('project_status').value = data;
                            document.getElementById('project_status_form').submit();
                        }
                    </script>
                    <div class="dropdown">
                        <!--<button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Em progresso-->
                        <%
                           String project_status = (String) request.getAttribute("project_status");
                           
                           if (project_status==null || project_status.equals("Em progresso")) out.println(
                                   "<button class=\"btn btn-primary dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\">Em progresso");
                           else if (project_status.equals("Fechado")) out.println(
                                   "<button class=\"btn dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\">Fechado");
                           if (project_status.equals("Parado")) out.println(
                                   "<button class=\"btn btn-danger dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\">Parado");
                        %>
                        <!--<button class="btn btn-danger dropdown-toggle" type="button" data-toggle="dropdown">Parado-->
                        <!--<button class="btn dropdown-toggle" type="button" data-toggle="dropdown">Fechado-->
                        <span class="caret"></span></button>
                        <ul class="dropdown-menu">
                            <li><a href="#" onclick="fillAndSubmitProjectForm(this.innerHTML)">Em progresso</a></li>
                            <li><a href="#" onclick="fillAndSubmitProjectForm(this.innerHTML)">Parado</a></li>
                            <li><a href="#" onclick="fillAndSubmitProjectForm(this.innerHTML)">Fechado</a></li>
                        </ul>
                    </div>
                    
                    <form id="project_status_form" action="Project">
                        <input type="hidden" name="project_name" value="<%=request.getParameter("project_name")%>">
                        <input id="project_status" type="hidden" name="project_status" value="subTask">
                    </form>
                </div>
                <div class="col-sm-1">
                    <!--<button class="btn btn-success" data-toggle="tooltip" data-placement="left" title="Todos os projetos" onclick="alert('projects')">Projetos</button>-->
                    <button class="btn btn-warning" style="margin-right:0%;"
                            data-toggle="modal" data-target="#shareModal" onclick="this.blur();">
                        Partilhar&nbsp;&nbsp;<span class="glyphicon glyphicon-share"></span></button>
                </div>
            </div>
            
            <br>
        </div>
        <br>

        <!--<div class="panel panel-info" style="width:30%; margin-left:15%">
            <header class="panel-heading">
                <h2 class="panel-title">Comprar almoço

                </h2>
            </header>
            <section class="panel-body">
                <style>
                    .well:hover{background-color:black}
                </style>
                <div class="well" onclick="$('#myModal1').modal('show');"><p>Comprar ALMOÇO</p></div>
                <div class="well" onclick="$('#myModal2').modal('show');"><p>Comprar JANTAR</p></div>
                <div class="well"><p>Third subtask</p></div>
                <div class="well"><p>Fourth subtask</p></div>
            </section>
        </div>-->


        
        <%
            String[] tasks = (String[]) request.getAttribute("tasks");
            String[] subTasks = (String[]) request.getAttribute("subTasks");
            String[] members = (String[]) request.getAttribute("members");
        %>

        
        <div class="col-sm-2">
            <nav id="myScrollspy">
                <ul class="nav nav-pills nav-stacked">
                    
                <li class="active" data-toggle="modal" data-target="#newTaskModal" >
                    <a href="#" style="font-size:20px;">Tarefas
                        <span title="Adicionar tarefa" class="glyphicon glyphicon-plus pull-right" 
                              data-toggle="tooltip" data-placement="bottom" title="Adicionar tarefa" style="font-size:25px;"></span>
                    </a>
                </li>
                    
                <c:forEach var ="task" items="${tasks}">
                    <!--<li><a onclick="func('${task}',1)" href="#${task}"><b>${task}</b></a></li>-->
                    <li><a onclick="func('${task}',1);this.style.color='black';" style="font-size:20px;" href="#${task}">${task}</a></li>
                    </c:forEach>
                </ul>
            </nav>
            <!--
            <p><a href="#haha1">HAHAHA 1</a></p>
            <p><a href="#haha2">HAHAHA 2</a></p>
            <p><a href="#haha3">HAHAHA 3</a></p>
            <p><a href="#haha4">HAHAHA 4</a></p>
            <br>
            <p><a href="#second">SECOND (2nd)</a></p>
            <p><a href="#first">FIRST (1st)</a></p>-->
            <br>
        </div>

        <div class="col-sm-10">
            <div style="background:none" class="scrollmenu">
   
                <c:forEach var ="task" items="${tasks}">
                    <div class="panel panel-primary tasklist" id="${task}">
                        <div class="panel-heading" data-toggle="tooltip" data-placement="top" 
                             title="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    PROPRIEDADES:  botão &#9881; &nbsp;&nbsp;&nbsp;&nbsp;NOVA SUB-TAREFA: botão + "
                             onclick="$(this).tooltip('hide');">
                            <b>${task}</b>
                            &nbsp;&nbsp;
                            <a href="#" style="color:white">
                                <span data-toggle="modal" data-target="#taskPropertiesModal${task.replaceAll(" ","")}"
                                      title="Propriedades da tarefa" class="glyphicon glyphicon-cog" style="font-size:20px;"
                                   ></span></a>
                            <a href="#" style="color:white">
                                <span data-toggle="modal" data-target="#newSubTaskModal${task.replaceAll(" ","")}" 
                                      title="Adicionar sub-tarefa" class="glyphicon glyphicon-plus-sign pull-right" style="font-size:20px;"
                                              ></span></a>
                        </div>
                        <div class="panel-body">
                            <c:forEach var ="subTask" items="${subTasks}">
                                <div class="well" style="width:98%;margin-left:1%; margin-bottom:4px;padding:5px;"
                                     onclick="$('#modal${subTask.replaceAll(" ","")}').modal('show')">
                                    <p>${subTask}</p>
                                </div>
                            </c:forEach>
                        </div>
                        <!--<div class="panel-footer">Adicionar sub-tarefa</div>-->
                      </div>
                </c:forEach>
            </div>
        </div>






        
            <!--<div class="modal fade" id="modal${task.replaceAll(" ","")}" role="dialog">
                <div class="modal-dialog modal-lg">
                    <div class="modal-content">
                        <div class="modal-header" style="background-color:#286090">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h3 class="modal-title" style="color:white">${task}</h3>
                        </div>
                        <div class="modal-body" style="background-color:lightgray">
                            <p><label>Data proposta:</label> 05/07/2017</p>
                            <p><label>Descrição:</label>
                                Something here</p>
                        </div>
                    </div>
                </div>
            </div>-->
        
        
        
        <!-- 
            MODAL: Criar nova tarefa
        -->
        
        <div class="modal fade" id="newTaskModal" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Criar tarefa</h4>
                    </div>
                    <div class="modal-body">
                        <form id="new_task" action="Project"> <!--onsubmit="alert(this.firstChild.value)"-->
                            <div class="form-group">
                                
                                <input type="hidden" id="project_name" class="form-control"  name="project_name" value="<%= request.getParameter("project_name") %>" required="required">
                                
                                <label for="project_name">Título:</label>
                                <input type="text" id="project_name" class="form-control" name="task_name" form="new_task" value="" required="required" placeholder="Título da tarefa">
                            </div>
                            <div class="form-group">
                                <label for="project_description">Descrição:</label>
                                <textarea class="form-control" rows="4" cols="76" name="task_description" form="new_task" required="required" placeholder="Descrição da tarefa"></textarea>
                            </div>
                            <div class="form-group">
                                <label for="project_description">Prioridade: </label> &nbsp;&nbsp;
                                <input type="number" min="0" max="7" name="task_priority" form="new_task" value="4" required="required" placeholder="0-7" style="width:40px;">
                                <div class="form-group"><label for="project_description">
                                    (Mínimo: 0<span class="glyphicon glyphicon-arrow-down"></span> 
                                    Máximo: 7<span class="glyphicon glyphicon-arrow-up"></span>) </label>
                                </div>  
                            </div> 
                            <button type="submit" class="btn btn-default btn-success">Adicionar</button>
                        </form>
                        
                    </div>
                    <!--<div class="modal-footer">
                        <button type="button" class="btn btn-default btn-danger" data-dismiss="modal">Cancelar</button>
                    </div>-->
                </div>

            </div>
        </div>
        
        
        
        <!-- 
            ------------------------------
            MODALS: Criar nova SUB-tarefa
            ------------------------------
            MODALS: Propriedades da tarefa
            ------------------------------
        -->
        
        <c:forEach var ="task" items="${tasks}">
            <!-- 
                ------------------------------
                MODALS: Criar nova SUB-tarefa
                ------------------------------
            -->
            <div class="modal fade" id="newSubTaskModal${task.replaceAll(" ","")}" role="dialog">
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header" style="background-color: lightgray;">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Criar sub-tarefa</h4>
                            <h5><label>Tarefa: </label> ${task}</h5>
                        </div>
                        <div class="modal-body">
                            <form id="new_subtask${task.replaceAll(" ","")}" action="Project"> <!--onsubmit="alert(this.firstChild.value)"-->
                                <div class="form-group">
                                    <input type="hidden" id="project_name" class="form-control"  name="project_name" value="<%= request.getParameter("project_name") %>" required="required">
                                    <input type="hidden" id="task_name" class="form-control"  name="task_name" value="${task.replaceAll(" ","")}" required="required">
                                    <label for="project_name">Título:</label>
                                    <input type="text" id="project_name" class="form-control" form="new_subtask${task.replaceAll(" ","")}" name="subtask_name" value="" required="required" placeholder="Título da sub-tarefa">
                                </div>
                                <div class="form-group">
                                    <label for="project_description">Descrição:</label>
                                    <textarea class="form-control" rows="4" cols="76" name="subtask_description" form="new_subtask${task.replaceAll(" ","")}" required="required" placeholder="Descrição da sub-tarefa"></textarea>
                                </div>
                                <button type="submit" class="btn btn-default btn-success">Adicionar</button>
                            </form>

                        </div>
                        <!--<div class="modal-footer">
                            <button type="button" class="btn btn-default btn-danger" data-dismiss="modal">Cancelar</button>
                        </div>-->
                    </div>

                </div>
            </div>
                                
            <!-- 
                ------------------------------
                MODALS: Propriedades da tarefa
                ------------------------------
            -->
            <div class="modal fade" id="taskPropertiesModal${task.replaceAll(" ","")}" role="dialog">
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header" style="background-color:lightgray;">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title" style="text-align: left">Propriedades de <b>${task}</b></h4>
                            <!--<h5><label>Tarefa: </label> ${task}</h5>-->
                        </div>
                        <div class="modal-body">
                            <div class="row" >
                                <div class="col-sm-6" style="text-align:right">
                                    <h5 style="font-size:16px;"><b>Título: </b></h5>
                                    <h5 style="font-size:16px;"><b>Descrição: </b></h5>
                                    <h5 style="font-size:16px;"><b>Data de criação: </b></h5>
                                    <h5 style="font-size:16px;"><b>Última modificação: </b></h5>
                                </div>
                                <div class="col-sm-6" style="text-align:left">
                                    <h5 style="font-size:16px;">${task}</h5>
                                    <h5 style="font-size:16px;">My awesome description</h5>
                                    <h5 style="font-size:16px;">27/06/2017</h5>
                                    <h5 style="font-size:16px;">03/07/2017</h5>
                                </div>
                            </div>
                            
                            <!--<form id="new_subtask${task.replaceAll(" ","")}" action="Project">
                                <div class="form-group">
                                    <input type="hidden" id="project_name" class="form-control"  name="project_name" value="<%= request.getParameter("project_name") %>" required="required">
                                    <input type="hidden" id="task_name" class="form-control"  name="task_name" value="${task.replaceAll(" ","")}" required="required">
                                    <label for="project_name">Título:</label>
                                    <input type="text" id="project_name" class="form-control" form="new_subtask${task.replaceAll(" ","")}" name="subtask_name" value="" required="required" placeholder="Título da sub-tarefa">
                                </div>
                                <div class="form-group">
                                    <label for="project_description">Descrição:</label>
                                    <textarea class="form-control" rows="4" cols="76" name="subtask_description" form="new_subtask${task.replaceAll(" ","")}" required="required" placeholder="Descrição da sub-tarefa"></textarea>
                                </div>
                                <button type="submit" class="btn btn-default btn-success">Adicionar</button>
                            </form>-->
                            
                        </div>
                        <!--<div class="modal-footer">
                            <button type="button" class="btn btn-default btn-danger" data-dismiss="modal">Cancelar</button>
                        </div>-->
                    </div>

                </div>
            </div>
        </c:forEach>
                                
                                
        
        <!-- 
            MODAL: Partilhar projeto
        -->
        
        <div class="modal fade" id="shareModal" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Partilhar ${request.getParameter("project_name")}</h4>
                    </div>
                    <div class="modal-body">
                        <form id="new_project" action="Project"> <!--onsubmit="alert(this.firstChild.value)"-->
                            <div class="form-group">
                                <input type="hidden" id="project_name" class="form-control"  name="project_name" value="<%= request.getParameter("project_name") %>" required="required">
                                <label for="person_name">Convidar utilizador(es)</label>
                                <input type="text" id="project_name" class="form-control" name="person_name" value="" required="required" placeholder="Exemplo: João, Pedro, Ana">
                            </div>
                            <button type="submit" class="btn btn-default btn-warning">Partilhar</button>
                        </form>
                        <hr>
                        <label for="users">Membros do projeto: </label>
                        <p style="font-size:18px;">
                            <c:forEach var ="member" items="${members}">
                                <!--<span data-toggle="tooltip" data-placement="bottom" title="${member}" class="label label-primary">${member}</span>-->
                                <span class="label label-primary">${member}</span>
                            </c:forEach>
                        </p>
                        
                    </div>
                    <!--<div class="modal-footer">
                        <button type="button" class="btn btn-default btn-danger" data-dismiss="modal">Cancelar</button>
                    </div>-->
                </div>

            </div>
        </div>
        
        
        
        
        <!-- 
            MODALS: propriedades das sub-tarefas 
        -->
        
        <c:forEach var ="subTask" items="${subTasks}">
            <div class="modal fade" id="modal${subTask.replaceAll(" ","")}" role="dialog">
                <div class="modal-dialog modal-lg">
                    <div class="modal-content">
                        <div class="modal-header" style="background-color:#286090">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h3 class="modal-title" style="color:white">${subTask}</h3>
                        </div>
                        <div class="modal-body" style="background-color:lightgray">
                            <div class="row">
                                <div class="col-sm-6">
                                    <p><label>Data proposta:</label> 05/07/2017</p>
                                    <p><label>Descrição:</label>
                                        A comida deve ser comprada no Continente.</p>
                                </div>
                                <div class="col-sm-6">
                                    <script>
                                        function fillAndSubmitForm(data){
                                            document.getElementById('subtask_status').value = data;
                                            document.getElementById('subtask_status_form').submit();
                                        }
                                    </script>
                                    <div class="dropdown">
                                        <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Em progresso
                                        <span class="caret"></span></button>
                                        <ul class="dropdown-menu">
                                            <li><a href="#" onclick="fillAndSubmitForm(this.innerHTML)">Em progresso</a></li>
                                            <li><a href="#" onclick="fillAndSubmitForm(this.innerHTML)">Parada</a></li>
                                            <li><a href="#" onclick="fillAndSubmitForm(this.innerHTML)">Fechada</a></li>
                                        </ul>
                                    </div>
                                    
                                    <form id="subtask_status_form" action="Project">
                                        <input type="hidden" name="subtask_name" value="${subTask}">
                                        <input id="subtask_status" type="hidden" name="subtask_status" value="subTask">
                                    </form>
                                </div>
                            </div>
                            
                            <hr style="border-bottom:2px solid white">
                            <div class="row">
                                <div class="col-sm-6">
                                    <div>
                                        <h4>Adicionar comentário</h4>
                                        <form id="new_comment" action="Project"> <!--onsubmit="alert(this.firstChild.value)"-->
                                            <div class="form-group">
                                                <textarea class="form-control" rows="4" cols="76" name="comment_text" required="required" placeholder="Escreva um comentário..."></textarea>
                                                <button type="submit" style="margin-top:6px;" class="btn btn-primary">Adicionar</button>
                                            </div>
                                        </form>
                                    </div>

                                    <hr>                        

                                    <h4>Comentários&nbsp;&nbsp;<span class="glyphicon glyphicon-comment"></span></h4>
                                    <div style="margin-top:0px; margin-bottom:0px;" >
                                        <label>João</label><small> (em 28/06/2017 às 16:45)</small>
                                        <div style="background-color:#286090;color:white;width:96%; margin-left:2%;margin-top:0px; margin-bottom:0px;padding-top:10px;padding-bottom:0px;" class="well">
                                            <p>O comentário que alguém fez pode ser bastante extenso, ocupando mais do que uma linha</p>
                                        </div>
                                    </div>

                                    <div style="margin-top:10px; margin-bottom:0px;" >
                                        <label>Gabriel</label><small> (em 28/06/2017 às 16:45)</small>
                                        <div style="background-color:#286090;color:white;width:96%; margin-left:2%;margin-top:0px; margin-bottom:0px;padding-top:10px;padding-bottom:0px;" class="well">
                                            <p>Comentário de uma só linha</p>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-sm-6" style="border-left:2px solid gray;">
                                    <div>
                                        <h4>Registar atividade</h4>
                                        <form id="new_activity" action="Project"> <!--onsubmit="alert(this.firstChild.value)"-->
                                            <div class="form-group">
                                                <label>Horas:</label> <input type="number" min="0" value="0" name="hours" required="required" style="width:50px;"></input>
                                                <label>&nbsp;Minutos: &nbsp;</label><input type="number" value="0" name="minutes" required="required" min="0" max="59" style="width:50px;"></input>
                                                <textarea style="margin-top:10px;" class="form-control" rows="2" cols="76" name="activity_text" required="required" placeholder="Introduza a descrição"></textarea>
                                                
                                                <button type="submit" style="margin-top:6px;" class="btn btn-primary">Registar</button>
                                            </div>
                                        </form>
                                    </div>

                                    <hr>

                                    <h4>Atividade&nbsp;&nbsp;<span class="glyphicon glyphicon-calendar"></span></h4>
                                    <div style="margin-top:10px; margin-bottom:0px;"  >
                                        <label>Pedro</label><small> (em 28/06/2017 às 16:45)</small>
                                        <div style="background-color:#286090;color:white;width:96%; margin-left:2%;margin-top:0px; margin-bottom:0px;padding-top:10px;padding-bottom:0px;" class="well">
                                            <label>Carga:</label> 2h00m
                                            <p><label>Descrição:</label> Fiz parte do front-end</p>
                                        </div>
                                    </div>

                                    <div style="margin-top:10px; margin-bottom:0px;"  >
                                        <label>João</label><small> (em 28/06/2017 às 16:45)</small>
                                        <div style="background-color:#286090;color:white;width:96%; margin-left:2%;margin-top:0px; margin-bottom:0px;padding-top:10px;padding-bottom:0px;" class="well">
                                            <label>Carga:</label> 1h30m
                                            <p><label>Descrição:</label> Fiz algo na camada de apresentação</p>
                                        </div>
                                    </div>

                                    <div style="margin-top:10px; margin-bottom:0px;"  >
                                        <label>Pedro</label><small> (em 28/06/2017 às 16:45)</small>
                                        <div style="background-color:#286090;color:white;width:96%; margin-left:2%;margin-top:0px; margin-bottom:0px;padding-top:10px;padding-bottom:0px;" class="well">
                                            <label>Carga:</label> 2h00m
                                            <p><label>Descrição:</label> Fiz parte do front-end</p>
                                        </div>
                                    </div>

                                    <div style="margin-top:10px; margin-bottom:0px;"  >
                                        <label>João</label><small> (em 28/06/2017 às 16:45)</small>
                                        <div style="background-color:#286090;color:white;width:96%; margin-left:2%;margin-top:0px; margin-bottom:0px;padding-top:10px;padding-bottom:0px;" class="well">
                                            <label>Carga:</label> 1h30m
                                            <p><label>Descrição:</label> Fiz algo na camada de apresentação</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
        
        
        <!--
        <div class="modal fade" id="myModal1" role="dialog">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header" style="background-color:#286090">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h3 class="modal-title" style="color:white">Comprar ALMOÇO</h3>
                    </div>
                    <div class="modal-body" style="background-color:lightgray">
                        <p><label>Data proposta:</label> 05/07/2017</p>
                        <p><label>Descrição:</label>
                            A comida deve ser comprada no Continente.</p>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal fade" id="myModal2" role="dialog">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header" style="background-color:#286090">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h3 class="modal-title" style="color:white">Comprar JANTAR</h3>
                    </div>
                    <div class="modal-body" style="background-color:lightgray">
                        <p><label>Data proposta:</label> 05/07/2017</p>
                        <p><label>Descrição:</label>
                            Dirigir-se ao Pingo Doce.</p>
                    </div>
                </div>
            </div>
        </div>
        -->
    </body>
</html>
