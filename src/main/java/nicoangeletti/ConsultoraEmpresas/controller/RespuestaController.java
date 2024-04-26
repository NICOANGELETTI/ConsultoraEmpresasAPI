
package nicoangeletti.ConsultoraEmpresas.controller;

import java.util.List;
import nicoangeletti.ConsultoraEmpresas.model.Pregunta;
import nicoangeletti.ConsultoraEmpresas.model.Respuesta;
import nicoangeletti.ConsultoraEmpresas.service.IRespuestaService;
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
public class RespuestaController {
    
    
    @Autowired
    IRespuestaService respuestaServ;
    
    
    
    
    
      @PostMapping("/respuesta/crear")
    public String crearRespuesta(@RequestBody Respuesta respuesta){
        respuestaServ.guardarRespuesta(respuesta);
        return "Se ha creado la respuesta con exito";
    }
    
    
    @GetMapping("/respuesta/traerRespuestas")
    public List<Respuesta> traerRespuestas(){
    List<Respuesta> listaRespuesta = respuestaServ.traerRespuestas();
    return listaRespuesta; 
}
    
    
    @GetMapping("/respuesta/traerRespuesta/{id}")
    public Respuesta traerRespuesta(@PathVariable Long id){
        Respuesta respuesta = respuestaServ.traerRespuesta(id);
        return respuesta;
      
    }
    
    
   @DeleteMapping("/respuesta/eliminarRespuesta/{id}")
   public String eliminarRespuesta(@PathVariable Long id){
       respuestaServ.eliminarRespuesta(id);
       return "Se ha eliminado la respuesta con exito";
       
   }
    
   
   
   
   @PutMapping("respuesta/editarRespuesta/{id}")
    public String editarRespuesta(@PathVariable Long id ,
                                   @RequestParam Long idNuevo,
                                   @RequestParam String descripcion,
                                   @RequestParam Pregunta pregunta
                             ){
        respuestaServ.editarRespuesta(id, idNuevo, descripcion, pregunta);
       
        return "Se ha editado la respuesta con exito";
 
    
    
  
    
}
    
    
    
}
