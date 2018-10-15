<%-- 
    Document   : Numeros
    Created on : 15-oct-2018, 16:11:09
    Author     : GrindCrust
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Numeros</title>
    </head>
    <body>
        <!--3.- Creamos el formulario que pasará los datos por POST -->
        <form action='ControllNumeros' method='GET' name="numerosForm">
            <% String operacion = (String)request.getAttribute("operacionjsp"); 
                //JOptionPane.showMessageDialog(null, operacion);
            %>
            <input type="hidden" name="operacionjsp" value="<%=operacion %>">
            Numero 1:
            <input type='text' name='numero1'>
            <br>
            Numero 2:
            <input type='text' name='numero2'>
            <br>
            <input type='hidden' name='operacion' value='suma'>
            <input type='submit' value='Confirmar'>
        </form>
    </body>
</html>
