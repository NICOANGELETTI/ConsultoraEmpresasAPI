
package nicoangeletti.ConsultoraEmpresas.controller;

import jakarta.persistence.OneToMany;
import java.util.List;
import nicoangeletti.ConsultoraEmpresas.model.Consultora;
import nicoangeletti.ConsultoraEmpresas.model.Empresa;
import nicoangeletti.ConsultoraEmpresas.service.IConsultoraService;
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
public class ConsultoraController {
    
    
    
    @Autowired
     IConsultoraService consultoraServ;
    
    
    
    
        @PostMapping("/consultora/crear")
    public String crearConsultora(@RequestBody Consultora consultora){
        consultoraServ.guardarConsultora(consultora);
        return "Se ha creado la consultora con exito";
    }
    
    
    @GetMapping("/consultora/traerConsultoras")
    public List<Consultora> traerConsultoras(){
    List<Consultora> listaConsultoras = consultoraServ.traerConsultoras();
    return listaConsultoras ;
}
    
    
    @GetMapping("/consultora/traerConsultora/{id}")
    public Consultora traerConsultora(@PathVariable Long id){
        Consultora consultora = consultoraServ.traerConsultora(id);
        return consultora;
      
    }
    
    
   @DeleteMapping("/consultora/eliminarConsultora/{id}")
   public String eliminarConsultora(@PathVariable Long id){
       consultoraServ.eliminarConsultora(id);
       return "Se ha eliminado la consultora con exito";
       
   }
    
   
   
   
   @PutMapping("consultora/editarConsultora/{id}")
    public String editarConsultora(@PathVariable Long id ,
                                   @RequestParam Long idNuevo,
                                   @RequestParam String nombreConsultora,
                                   @RequestParam String direccion,
                                   @RequestParam String email,
                                   @RequestParam String telefono,
                                   @RequestParam List<Empresa> listaEmpresas){
        consultoraServ.editarConsultora(id, idNuevo, nombreConsultora, direccion, email, telefono, listaEmpresas);
        return "Se ha editado la consultora con exito" ; 
    }
 
    
   
}


