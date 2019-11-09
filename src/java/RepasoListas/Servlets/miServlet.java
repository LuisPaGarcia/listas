/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoListas.Servlets;

import RepasoListas.Clases.Lista;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*; 
/**
 *
 * @author aleja
 */
public class miServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    String dato;
    String salida;
    String opcion;
    String list;
    
    String alInicio = "alInicio";
    String alFinal = "alFinal";
    String eliminar = "eliminar";
    LinkedList<String> linkedList = new LinkedList<String>(); 

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        {
            dato = request.getParameter("dato"); // Valor a agregar a la lista
            opcion = request.getParameter("opcion"); // Ubicacion a agregar

            // Instancia de la clase Lista (import RepasoListas.Clases.Lista;)
            Lista lista = new Lista();
            
            // Validar que accion queremos hacer
            if(opcion.equals(alInicio)){
                lista.AgregarAlInicio(linkedList, dato);
            }
            

            // Validar que accion queremos hacer
            if(opcion.equals(alFinal)){
                lista.AgregarAlFinal(linkedList, dato);
            }

            // Validar que accion queremos hacer
            if(opcion.equals(eliminar)){
                lista.Eliminar(linkedList, dato);
            }
                        
            getServletContext().setAttribute("dato", dato);            
            getServletContext().setAttribute("option", opcion);            
            getServletContext().setAttribute("lista", linkedList.toString());            
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
