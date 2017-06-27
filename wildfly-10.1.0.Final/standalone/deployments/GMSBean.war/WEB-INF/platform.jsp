<%-- 
    Document   : register
    Created on : 24/abr/2017, 11:50:43
    Author     : ruicouto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="nav.jsp"/>
        <h1>New Platform</h1>
        <b>${msg}</b>
        <form method="POST">
            Name: <input type="text" name="name"/><br/>
            Description: <input type="text" name="description"/><br/>
            Manufacturer: <input type="text" name="manufacturer"/><br/>
            Year: <input type="text" name="year"/><br/>
            <input type="submit" value="Create"/>
        </form>
    </body>
</html>
