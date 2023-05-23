package co.edu.sena.Evaluacion.persistencia.vo;
import java.util.Date;
/**
 * Esta clase tiene las entidades de la tabla Estudiante
 * Evaluacion final 1694493
 * @author Darwin Garcia
 * @version: 30/06/2019
 */
public class EstudianteVO {/*Tabla Estudiante*/
    private Integer idEstudiante; /*id_estudiante*/
    private String nombreEstudiante;/*nombres_estudiante*/
    private String apellidoEstudiante;/*apellidos_estudiante*/
    private String correoEstudiante;/*correo_estudiante*/
    private Date fechaNacimiento;/*fecha_nacimiento_estudiante*/
    private String cursoEstudiante;/*curso_estudiante*/
    /*Constructor*/
    public EstudianteVO(){
        
    }
    public EstudianteVO(Integer idEstudiante){
        this.idEstudiante=idEstudiante;
    }//Fin constructor solo id
    public EstudianteVO(Integer idEstudiante, String nombreEstudiante, String apellidoEstudiante, String correoEstudiante, Date fechaNacimiento, String cursoEstudiante) {
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.correoEstudiante = correoEstudiante;
        this.fechaNacimiento = fechaNacimiento;
        this.cursoEstudiante = cursoEstudiante;
    }//Fin Constructor

    
    /*Getter and Setter*/
    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public String getCorreoEstudiante() {
        return correoEstudiante;
    }

    public void setCorreoEstudiante(String correoEstudiante) {
        this.correoEstudiante = correoEstudiante;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCursoEstudiante() {
        return cursoEstudiante;
    }

    public void setCursoEstudiante(String cursoEstudiante) {
        this.cursoEstudiante = cursoEstudiante;
    }
    /*()toString*/
    @Override
    public String toString() {
        return "EstudianteVO{" + "idEstudiante=" + idEstudiante + ", nombreEstudiante=" + nombreEstudiante + ", apellidoEstudiante=" + apellidoEstudiante + ", correoEstudiante=" + correoEstudiante + ", fechaNacimiento=" + fechaNacimiento + ", cursoEstudiante=" + cursoEstudiante + '}';
    }
    
}/*Fin Clase EstudianteVO*/
