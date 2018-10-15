<%-- 
    Document   : badlogin
    Created on : 15-oct-2018, 15:51:01
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
       
        <% String usuario=(String)request.getAttribute("usuariojsp"); %>
        
    <h1>Hola señor <%= usuario %> parece ser que ha introducido mal el nombre de usuario o la contraseña.</h1>
    
    <a href="index.html">Volver</a>
    </body>
</html>
