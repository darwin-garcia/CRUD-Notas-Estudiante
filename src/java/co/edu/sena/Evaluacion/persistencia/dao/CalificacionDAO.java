package co.edu.sena.Evaluacion.persistencia.dao;

import co.edu.sena.Evaluacion.persistencia.conexion.Conexion;
import co.edu.sena.Evaluacion.persistencia.dto.ReporteDTO;
import co.edu.sena.Evaluacion.persistencia.vo.CalificacionVO;
import co.edu.sena.Evaluacion.persistencia.vo.EstudianteVO;
import co.edu.sena.Evaluacion.persistencia.vo.EvidenciaVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase es el Data Access Object de la tabla Calificacion. Capa de Negocio
 * Evaluacion final 1694493
 * @author Darwin Garcia
 * @version 30/06/2019
 */
public class CalificacionDAO {
    /*Campos requeridos de la clase CalificacionDAO*/
    Conexion cn = new Conexion();
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql="";/*Variable de consulta SQL*/
    private List<CalificacionVO> listado = new ArrayList<>();
    private List<ReporteDTO> rep = new ArrayList<>();
    private EstudianteVO idEstudiante;
    private EvidenciaVO idEvidencia;
    /*Constructor*/
    public CalificacionDAO(Connection con) {
        this.con = con;
    }/*Fin del constructor*/
    /**
     * Metodo que permite consultar todas las calificaciones
     * @return
     * @throws Exception 
     */
    public List<CalificacionVO> consultar() throws Exception{
        try{
            con=cn.conectar();
            sql="select * from calificacion order by id_estudiante";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                CalificacionVO calificacion = new CalificacionVO(rs.getInt("id_calificacion"));
                calificacion.setIdEstudiante(idEstudiante);
                calificacion.setIdEvidencia(idEvidencia);
                calificacion.setPuntaje(rs.getDouble("puntaje"));
                listado.add(calificacion);
            }//Fin del while
            return listado;
        }//Fin del try
        catch(Exception x){
            x.printStackTrace();
            throw new Exception("Error al consultar las calificaciones. "+x);
        }//Fin del catch
        finally{
            Conexion.cerrar(ps, rs);
        }//Fin del finally
    }//Fin consultar calificaciones*/
    /**
     *Metodo que permite insertar las calificaciones del estudiante
     * @param calificacion
     */
    public void insertar(CalificacionVO calificacion) throws Exception{
        try{
            con=cn.conectar();
            sql="insert into calificacion(id_estudiante, id_evidencia, puntaje) values(?,?,?)";
            ps=con.prepareStatement(sql);
            ps.setObject(1, calificacion.getIdEstudiante());
            ps.setObject(2, calificacion.getIdEvidencia());
            ps.setObject(3, calificacion.getPuntaje());
            ps.executeUpdate();
        }//Fin del try insert
        catch(Exception x){
            x.printStackTrace();
            throw new Exception("Error al insertar el estudiante. "+x);
        }//Fin del catch
        finally{
            Conexion.cerrar(ps,rs);
        }//Fin del finally
    }//Fin metodo insertar*/
    /**
     * Metodo que permite editar la calificacion de un estudiante
     * @param calificacion
     */
    public void editar(CalificacionVO calificacion) throws Exception{
        try{
            con=cn.conectar();
            sql="update calificacion set id_estudiante=?, id_evidencia=?, puntaje=? where id_estudiante=?";
            ps=con.prepareStatement(sql);
            ps.setObject(1, calificacion.getIdEstudiante());
            ps.setObject(2, calificacion.getIdEvidencia());
            ps.setObject(3, calificacion.getPuntaje());
            ps.setObject(4, calificacion.getIdEstudiante());
            ps.executeUpdate();
        }catch(Exception x){
            x.printStackTrace();
            throw new Exception("Error al modificar el  estudiante. "+x);
        }finally{
            Conexion.cerrar(ps, rs);
        }
    }//Fin metodo editar*/
    /**
     * Metodo que permite eliminar una calificacion de un estudiante
     * @param calificacion 
     */
    public void eliminar(CalificacionVO calificacion) throws Exception{
        try{
            con=cn.conectar();
            sql="delete from calificacion where id_estudiante=?";
            ps=con.prepareStatement(sql);
            ps.setObject(1, calificacion.getIdEstudiante());
            ps.executeUpdate();
        }catch(Exception x){
            x.printStackTrace();
            throw new Exception("Error al eliminar el estudiante seleccionado "+x);
        }finally{
            Conexion.cerrar(ps, rs);
        }
    }//Fin metodo eliminar*/
    /**
     * Metodo que permite realizar una consulta individual de un estudiante especifico por apellido
     * @param calificacion
     */
    public void consultaIndividual(CalificacionVO calificacion) throws Exception{
        try{
            con=cn.conectar();
            sql="select * from calificacion where id_estudiante=?";
            ps=con.prepareStatement(sql);
            ps.setObject(1, calificacion.getIdEstudiante());
            ps.executeUpdate();
        }catch(Exception x){
            x.printStackTrace();
            throw new Exception("Error al consultar "+x);
        }finally{
            Conexion.cerrar(ps, rs);
        }
    }//Fin metodo de la consulta individual*/
    
    /*Posible uso de DTO para mostrar las notas de los estudiantes por evidencias*/
    /*select estudiante.id_estudiante, estudiante.id_apellidos, estudiante.nombres_estudiante, evidencia.nobmre_evidencia, calificacion.puntaje, evidencia.fecha_evidencia
    from estudiante left join calificacion on estudiante.id_estudiante=calificaion.id_calificacion left join evidencia on calificacion.id_calificacion=evidencia.id_evidencia
    order by estudiante.apellidos_estudiante, estudiante.nombres_estudiante
    */
}/*Fin clase CalificacionDAO*/
