/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.Evaluacion.persistencia.dto;

import co.edu.sena.Evaluacion.persistencia.vo.CalificacionVO;
import co.edu.sena.Evaluacion.persistencia.vo.EstudianteVO;
import co.edu.sena.Evaluacion.persistencia.vo.EvidenciaVO;

/**
 *
 * @author Developer
 */
public class ReporteDTO {
    private EstudianteVO idEstudiante;
    private EstudianteVO nombreEstudiante;
    private EstudianteVO apellidoEstudiante;
    private CalificacionVO puntaje;
    private EvidenciaVO nombreEvidencia;
    private EvidenciaVO fechaEvidencia;

    public EstudianteVO getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(EstudianteVO idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public EstudianteVO getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(EstudianteVO nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public EstudianteVO getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(EstudianteVO apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public CalificacionVO getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(CalificacionVO puntaje) {
        this.puntaje = puntaje;
    }

    public EvidenciaVO getNombreEvidencia() {
        return nombreEvidencia;
    }

    public void setNombreEvidencia(EvidenciaVO nombreEvidencia) {
        this.nombreEvidencia = nombreEvidencia;
    }

    public EvidenciaVO getFechaEvidencia() {
        return fechaEvidencia;
    }

    public void setFechaEvidencia(EvidenciaVO fechaEvidencia) {
        this.fechaEvidencia = fechaEvidencia;
    }
    
}
