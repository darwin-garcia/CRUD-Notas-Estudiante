<%-- 
    Document   : eliminarEstudiante
    Created on : 30/06/2019, 11:56:55 PM
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
        <title>Eliminar Estudiante</title>
    </head>
    <body>
        <h1>Eliminar Estudiante</h1>
        <section>
            <div>
                <p>Apellido del Estudiante: <input type="text" name="CajaApellidoEst"></p> 
                <input type="submit" name="accion" value="Agregar"></br>
            </div>
        </section>        
    </body>
</html>
