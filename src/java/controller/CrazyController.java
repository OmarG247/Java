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
            //2.-Enviamos una redireccion a la pagina VistaOperacion.jsp
            response.sendRedirect("VistaOperacion.jsp");
            /*response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet CrazyController</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<form action='CrazyController' method='POST'>");
                out.println("Numero 1:");
                out.println("<input type='text' name='Numero1'>");
                out.println("<br>");
                out.println("Numero 2:");
                out.println("<input type='text' name='Numero2'>");
                out.println("<br>");
                out.println("<input type='hidden' name='operacion' value='suma'>");
                out.println("<input type='submit' value='Confirmar'>");
                out.println("</form>");
            }*/
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");
        //try (PrintWriter out = response.getWriter()) {
        //4.- Guardamos mediante request las variables pasadas por el formulario y las pasamos a la pagina destino.jsp
            String Numero1=request.getParameter("Numero1");
            String Numero2=request.getParameter("Numero2");
            String Nombre_Usuario=request.getParameter("Nombre_Usuario");
            String operacion=request.getParameter("Operacion");
            request.setAttribute("usuariojsp", Nombre_Usuario);
            request.setAttribute("Numero1jsp", Numero1);
            request.setAttribute("Numero2jsp", Numero2);
            request.getRequestDispatcher("destino.jsp").forward(request, response);
            /*if (operacion=="suma"){
            //Persona.suma();
            }else if(operacion=="resta"){
            //Persona.resta();
            } else if (operacion=="division") {
            //Persona.division();
            } else {
            //Persona.multiplicacion();
                    }*/
            /* TODO output your page here. You may use following sample code. */
            /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CrazyController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>El resultado de tu suma ha sido  </h1>");
            out.println("<a href='./'>Volver</a>");
            out.println("</body>");
            out.println("</html>");
        }*/
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */

}
