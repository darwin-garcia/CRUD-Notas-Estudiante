<%-- 
    Document   : consultarEstudiante
    Created on : 30/06/2019, 11:56:23 PM
    Author     : Darwin Garcia
--%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Iterator" %>
<%@page import="java.util.List" %>
<%@page import="co.edu.sena.Evaluacion.persistencia.conexion.Conexion" %>
<%@page import="co.edu.sena.Evaluacion.persistencia.vo.EstudianteVO" %>
<%@page import="co.edu.sena.Evaluacion.persistencia.dao.EstudianteDAO" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es-CO">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Listado de Estudiantes</title>
    </head>
    <body>
        <section>
            <h1>Lista de Estudiantes</h1>
            <table border="1">
            <thead>
                <tr>
                    <th>Id.</th>
                    <th>Nombres del Estudiante</th>
                    <th>Apellidos del Estudiante</th>
                    <th>Correo del Estudiante</th>
                    <th>Fecha de Nacimiento</th>
                    <th>Curso del Estudiante</th>
                    <th>Accion</th>
                </tr>
            </thead>
            <%
                Connection con=null;
                EstudianteVO est = null;
                EstudianteDAO dao = new EstudianteDAO(con);
                List<EstudianteVO> lista = dao.consultar();
                Iterator<EstudianteVO> iterar = lista.iterator();
                while(iterar.hasNext()){
                    est=iterar.next();                
             %>
            <tbody>
                <tr>
                    <td><%=est.getIdEstudiante()%></td>
                    <td><%=est.getNombreEstudiante()%></td>
                    <td><%=est.getApellidoEstudiante()%></td>
                    <td><%=est.getCorreoEstudiante()%></td>
                    <td><%=est.getFechaNacimiento()%></td>
                    <td><%=est.getCursoEstudiante()%></td>
                    <td>
                        <a href="ControladorServlet?accion=editarEstudiante">Modificar</a>
                        <a href="ControladorServlet?accion=eliminarEstudiante">Borrar</a>
                    </td>
                </tr>
                <%}%>
            </tbody>
        </table>
        </section>
        <footer>Creado por Darwin Garcia (c)2019</footer>
    </body>
</html>
