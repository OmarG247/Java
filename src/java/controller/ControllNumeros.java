/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author GrindCrust
 */
@WebServlet(name = "ControllNumeros", urlPatterns = {"/ControllNumeros"})
public class ControllNumeros extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                //2.-Enviamos una redireccion a la pagina Operaciones.jsp
        Integer Numero_1=new Integer(0);        
        String operacion = (String)request.getParameter("operacionjsp");
        JOptionPane.showMessageDialog(null,operacion);
        String num1 = (String)request.getParameter("numero1");
        String num2 = (String)request.getParameter("numero2");
        Integer resultado = 0;
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
            Integer Numero2=Integer.parseInt(num2);
             resultado=Numero1/Numero2; 
        }
        
        request.setAttribute("num1",num1);
        request.setAttribute("num2",num2);
       request.setAttribute("resultadojsp",resultado);
        
       request.getRequestDispatcher("destino.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
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
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
