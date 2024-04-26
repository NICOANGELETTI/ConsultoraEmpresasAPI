
package nicoangeletti.ConsultoraEmpresas.service;

import java.util.List;
import nicoangeletti.ConsultoraEmpresas.model.Categoria;
import nicoangeletti.ConsultoraEmpresas.model.Encuesta;
import nicoangeletti.ConsultoraEmpresas.model.Pregunta;
import nicoangeletti.ConsultoraEmpresas.model.Respuesta;


public interface IRespuestaService {
    
    
    
    
    
    
          public void guardarRespuesta(Respuesta respuesta);
    
    public List<Respuesta> traerRespuestas();
    
    public Respuesta traerRespuesta(Long idRespuesta);
    
    public void eliminarRespuesta(Long idRespuesta);

    public void editarRespuesta(Long idOriginal, Long idNuevo , String descripcion, Pregunta pregunta);
            
    


    
    
    
    
}
