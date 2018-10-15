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
public class CrazyController extends HttpServlet {

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

        String pagina = (String) request.getParameter("pagina");
        //JOptionPane.showMessageDialog(null, pagina.equals("calculadora"));
        if (pagina.equals("calculadora")) {
            response.sendRedirect("Operaciones.jsp");
        } else if (pagina.equals("login")) {
            response.sendRedirect("login.jsp");
        }
        
        

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String operacion = (String) request.getParameter("formOperacion");

        request.setAttribute("operacionjsp", operacion);
        request.getRequestDispatcher("Numeros.jsp").forward(request, response);
      /*   JOptionPane.showMessageDialog(null, );
        if (request.getAttribute("operacionFinal").equals(true)) {

            // if (Operacion.equals("suma")) {
            int Numero1 = Integer.parseInt((String) request.getAttribute("Numero1"));
            int Numero2 = Integer.parseInt((String) request.getAttribute("Numero2"));
            int resultado = Numero1 + Numero2;
            response.sendRedirect("destino.jsp");
        } else {
            response.sendRedirect("index.html");
        } */
        /*} else if (Operacion.equals("resta")) {
        String usuario=(String)request.getAttribute("usuariojsp");
        int Numero1=Integer.parseInt((String)request.getAttribute("Numero1jsp"));
        int Numero2=Integer.parseInt((String)request.getAttribute("Numero2jsp"));
        int resultado=Numero1-Numero2;            
        } else if (Operacion.equals("Multiplicacion")) {
        String usuario=(String)request.getAttribute("usuariojsp");
        int Numero1=Integer.parseInt((String)request.getAttribute("Numero1jsp"));
        int Numero2=Integer.parseInt((String)request.getAttribute("Numero2jsp"));
        int resultado=Numero1*Numero2; 
        } else if (Operacion.equals("Division")) {
        String usuario=(String)request.getAttribute("usuariojsp");
        int Numero1=Integer.parseInt((String)request.getAttribute("Numero1jsp"));
        int Numero2=Integer.parseInt((String)request.getAttribute("Numero2jsp"));
        int resultado=Numero1/Numero2; 
        } else {
        String usuario="Hola";
        int Numero1= 1;
        int Numero2= 2;
        int resultado=3;
        }*/

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
}
