<%-- 
    Document   : Index
    Created on : 26/jun/2017, 17:08:43
    Author     : joao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

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

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="Index" style="color:white;">
                        <span class="glyphicon glyphicon-tasks"></span> &nbsp;Taskager
                    </a>
                </div>
                <form class="navbar-form navbar-right" action="Login" method="post">
                <form class="navbar-form navbar-right" action="Index">
                    <div class="form-group">
                        <label style="color:white;">Já possui conta? Introduza aqui os seus dados!</label>&nbsp;
                        <% 
                            String login_ok = (String) request.getAttribute("login_ok");
                            
                            if (login_ok!=null && login_ok.equals("no"))
                                out.println("<span style=\"color:red\">Utilizador ou palavra-passe incorretos!&nbsp</span>&nbsp;");
                        %>
                        <input type="text" id="login_username" class="form-control" name="username" value="" required="required" placeholder="Nome de utilizador">
                    </div>
                    <div class="form-group">
                        <input type="password" id="login_password" class="form-control" name="password" value="" required="required" placeholder="Palavra-passe">
                    </div>
                    <button type="submit" class="btn btn-default btn-success">Entrar</button>
                </form>
            </div>
        </nav>
        
        
        <div class="container" style="margin-top:18vh;">
            
            <div class="col-sm-6">
                <div style="margin-left:20%; margin-right:20%; margin-top:15%; text-align:right">
                    <h1 style="font-size:xx-large; text-align:center">Bem-vindo ao Taskager!</h1>
                    <h2 style="color:white;  text-align:center">Efetue login com a sua sessão ou registe-se.</h2>
                    <br><br><br><br>
                </div>
            </div>
            
            <div class="col-sm-6">
                <div class="panel panel-default">
                    <header class="panel-heading">
                        <h2 class="panel-title">Criar nova conta</h2>
                    </header>
                    <section class="panel-body">
                        <div class="alert alert-info">Não possui uma conta? Introduza os seus dados e registe-se!</div>
                        <form id="form" action="Register" method="post"  class="form-horizontal">
                            <div class="form-group">
                                <div class="col-sm-12">                                    
                                    <label for="username">Nome de utilizador:</label>
                                    <input type="text" id="username"  class="form-control" value="" name="username" required="required" placeholder="Nome de utilizador" />
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-12">                                    
                                    <label for="password">Palavra-passe:</label>
                                    <input type="password" id="password" class="form-control" value="" name="password" required="required" placeholder="Palavra-passe" />
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-12">                                    
                                    <label for="email">Endereço de email:</label>
                                    <input type="email" id="email" class="form-control" value="" name="email" required="required" placeholder="Email" />
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-12">
                                    <!--<span class="pull-left">
                                        <input type="checkbox" id="remember" class="" value="1" name="remember"/>
                                        <label class="choice" for="remember">Lembrar-me</label>
                                    </span>-->
                                    <button class="btn btn-default btn-primary pull-right" type="submit">Registar</button>
                                </div>
                            </div>
                        </form>
                        <!--<ul><li><strong>Ajudem-me!</strong>&nbsp;<a href="#">Esqueci a minha password!</a></li></ul>-->
                    </section>
                </div>
            </div>
            <!--<vr style="border: 1px solid black; background-color:black; border-bottom-width:40vh;"> </vr>-->
            
        </div>
    </body>
    <script>
        document.getElementById("login_username").focus();
    </script>
</html>
