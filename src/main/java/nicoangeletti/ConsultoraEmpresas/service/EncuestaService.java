
package nicoangeletti.ConsultoraEmpresas.service;

import java.time.LocalDateTime;
import java.util.List;
import nicoangeletti.ConsultoraEmpresas.model.Empresa;
import nicoangeletti.ConsultoraEmpresas.model.Encuesta;
import nicoangeletti.ConsultoraEmpresas.model.Pregunta;
import nicoangeletti.ConsultoraEmpresas.repository.IEncuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncuestaService implements IEncuestaService {

    
    @Autowired
    IEncuestaRepository encuestaRepo;
    
    @Override
    public void guardarEncuesta(Encuesta encuesta) {
        encuestaRepo.save(encuesta);

    }

    @Override
    public List<Encuesta> traerEncuestas() {
        List<Encuesta> listaEncuestas = encuestaRepo.findAll();
        return listaEncuestas;
    }

    @Override
    public Encuesta traerEncuesta(Long idEncuesta) {
        Encuesta encuesta = encuestaRepo.findById(idEncuesta).orElse(null);
        return encuesta;
    }

    @Override
    public void eliminarEncuesta(Long idEncuesta) {
        encuestaRepo.deleteById(idEncuesta);
    }

    @Override
    public void editarEncuesta(Long idOriginal, Long idNuevo, String nombreEncuesta, LocalDateTime fechaInicio, LocalDateTime fechaFin, Empresa empresa, List<Pregunta> listaPreguntas) {
       Encuesta encuesta = this.traerEncuesta(idOriginal);
       
       encuesta.setNombreEncuesta(nombreEncuesta);
       encuesta.setFechaInicio(fechaInicio);
       encuesta.setFechaFin(fechaFin);
       encuesta.setEmpresa(empresa);
       encuesta.setListaPreguntas(listaPreguntas);
       
       this.guardarEncuesta(encuesta);
       
    }
    
}
