package co.edu.sena.Evaluacion.persistencia.vo;

import java.util.Date;
/**
 * Esta clase tiene las entidades de la tabla Evidencia
 * Evaluacion final 1694493
 * @author Darwin Garcia
 * @version: 30/06/2019
 */
public class EvidenciaVO {/*Tabla Evidencia*/
    private Integer idEvidencia;/*id_evidencia*/
    private String nombreEvidencia;/*nombre_evidencia*/
    private String descripcionEvidencia;/*descripcion_evidencia*/
    private Integer puntajeMaximo;/*puntaje_maximo_evidencia*/
    private Date fechaEvidencia;/*fecha_evidencia*/
    /*Constructor*/
    public EvidenciaVO(){
        
    }
    public EvidenciaVO(Integer idEvidencia){
        this.idEvidencia=idEvidencia;
    }
    public EvidenciaVO(Integer idEvidencia, String nombreEvidencia, String descripcionEvidencia, Integer puntajeMaximo, Date fechaEvidencia) {
        this.idEvidencia = idEvidencia;
        this.nombreEvidencia = nombreEvidencia;
        this.descripcionEvidencia = descripcionEvidencia;
        this.puntajeMaximo = puntajeMaximo;
        this.fechaEvidencia = fechaEvidencia;
    }/*Fin Constructor*/
    
    /*Getter and Setter*/
    public Integer getIdEvidencia() {
        return idEvidencia;
    }

    public void setIdEvidencia(Integer idEvidencia) {
        this.idEvidencia = idEvidencia;
    }

    public String getNombreEvidencia() {
        return nombreEvidencia;
    }

    public void setNombreEvidencia(String nombreEvidencia) {
        this.nombreEvidencia = nombreEvidencia;
    }

    public String getDescripcionEvidencia() {
        return descripcionEvidencia;
    }

    public void setDescripcionEvidencia(String descripcionEvidencia) {
        this.descripcionEvidencia = descripcionEvidencia;
    }

    public Integer getPuntajeMaximo() {
        return puntajeMaximo;
    }

    public void setPuntajeMaximo(Integer puntajeMaximo) {
        this.puntajeMaximo = puntajeMaximo;
    }

    public Date getFechaEvidencia() {
        return fechaEvidencia;
    }

    public void setFechaEvidencia(Date fechaEvidencia) {
        this.fechaEvidencia = fechaEvidencia;
    }
    /*()toString()*/
    @Override
    public String toString() {
        return "EvidenciaVO{" + "idEvidencia=" + idEvidencia + ", nombreEvidencia=" + nombreEvidencia + ", descripcionEvidencia=" + descripcionEvidencia + ", puntajeMaximo=" + puntajeMaximo + ", fechaEvidencia=" + fechaEvidencia + '}';
    }//Fin
    
}/*Fin Clase EvidenciaVO*/
