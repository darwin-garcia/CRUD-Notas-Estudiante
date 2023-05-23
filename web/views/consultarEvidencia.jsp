<%-- 
    Document   : consultarEvidencia
    Created on : 30/06/2019, 08:05:03 PM
    Author     : Darwin Garcia
--%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Iterator" %>
<%@page import="java.util.List" %>
<%@page import="co.edu.sena.Evaluacion.persistencia.vo.EvidenciaVO" %>
<%@page import="co.edu.sena.Evaluacion.persistencia.dao.EvidenciaDAO" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Lista de Evidencias</title>
    </head>
    <body>
        <section>
            <h1>Lista de Evidencias</h1>
            <table border="1">
                <thead>
                    <tr>Id. Evidencia</th>
                        <th>Nombre Evidencia</th>
                        <th>Descripcion Evidencia</th>
                        <th>Puntaje Maximo</th>
                        <th>Fecha Evidencia</th>
                        <th>Accion</th>
                    </tr>
                </thead>
                <%
                Connection con =null;
                EvidenciaVO ev = null;
                EvidenciaDAO dao = new EvidenciaDAO(con);
                List<EvidenciaVO> lista = dao.consultar();
                Iterator<EvidenciaVO> iterar = lista.iterator();
                while(iterar.hasNext()){
                    ev=iterar.next();                
             %>
            <tbody>
                <tr>
                    <td><%=ev.getIdEvidencia()%></td>
                    <td><%=ev.getNombreEvidencia()%></td>
                    <td><%=ev.getDescripcionEvidencia()%></td>
                    <td><%=ev.getPuntajeMaximo()%></td>
                    <td><%=ev.getFechaEvidencia()%></td>
                    <td><a>Modificar</a><a>Borrar</a></td>
                    <td>
                        <a href="ControladorServlet?accion=editarEvidencia">Modificar</a>
                        <a href="ControladorServlet?accion=eliminarEvidencia">Borrar</a>
                    </td>
                </tr>
                <%}%>                   
                </tbody>
            </table>
        </section>
        <footer>Creado por Darwin Garcia (c)2019</footer>
    </body>
</html>
