
package nicoangeletti.ConsultoraEmpresas.service;

import java.util.List;
import nicoangeletti.ConsultoraEmpresas.model.Pregunta;
import nicoangeletti.ConsultoraEmpresas.model.Respuesta;
import nicoangeletti.ConsultoraEmpresas.repository.IRespuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestaService implements IRespuestaService {

    
    @Autowired
    IRespuestaRepository respuestaRepo;
    
    
    @Override
    public void guardarRespuesta(Respuesta respuesta) {
        respuestaRepo.save(respuesta);
    }

    @Override
    public List<Respuesta> traerRespuestas() {
        List<Respuesta> listaRespuestas = respuestaRepo.findAll();
        return listaRespuestas;
    }

    @Override
    public Respuesta traerRespuesta(Long idRespuesta) {
        Respuesta respuesta = respuestaRepo.findById(idRespuesta).orElse(null);
        return respuesta;
    }

    @Override
    public void eliminarRespuesta(Long idRespuesta) {
        respuestaRepo.deleteById(idRespuesta);
    }

    @Override
    public void editarRespuesta(Long idOriginal, Long idNuevo, String descripcion, Pregunta pregunta) {
        Respuesta respuesta = this.traerRespuesta(idOriginal);
        
        
        respuesta.setIdRespuesta(idNuevo);
        respuesta.setDescripcion(descripcion);
        respuesta.setPregunta(pregunta);
        
        this.guardarRespuesta(respuesta);
    }
    
}