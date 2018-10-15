<%-- 
    Document   : destino
    Created on : 10-oct-2018, 20:18:33
    Author     : Adria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--5.-Mostramos los datos escritos por el usuario -->
        <% 
        String Numero1=(String)request.getAttribute("num1");
        String Numero2=(String)request.getAttribute("num2");
        Integer resultado=(Integer)request.getAttribute("resultadojsp");
        //int resultado=Numero1+Numero2;
        %>
        <h1><%=resultado %></h1><br>
        <a href="index.html">Volver</a>
    </body>
</html>
