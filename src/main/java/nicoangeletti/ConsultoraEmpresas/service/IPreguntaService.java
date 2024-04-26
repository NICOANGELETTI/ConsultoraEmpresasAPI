
package nicoangeletti.ConsultoraEmpresas.service;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;
import nicoangeletti.ConsultoraEmpresas.model.Categoria;
import nicoangeletti.ConsultoraEmpresas.model.Encuesta;
import nicoangeletti.ConsultoraEmpresas.model.Pregunta;
import nicoangeletti.ConsultoraEmpresas.model.Respuesta;


public interface IPreguntaService {
    
    
    
    
    
    
      public void guardarPregunta(Pregunta pregunta);
    
    public List<Pregunta> traerPreguntas();
    
    public Pregunta traerPregunta(Long idPregunta);
    
    public void eliminarPregunta(Long idPregunta);

    public void editarPregunta(Long idOriginal, Long idNuevo , String pregunta, Categoria categoria, List<Respuesta> listasRespuestas, Encuesta encuesta);
            
    
    
    
    
}
