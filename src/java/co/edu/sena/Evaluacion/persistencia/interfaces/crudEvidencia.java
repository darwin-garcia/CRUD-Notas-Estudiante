/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.Evaluacion.persistencia.interfaces;

import co.edu.sena.Evaluacion.persistencia.vo.EvidenciaVO;
import java.util.List;

/**
 * Esta clase tiene la interfaz CRUD de evidencia
 * Evaluacion final 1694493
 * @author Darwin Garcia
 * @version: 30/06/2019
 */
public interface crudEvidencia {
    public List listado();
    public EvidenciaVO list (int id);
    public boolean add(EvidenciaVO evidencia);
    public boolean edit(EvidenciaVO evidencia);
    public boolean eliminar(int id);
}
