package co.edu.sena.Evaluacion.persistencia.interfaces;
import co.edu.sena.Evaluacion.persistencia.vo.EstudianteVO;
import java.util.List;
/**
 * Esta clase tiene la interfaz CRUD del estudiante
 * Evaluacion final 1694493
 * @author Darwin Garcia
 * @version: 30/06/2019
 */
public interface crudEstudiante {
    public List listado();
    public EstudianteVO list (int id);
    public boolean add(EstudianteVO estudiante);
    public boolean edit(EstudianteVO estudiante);
    public boolean eliminar(int id);
}/*Fin clase Crud Estudiante*/
