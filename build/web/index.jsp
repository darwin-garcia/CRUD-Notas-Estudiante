<%-- 
    Document   : index
    Created on : 30/06/2019, 08:16:03 PM
    Author     : Darwin Garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es-CO"><!--Lenguaje-->
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Evidencias de Estudiantes</title>
    </head>
    <body>
        <!--Encabezado-->
        <!--Cuerpo de pagina-->
        <section>
            <div>
                <h1>Registro de Notas Evaluacion</h1>
                <h3>Estudiantes</h3>
                <p><a href="ControladorServlet?accion=listar_estudiante">Listar Estudiantes</a></p>
                <p><a href="ControladorServlet?accion=insertar_estudiante">Insertar Estudiantes</a></p>
                <p><a href="ControladorServlet?accion=editar_estudiante">Editar Estudiantes</a></p>
                <p><a href="ControladorServlet?accion=eliminar_estudiante">Eliminar Estudiantes</a></p>
                <h3>Evidencias</h3>
                <p><a href="ControladorServlet?accion=listar_evidencia">Listar Evidencias</a></p>
                <p><a href="ControladorServlet?accion=insertar_evidencia">Insertar Evidencias</a></p>
                <p><a href="ControladorServlet?accion=editar_evidencia">Editar Evidencias</a></p>
                <p><a href="ControladorServlet?accion=eliminar_evidencia">Eliminar Evidencias</a></p>
                <!--
                <h3>Calificaciones</h3>
                <p><a href="ControladorServlet?accion=listar_calificacion">Listar Calificaciones</a></p>
                <p><a href="ControladorServlet?accion=listar_estudiante">Insertar Calificaciones</a></p>
                <p><a href="ControladorServlet?accion=listar_estudiante">Editar Calificaciones</a></p>
                <p><a href="ControladorServlet?accion=listar_estudiante">Eliminar Calificaciones</a></p>-->
            </div>
        </section>
        <footer>Creado por Darwin Garcia (c)2019</footer>
    </body>
</html>
