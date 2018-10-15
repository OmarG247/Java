package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import model.Persona;

/**
 *
 * @author Adria
 */

public class ControlNumeros extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //2.-Enviamos una redireccion a la pagina Operaciones.jsp
        String operacion = (String)request.getAttribute("operacionjsp");
        String num1 = (String)request.getAttribute("numero1");
        String num2 = (String)request.getAttribute("numero2");
        int resultado = 0;
        //JOptionPane.showMessageDialog(null, pagina.equals("calculadora"));
        if(operacion.equals("1")){
            int Numero1=Integer.parseInt(num1);
            int Numero2=Integer.parseInt(num2);
             resultado=Numero1+Numero2; 
        }else if(operacion.equals("2")){
            int Numero1=Integer.parseInt(num1);
            int Numero2=Integer.parseInt(num2);
             resultado=Numero1-Numero2; 
        }else if(operacion.equals("3")){
            int Numero1=Integer.parseInt(num1);
            int Numero2=Integer.parseInt(num2);
             resultado=Numero1*Numero2; 
        }else if(operacion.equals("4")){
            int Numero1=Integer.parseInt(num1);
            int Numero2=Integer.parseInt(num2);
             resultado=Numero1/Numero2; 
        }
        
        
        request.setAttribute("resultadojsp",resultado);
        
        response.sendRedirect("destino.jsp");
        

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String operacion = (String) request.getParameter("formOperacion");

        request.setAttribute("operacionjsp", operacion);
        request.getRequestDispatcher("Numeros.jsp").forward(request, response);
      

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
}
