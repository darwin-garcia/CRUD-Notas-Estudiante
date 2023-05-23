<%-- 
    Document   : insertarEvidencia
    Created on : 30/06/2019, 08:02:29 PM
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
        <title>Insertar Evidencia</title>
    </head>
    <body>
        <section>
           <h1>Ingresar Evidencia.</h1>
            <form action="ControladorServlet">
                <p>Nombre de la evidencia:<input type="text" name="CajaNombreEvd"></p>
                <p>Descripcion de la evidencia:<input type="text" name="CajaDescripEvd"></p>
                <p>Puntaje maximo:<input type="text" name="CajaPuntajeEvd"></p>
                <p>Fecha Evidencia:<input type="text" name="CajaFechaEvd"></p>
                <input type="submit" name="accion" value="Agregar"></br>
            </form> 
        </section>   
        <footer>Creado por Darwin Garcia (c)2019</footer>
    </body>
</html>
