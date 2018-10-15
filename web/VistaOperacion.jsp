<%-- 
    Document   : VistaOperacion
    Created on : 10-oct-2018, 19:49:36
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
        <!--3.- Creamos el formulario que pasará los datos por POST -->
        <form action='CrazyController' method='POST'>
            Nombre:
            <input type='text' name='Nombre_Usuario'>
            <br>
            Numero 1:
            <input type='text' name='Numero1'>
            <br>
            Numero 2:
            <input type='text' name='Numero2'>
            <br>
            <input type='hidden' name='operacion' value='suma'>
            <input type='submit' value='Confirmar'>
        </form>
    </body>
</html>
