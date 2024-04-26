
package nicoangeletti.ConsultoraEmpresas.controller;

import java.util.List;
import nicoangeletti.ConsultoraEmpresas.model.Categoria;
import nicoangeletti.ConsultoraEmpresas.model.Encuesta;
import nicoangeletti.ConsultoraEmpresas.model.Pregunta;
import nicoangeletti.ConsultoraEmpresas.model.Respuesta;
import nicoangeletti.ConsultoraEmpresas.service.IPreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PreguntaController {
    
    
    @Autowired
    IPreguntaService preguntaServ;
    
    
    
    
      @PostMapping("/pregunta/crear")
    public String crearPregunta(@RequestBody Pregunta pregunta){
        preguntaServ.guardarPregunta(pregunta);
        return "Se ha creado la pregunta con exito";
    }
    
    
    @GetMapping("/pregunta/traerPreguntas")
    public List<Pregunta> traerPreguntas(){
    List<Pregunta> listaPreguntas = preguntaServ.traerPreguntas();
    return listaPreguntas; 
}
    
    
    @GetMapping("/pregunta/traerPregunta/{id}")
    public Pregunta traerEncuesta(@PathVariable Long id){
        Pregunta pregunta = preguntaServ.traerPregunta(id);
        return pregunta;
      
    }
    
    
   @DeleteMapping("/pregunta/eliminarPregunta/{id}")
   public String eliminarPregunta(@PathVariable Long id){
       preguntaServ.eliminarPregunta(id);
       return "Se ha eliminado la pregunta con exito";
       
   }
    
   
   
   
   @PutMapping("pregunta/editarPregunta/{id}")
    public String editarPregunta(@PathVariable Long id ,
                                   @RequestParam Long idNuevo,
                                   @RequestParam String pregunta,
                                   @RequestParam Categoria categoria,
                                   @RequestParam List<Respuesta> listaRespuestas,
                                   @RequestParam Encuesta encuesta
                             ){
        preguntaServ.editarPregunta(idNuevo, idNuevo, pregunta, categoria, listaRespuestas, encuesta);
       
        return "Se ha editado la pregunta con exito";
 
    
    
  
    
}
    
    
    
    
    
}
