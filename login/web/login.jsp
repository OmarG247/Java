<%-- 
    Document   : login
    Created on : 15-oct-2018, 15:50:31
    Author     : Joan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login:</h1>
        <form action="NavegadorController" method="POST">
         Usuario:
        <input type="text" name="usuario" required>
        <br>
        Contraseña:
        <input type="text" name="password" required>
        <br>
        <input type="submit" value="Confirmar">
    </body>
</html>
