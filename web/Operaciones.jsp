<%-- 
    Document   : Operaciones
    Created on : 10-oct-2018, 19:49:36
    Author     : Adria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Numeros</title>
    </head>
    <body>
        <!--3.- Creamos el formulario que pasará los datos por POST -->
        <form action='CrazyController' method='POST' >
            <label>Selecciona Operación</label><br>
            <select name="formOperacion">
                <option value=1>Suma</option>
                <option value=2>Resta</option>
                <option value=3>Multiplicacion</option>
                <option value=4>Division</option>
            </select><br>
            <button type="submit" class="button">Submit</button><br><br>
            <a href="./index.html">Volver</a>
        </form>
    </body>
</html>
