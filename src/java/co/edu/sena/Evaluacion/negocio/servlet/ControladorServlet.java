/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.Evaluacion.negocio.servlet;

import co.edu.sena.Evaluacion.persistencia.conexion.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Darwin Garcia
 */
@WebServlet(name = "ControladorServlet", urlPatterns = {"/consultarEvidencia", "/insertarEvidencia", "/eliminarEvidencia", "/editarEvidencia"})
public class ControladorServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        Connection con=null;
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            con=Conexion.conectar();
            String url=request.getServletPath();
            switch(url){
                case "/consultarEstudiante":
                    break;
                case "/insertarEstudiante":
                    break;
            }
        }
        catch(Exception e){
            System.err.print("Error en la conexion inicial. "+e);
        }finally{
            Conexion.cerrar(con);
        }
    }
    /*Variables de acceso a las vistas para las Evidencias*/
    String consultarEvidencia="views/consultarEvidencia.jsp";
    String insertarEvidencia="views/insertarEvidencia.jsp";
    String editarEvidencia="views/editarEvidencia.jsp";
    String eliminarEvidencia="views/eliminarEvidencia.jsp";
    /*Variables de acceso a las vistas para los estudiantes*/
    String consultarEstudiante="views/consultarEstudiante";
    String insertarEstudiante="views/insertarEstudiante";
    String editarEstudiante="views/editarEstudiante";
    String eliminarEstudiante="views/eliminarEstudiante";
    /*Variables de accesp a las vistas para las calificaciones*/
    
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
        String acceso="";
        String action=request.getParameter("accion");
        switch(action){
            case "listar_evidencia": acceso=consultarEvidencia; break;
            case "insertar_evidencia": acceso=insertarEvidencia; break;
            case "editar_evidencia": acceso=editarEvidencia; break;
            case "eliminar_evidencia": acceso=eliminarEvidencia; break;
            case "listar_estudiante": acceso=consultarEstudiante; break;
            case "insertar_estudiante":acceso=insertarEstudiante;break;
            case "editar_estudiante":acceso=editarEstudiante;break;
            case "eliminar_estudiante":acceso=consultarEstudiante;break;
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }//Fin metodo servlet doGet

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
    }//Fin metodo servlet doPost

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}//Fin del Servlet ControladorServlet
