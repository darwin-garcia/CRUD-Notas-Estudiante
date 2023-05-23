package co.edu.sena.Evaluacion.persistencia.vo;

/**
 * Esta clase tiene las entidades de la tabla Calificacion
 * Evaluacion final 1694493
 * @author Darwin Garcia
 * @version: 30/06/2019
 */
public class CalificacionVO {/*Tabla Calificacion*/
    private Integer idCalificacion;/*id_calificacion*/
    private EstudianteVO idEstudiante;/*id_estudiante*/
    private EvidenciaVO idEvidencia;/*id_evidencia*/
    private Double puntaje;/*puntaje*/
    /*Constructor*/
    public CalificacionVO(){
        
    }
    public CalificacionVO(Integer idCalificacion) {
        this.idCalificacion = idCalificacion;
    }
    
    //Fin Constructor
    
    /*Getter and Setter*/    
    public Integer getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(Integer idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public EstudianteVO getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(EstudianteVO idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public EvidenciaVO getIdEvidencia() {
        return idEvidencia;
    }

    public void setIdEvidencia(EvidenciaVO idEvidencia) {
        this.idEvidencia = idEvidencia;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }//Fin Getter and Setter
    /*()toString*/
    @Override
    public String toString() {
        return "CalificacionVO{" + "idCalificacion=" + idCalificacion + ", idEstudiante=" + idEstudiante + ", idEvidencia=" + idEvidencia + ", puntaje=" + puntaje + '}';
    }//Fin    
}/*Fin Clase CaificacionVO*/
