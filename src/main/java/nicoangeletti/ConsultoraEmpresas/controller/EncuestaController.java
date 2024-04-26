
package nicoangeletti.ConsultoraEmpresas.controller;

import java.time.LocalDateTime;
import java.util.List;
import nicoangeletti.ConsultoraEmpresas.model.Empresa;
import nicoangeletti.ConsultoraEmpresas.model.Encuesta;
import nicoangeletti.ConsultoraEmpresas.model.Pregunta;
import nicoangeletti.ConsultoraEmpresas.service.IEncuestaService;
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
public class EncuestaController {
    
    
    @Autowired
    IEncuestaService encuestaServ;
    
    
    
    
        @PostMapping("/encuesta/crear")
    public String crearEncuesta(@RequestBody Encuesta encuesta){
        encuestaServ.guardarEncuesta(encuesta);
        return "Se ha creado la encuesta con exito";
    }
    
    
    @GetMapping("/encuesta/traerEncuestas")
    public List<Encuesta> traerEncuestas(){
    List<Encuesta> listaEncuestas = encuestaServ.traerEncuestas();
    return listaEncuestas; 
}
    
    
    @GetMapping("/encuesta/traerEncuesta/{id}")
    public Encuesta traerEncuesta(@PathVariable Long id){
        Encuesta encuesta = encuestaServ.traerEncuesta(id);
        return encuesta;
      
    }
    
    
   @DeleteMapping("/encuesta/eliminarEncuesta/{id}")
   public String eliminarEncuesta(@PathVariable Long id){
       encuestaServ.eliminarEncuesta(id);
       return "Se ha eliminado la encuesta con exito";
       
   }
    
   
   
   
   @PutMapping("encuesta/editarEncuesta/{id}")
    public String editarEncuesta(@PathVariable Long id ,
                                   @RequestParam Long idNuevo,
                                   @RequestParam String nombreEncuesta,
                                   @RequestParam LocalDateTime fechaInicio,
                                   @RequestParam LocalDateTime fechaFin,
                                   @RequestParam Empresa empresa,
                                   @RequestParam List<Pregunta> listaPreguntas
                             ){
        encuestaServ.editarEncuesta(id, idNuevo, nombreEncuesta, fechaInicio, fechaFin, empresa, listaPreguntas);
       
        return "Se ha editado la encuesta con exito";
 
    
    
    
    
}
    
}
