<%-- 
    Document   : insertarEstudiante
    Created on : 30/06/2019, 11:57:31 PM
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
<html lang="es-CO"><!--Lenguaje-->
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Insertar nuevos estudiantes</title>
    </head>
    <body>
        <section>
            <h1>Ingresar estudiante.</h1>
            <form action="ControladorServlet">
                <p>Nombres:<input type="text" name="CajaNombreEst"></p>
                <p>Apellidos:<input type="text" name="CajaApellidoEst"></p>
                <p>Correo:<input type="text" name="CajaCorreoEst"></p>
                <p>Fecha Nacimiento:<input type="text" name="CajaFechaNac"></p>
                <p>Curso:<input type="text" name="CajaCursoEst"></p><br>
                <input type="submit" name="accion" value="Agregar"></br>
                <p><a href="../index.html">Regresar</a></p>
            </form>
            <%
            Connection con=null;
            EstudianteVO est = null;
            EstudianteDAO dao = new EstudianteDAO(con);
            dao.insertar(est);
            
            %>
        </section>
        <footer>Creado por Darwin Garcia (c)2019</footer>        
    </body>
</html>
