
package nicoangeletti.ConsultoraEmpresas.service;

import java.util.List;
import nicoangeletti.ConsultoraEmpresas.model.Categoria;
import nicoangeletti.ConsultoraEmpresas.model.Encuesta;
import nicoangeletti.ConsultoraEmpresas.model.Pregunta;
import nicoangeletti.ConsultoraEmpresas.model.Respuesta;
import nicoangeletti.ConsultoraEmpresas.repository.IPreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreguntaService implements IPreguntaService {

    
    
    @Autowired
    IPreguntaRepository preguntaRepo;
    
    
    @Override
    public void guardarPregunta(Pregunta pregunta) {
        preguntaRepo.save(pregunta);

    }

    @Override
    public List<Pregunta> traerPreguntas() {
    List<Pregunta> listaPreguntas = preguntaRepo.findAll();
    return listaPreguntas;
    
    }

    @Override
    public Pregunta traerPregunta(Long idPregunta) {
      Pregunta pregunta = preguntaRepo.findById(idPregunta).orElse(null);
      return pregunta;
    }

    @Override
    public void eliminarPregunta(Long idPregunta) {
        preguntaRepo.deleteById(idPregunta);
        
    }

    @Override
    public void editarPregunta(Long idOriginal, Long idNuevo, String pregunta, Categoria categoria, List<Respuesta> listasRespuestas, Encuesta encuesta) {
        Pregunta preguntaEdit = this.traerPregunta(idOriginal);
        
        preguntaEdit.setIdPregunta(idOriginal);
        preguntaEdit.setPregunta(pregunta);
        preguntaEdit.setCategoria(categoria);
        preguntaEdit.setOpcionesRespuesta(listasRespuestas);
        preguntaEdit.setEncuesta(encuesta);
    }
    
}
