<%-- 
    Document   : oklogin
    Created on : 15-oct-2018, 15:50:45
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
        
    <h1>Hola señor <%= usuario %></h1>
    
    <a href="index.html">Volver</a>
    
    
    </body>
</html>
