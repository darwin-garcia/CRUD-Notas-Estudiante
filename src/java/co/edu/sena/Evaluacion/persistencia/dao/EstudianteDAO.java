package co.edu.sena.Evaluacion.persistencia.dao;

import co.edu.sena.Evaluacion.persistencia.conexion.Conexion;
import co.edu.sena.Evaluacion.persistencia.interfaces.crudEstudiante;
import co.edu.sena.Evaluacion.persistencia.vo.EstudianteVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase es el Data Access Object de la tabla Estudiante. Capa de Negocio
 * Evaluacion final 1694493
 * @author Darwin Garcia
 * @version: 30/06/2019
 */
public class EstudianteDAO {
    /*Campos requeridos de la clase EstudianteDAO*/
    Conexion cn = new Conexion();
   private Connection con;
   private PreparedStatement ps=null;
   private ResultSet rs=null;
   private String sql=null;/*Comando de consulta*/
   private List<EstudianteVO> listado = new ArrayList<>();
    /*Constructor de esta clase*/
    public EstudianteDAO(Connection con) {
        this.con = con;
    }//Fin constructor*/
    /**
     * Metodo que permite mostrar todos los estudiantes que se encuentra en la base de datos
     *
     */
    public List<EstudianteVO> consultar() throws Exception{/*Para consultar todos los estudiantes desde un ArrayList*/
        try{
            con=cn.conectar();
            sql="select * from estudiante order by apellidos_estudiante, nombres_estudiante";
            ps=con.prepareStatement(sql);/*Prepara la consulta SQL*/
            rs=ps.executeQuery();/*Ejecuta la consulta SQL*/
            while(rs.next()){
                EstudianteVO estudiante = new EstudianteVO(rs.getInt("id_estudiante"));/*Recibo datos */
                estudiante.setNombreEstudiante(rs.getString("nombres_estudiante"));
                estudiante.setApellidoEstudiante(rs.getString("apellidos_estudiante"));
                estudiante.setCorreoEstudiante(rs.getString("correo_estudiante"));
                estudiante.setFechaNacimiento(rs.getDate("fecha_nacimiento_estudiante"));
                estudiante.setCursoEstudiante(rs.getString("curso_estudiante"));
                listado.add(estudiante);
            }//Fin del while
            return listado;
        }//Fin del try
        catch(Exception x){
            x.printStackTrace();/*Muestra el error generado cuando no puede hacer la consulta*/
            throw new Exception("Error al consultar la tabla de Estudiantes. "+x);
        }//Fin del catch
        finally{
            Conexion.cerrar(ps, rs);
        }//Fin del finally
    }/*Fin de consultar*/
    /**
     * Metodo que permite ingresar la informacion basica del estudiante
     * @param estudiante
     * @throws Exception 
     */
    public void insertar(EstudianteVO estudiante) throws Exception {
        try{
            con=cn.conectar();
            sql="insert into estudiante(nombres_estudiante, apellidos_estudiante, correo_estudiante, fecha_nacimiento_estudiante, curso_estudiante) values(?,?,?,?,?)";
            ps=con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setObject(1, estudiante.getNombreEstudiante());
            ps.setObject(2, estudiante.getApellidoEstudiante());
            ps.setObject(3, estudiante.getCorreoEstudiante());
            ps.setObject(4, estudiante.getFechaNacimiento());
            ps.setObject(5, estudiante.getCursoEstudiante());
            ps.executeUpdate();
        }//Fin del try
        catch(Exception x){
            x.printStackTrace();
            throw new Exception("Error al insertar el estudiante. "+x);
        }//Fin del catch
        finally{
            Conexion.cerrar(ps,rs);
        }//Fin del finally
    }/*Fin metodo insertar*/
    /**
     * Metodo que permite editar la informacion basica del estudiante
     * @param estudiante
     * @throws Exception 
     */
    public void editar(EstudianteVO estudiante) throws Exception{
        try{
            con=cn.conectar();
            sql="update estudiante set nombres_estudiante=?, apellidos_estudiante=?, correo_estudiante=?, fecha_nacimiento_estudiante=?, curso_estudiante=? where apellidos_estudiante=?";
            ps=con.prepareStatement(sql);
            ps.setObject(1, estudiante.getNombreEstudiante());
            ps.setObject(2, estudiante.getApellidoEstudiante());
            ps.setObject(3, estudiante.getCorreoEstudiante());
            ps.setObject(4, estudiante.getFechaNacimiento());
            ps.setObject(5, estudiante.getCursoEstudiante());
            ps.setObject(6, estudiante.getApellidoEstudiante());
            ps.executeUpdate();
        }//Fin del try
        catch(Exception x){
            x.printStackTrace();
            throw new Exception("Error al actualizar los datos del estudiante. "+x);
        }//Fin del catch
        finally{
            Conexion.cerrar(ps, rs);
        }//Fin del finally
    }//Fin metodo editar*/
    /**
     * Metodo que permite eliminar a un estudiante registrado en la base de datos
     * @param estudiante
     * @throws Exception 
     */
    public void eliminar(EstudianteVO estudiante) throws Exception{
        try{
            con=cn.conectar();
            sql="delete from estudiante where apellidos=estudiante=?";
            ps=con.prepareStatement(sql);
            ps.setObject(1, estudiante.getApellidoEstudiante());
        }//Fin del try
        catch(Exception x){
            x.printStackTrace();
            throw new Exception("Error al eliminar los datos del estudiante. "+x);
        }//Fin del catch
        finally{
            Conexion.cerrar(ps, rs);
        }//Fin del finally
    }//Fin metodo eliminar*/
    /**
     * Metodo que permite consultar la informacion del estudiante especifico por apellido
     * @param estudiante
     * @throws Exception 
     */
    public void consultaIndividual(EstudianteVO estudiante) throws Exception{
        try{
           con=cn.conectar();
           sql="select * from estudiante where apellidos_estudiante=?";
           ps=con.prepareStatement(sql);
           ps.setObject(1, estudiante.getApellidoEstudiante());
        }//Fin del try
        catch(Exception x){
            x.printStackTrace();
            throw new Exception("Error al consultar al estudiante seleccionado. "+x);
        }//Fin del catch
        finally{
            Conexion.cerrar(ps, rs);
        }//Fin del finally
    }//Fin metodo de la consulta individual*/

}/*Fin clase EstudianteDAO*/
