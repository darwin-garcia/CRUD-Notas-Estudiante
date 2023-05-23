package co.edu.sena.Evaluacion.persistencia.dao;

import co.edu.sena.Evaluacion.persistencia.conexion.Conexion;
import co.edu.sena.Evaluacion.persistencia.interfaces.crudEvidencia;
import co.edu.sena.Evaluacion.persistencia.vo.EvidenciaVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase es el Data Access Object de la tabla Evidencia. Capa de Negocio
 * Evaluacion final 1694493
 * @author Darwin Garcia
 * @version: 30/06/2019
 */
public class EvidenciaDAO {
    /*Campos de la clase EvidenciaDAO*/
    Conexion cn = new Conexion();
    private Connection con;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    private String sql="";
    public List<EvidenciaVO> listado = new ArrayList<>();
    /*Constructor de la clase EvidenciaDAO*/
    public EvidenciaDAO(Connection con) {
        this.con = con;
    }/*Fin del constructor*/
    /**
     * Metodo que permite consultar todas las evidencias registradas
     * @return
     * @throws Exception 
     */
    public List<EvidenciaVO> consultar() throws Exception{
        try{
            con=cn.conectar();
            sql="select * from evidencia order by nombre_evidencia";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                EvidenciaVO evidencia = new EvidenciaVO(rs.getInt("id_evidencia"));
                evidencia.setNombreEvidencia(rs.getString("nombre_evidencia"));
                evidencia.setDescripcionEvidencia(rs.getString("descripcion_evidencia"));
                evidencia.setPuntajeMaximo(rs.getInt("puntaje_maximo_evidencia"));
                evidencia.setFechaEvidencia(rs.getDate("fecha_evidencia"));
                listado.add(evidencia);
            }//Fin del while
            return listado;
        }//Fin del catch del metodo Consultar
        catch(Exception x){
            x.printStackTrace();
            throw new Exception("Error al consultar las evidencias. "+x);
        }//Fin del catch del metodo Consultar
        finally{
            Conexion.cerrar(ps, rs);
        }//Fin del finally
    }/*Fin consulta evidencias*/
    /**
     * Metodo que permite insertar los datos requeridos de las evidencias
     * @param evidencia
     * @throws Exception 
     */
    public void insertar(EvidenciaVO evidencia) throws Exception{
        try{
            con=cn.conectar();
            sql="insert into evidencia(nombre_evidencia, descripcion_evidencia, puntaje_maximo_evidencia, fecha_evidencia) values(?,?,?,?)";
            ps=con.prepareStatement(sql);
            ps.setObject(1, evidencia.getNombreEvidencia());
            ps.setObject(2, evidencia.getDescripcionEvidencia());
            ps.setObject(3, evidencia.getPuntajeMaximo());
            ps.setObject(4, evidencia.getFechaEvidencia());
            ps.executeUpdate();
        }//Fin del try 
        catch(Exception x){
            x.printStackTrace();
            throw new Exception("Error al insertar la evidencia. "+x);
        }//Fin del catch
        finally{
            Conexion.cerrar(ps, rs);
        }//FIn del finally
    }//Fin metodo insertar*/
    /**
     * Metodo que permite editar la evidencia a evaluar
     * @param evidencia
     * @throws Exception 
     */
    public void editar(EvidenciaVO evidencia) throws Exception{
        try{
            con=cn.conectar();
            sql="update evidencia set nombre_evidencia=?, descripcion_evidencia=?, puntaje_maximo=?, fecha_evidencia=?, where nombre_evidencia=?";
            ps=con.prepareStatement(sql);
            ps.setObject(1, evidencia.getNombreEvidencia());
            ps.setObject(2, evidencia.getDescripcionEvidencia());
            ps.setObject(3, evidencia.getPuntajeMaximo());
            ps.setObject(4, evidencia.getFechaEvidencia());
            ps.setObject(5, evidencia.getNombreEvidencia());
            ps.executeUpdate();
        }//Fin del try
        catch(Exception x){
            x.printStackTrace();
            throw new Exception("Error al actualizar los datos de evidencias. "+x);
        }//Fin del catch del metodo editar
        finally{
            Conexion.cerrar(ps, rs);
        }//Fin del finally
    }//Fin metodo editar*/
    /**
     * Metodo que permite eliminar la evidencia a evaluar
     * @param evidencia
     * @throws Exception 
     */
    public void eliminar(EvidenciaVO evidencia) throws Exception{
        try{
            con=cn.conectar();
            sql="delete from evidencia where nombre_evidencia=?";
            ps=con.prepareStatement(sql);
            ps.setObject(1, evidencia.getNombreEvidencia());
        }catch(Exception x){
            x.printStackTrace();
            throw new Exception("Error al eliminar la evidencia registrada. "+x);
        }finally{
            Conexion.cerrar(ps, rs);
        }
    }//Fin metodo eliminar*/
    /**
     * Metodo que permite consultar una competencia especifica por nombre
     * @param evidencia
     */
    public void consultaIndividual(EvidenciaVO evidencia) throws Exception{
        try{
           con=cn.conectar();
           sql="select * from evidencia where nombre_evidencia=?";
           ps=con.prepareStatement(sql);
           ps.setObject(1, evidencia.getNombreEvidencia());
        }catch(Exception x){
            x.printStackTrace();
            throw new Exception("Error al insertar el estudiante. "+x);
        }finally{
            Conexion.cerrar(ps, rs);
        }
    }//Fin metodo de la consulta individual*/    
}/*Fin clase EvidenciaDAO*/
