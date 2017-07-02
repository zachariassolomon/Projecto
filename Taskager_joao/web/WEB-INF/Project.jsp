<%-- 
    Document   : Project
    Created on : 26/jun/2017, 22:43:10
    Author     : joao
--%>

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

        <h1><%=request.getParameter("project_name")%></h1>
        <h2><%= request.getAttribute("project_description")%></h2>
        <br><br><br><br>

        <div class="panel panel-info" style="width:30%; margin-left:15%">
            <header class="panel-heading">
                <h2 class="panel-title">Comprar almoço
                    <span><button type="button" class="btn btn-info btn-lg pull-right" data-toggle="modal" data-target="#myModal1">
                            Almoço
                        </button></span>
                    <span><button type="button" class="btn btn-info btn-lg pull-right" data-toggle="modal" data-target="#myModal2">
                            Jantar
                        </button></span>
                </h2>
            </header>
            <section class="panel-body">
                <p>Subtask description</p>
                <p>Subtask description</p>
            </section>
        </div>


        <!-- Modal -->
        <div class="modal fade" id="myModal1" role="dialog">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header" style="background-color:#286090">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h3 class="modal-title" style="color:white">Comprar almoço</h3>
                    </div>
                    <div class="modal-body" style="background-color:lightgray">
                        <p><label>Data proposta:</label> 05/07/2017</p>
                        <p><label>Descrição:</label>
                            A comida deve ser comprada no Continente.</p>
                        <hr style="border-bottom:2px solid white">
                        <div class="row">
                            <div class="col-sm-6">
                                <div>
                                    <h4>Adicionar comentário</h4>
                                    <textarea class="form-control" rows="4" cols="76" name="comment_text" required="required" placeholder="Escreva um comentário..."></textarea>
                                    <button type="button" style="margin-top:6px;" class="btn btn-primary" data-dismiss="modal">Adicionar</button>
                                </div>
                                    
                                <hr>                        

                                <h4>Comentários</h4>
                                <div style="margin-top:0px; margin-bottom:0px;" >
                                    <label>João</label><small> (em 28/06/2017 às 16:45)</small>
                                    <div style="width:96%; margin-left:2%;margin-top:0px; margin-bottom:0px;padding-top:10px;padding-bottom:0px;" class="well">
                                        <p>O comentário que alguém fez pode ser bastante extenso, ocupando mais do que uma linha</p>
                                    </div>
                                </div>

                                <div style="margin-top:10px; margin-bottom:0px;" >
                                    <label>Gabriel</label><small> (em 28/06/2017 às 16:45)</small>
                                    <div style="width:96%; margin-left:2%;margin-top:0px; margin-bottom:0px;padding-top:10px;padding-bottom:0px;" class="well">
                                        <p>Comentário de uma só linha</p>
                                    </div>
                                </div>
                            </div>
                            
                            <div class="col-sm-6" style="border-left:2px solid gray;">
                                <div>
                                    <h4>Registar atividade</h4>
                                    <label>Horas:</label> <input type="number" min="0" style="width:50px;"></input> <label>&nbsp;Minutos: &nbsp;</label><input type="number" min="0" max="59" style="width:50px;"></input>
                                    <br>
                                    <textarea style="margin-top:10px;" class="form-control" rows="2" cols="76" name="comment_text" required="required" placeholder="Introduza a descrição"></textarea>
                                    <button type="button" style="margin-top:6px;" class="btn btn-primary" data-dismiss="modal">Registar</button>
                                </div>
 
                                <hr>

                                <h4>Atividade</h4>
                                <div style="margin-top:10px; margin-bottom:0px;"  >
                                    <label>Pedro</label><small> (em 28/06/2017 às 16:45)</small>
                                    <div style="width:96%; margin-left:2%;margin-top:0px; margin-bottom:0px;padding-top:10px;padding-bottom:0px;" class="well">
                                        <label>Carga:</label> 2h00m
                                        <p><label>Descrição:</label> Fiz parte do front-end</p>
                                    </div>
                                </div>

                                <div style="margin-top:10px; margin-bottom:0px;"  >
                                    <label>João</label><small> (em 28/06/2017 às 16:45)</small>
                                    <div style="width:96%; margin-left:2%;margin-top:0px; margin-bottom:0px;padding-top:10px;padding-bottom:0px;" class="well">
                                        <label>Carga:</label> 1h30m
                                        <p><label>Descrição:</label> Fiz algo na camada de apresentação</p>
                                    </div>
                                </div>
                                
                                <div style="margin-top:10px; margin-bottom:0px;"  >
                                    <label>Pedro</label><small> (em 28/06/2017 às 16:45)</small>
                                    <div style="width:96%; margin-left:2%;margin-top:0px; margin-bottom:0px;padding-top:10px;padding-bottom:0px;" class="well">
                                        <label>Carga:</label> 2h00m
                                        <p><label>Descrição:</label> Fiz parte do front-end</p>
                                    </div>
                                </div>

                                <div style="margin-top:10px; margin-bottom:0px;"  >
                                    <label>João</label><small> (em 28/06/2017 às 16:45)</small>
                                    <div style="width:96%; margin-left:2%;margin-top:0px; margin-bottom:0px;padding-top:10px;padding-bottom:0px;" class="well">
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
                            A comida deve ser comprada no Continente.</p>
                        <hr style="border-bottom:2px solid white">
                        <div class="row">
                            <div class="col-sm-6">
                                <div>
                                    <h4>Adicionar comentário</h4>
                                    <textarea class="form-control" rows="4" cols="76" name="comment_text" required="required" placeholder="Escreva um comentário..."></textarea>
                                    <button type="button" style="margin-top:6px;" class="btn btn-primary" data-dismiss="modal">Adicionar</button>
                                </div>
                                    
                                <hr>                        

                                <h4>Comentários</h4>
                                <div style="margin-top:10px; margin-bottom:0px;" >
                                    <label>Gabriel</label><small> (em 28/06/2017 às 16:45)</small>
                                    <div style="width:96%; margin-left:2%;margin-top:0px; margin-bottom:0px;padding-top:10px;padding-bottom:0px;" class="well">
                                        <p>Comentário de uma só linha</p>
                                    </div>
                                </div>
                            </div>
                            
                            <div class="col-sm-6" style="border-left:2px solid gray;">
                                <div>
                                    <h4>Registar atividade</h4>
                                    <label>Horas:</label> <input type="number" min="0" style="width:50px;"></input> <label>&nbsp;Minutos: &nbsp;</label><input type="number" min="0" max="59" style="width:50px;"></input>
                                    <br>
                                    <textarea style="margin-top:10px;" class="form-control" rows="2" cols="76" name="comment_text" required="required" placeholder="Introduza a descrição"></textarea>
                                    <button type="button" style="margin-top:6px;" class="btn btn-primary" data-dismiss="modal">Registar</button>
                                </div>
 
                                <hr>

                                <h4>Atividade</h4>
                                <div style="margin-top:10px; margin-bottom:0px;"  >
                                    <label>João</label><small> (em 28/06/2017 às 16:45)</small>
                                    <div style="width:96%; margin-left:2%;margin-top:0px; margin-bottom:0px;padding-top:10px;padding-bottom:0px;" class="well">
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


        <script>
            $(document).ready(function () {
                $('#myModal1').modal('show');
            });
        </script>

    </body>
</html>
