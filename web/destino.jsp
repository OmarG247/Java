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
        <% String usuario=(String)request.getAttribute("usuariojsp");
        int Numero1=Integer.parseInt((String)request.getAttribute("Numero1jsp"));
        int Numero2=Integer.parseInt((String)request.getAttribute("Numero2jsp"));
        int resultado=Numero1+Numero2;
        %>
        <h1><%= usuario %><%= resultado %></h1>
    </body>
</html>
