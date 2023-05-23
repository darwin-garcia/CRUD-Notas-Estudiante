<%-- 
    Document   : eliminarEvidencia
    Created on : 30/06/2019, 08:02:40 PM
    Author     : Darwin Garcia
--%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Iterator" %>
<%@page import="java.util.List" %>
<%@page import="co.edu.sena.Evaluacion.persistencia.vo.EvidenciaVO" %>
<%@page import="co.edu.sena.Evaluacion.persistencia.dao.EvidenciaDAO" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es-CO"><!--Lenguaje-->
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Eliminar evidencia registrada</title>
    </head>
    <body>
        <h1>Eliminar evidencia registrada</h1>
        <section>
            <div>
                <p>Apellido del Estudiante: <input type="text" name="CajaApellidoEst"></p> 
                <input type="submit" name="accion" value="Agregar"></br>
            </div>
        </section>  
    </body>
</html>
