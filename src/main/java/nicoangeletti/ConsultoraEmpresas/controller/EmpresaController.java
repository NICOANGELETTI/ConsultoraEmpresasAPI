
package nicoangeletti.ConsultoraEmpresas.controller;

import java.util.List;
import nicoangeletti.ConsultoraEmpresas.model.Consultora;
import nicoangeletti.ConsultoraEmpresas.model.Empresa;
import nicoangeletti.ConsultoraEmpresas.model.Encuesta;
import nicoangeletti.ConsultoraEmpresas.service.IEmpresaService;
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
public class EmpresaController {
    
    
    
    @Autowired
    IEmpresaService empresaServ;
    
    
    
    
        @PostMapping("/empresa/crear")
    public String crearEmpresa(@RequestBody Empresa empresa){
        empresaServ.guardarEmpresa(empresa);
        return "Se ha creado la empresa con exito";
    }
    
    
    @GetMapping("/empresa/traerEmpresas")
    public List<Empresa> traerEmpresas(){
    List<Empresa> listaConsultoras = empresaServ.traerEmpresas();
    return listaConsultoras ;
}
    
    
    @GetMapping("/empresa/traerEmpresa/{id}")
    public Empresa traerEmpresa(@PathVariable Long id){
        Empresa empresa = empresaServ.traerEmpresa(id);
        return empresa;
      
    }
    
    
   @DeleteMapping("/empresa/eliminarEmpresa/{id}")
   public String eliminarEmpresa(@PathVariable Long id){
       empresaServ.eliminarEmpresa(id);
       return "Se ha eliminado la empresa con exito";
       
   }
    
   
   
   
   @PutMapping("empresa/editarEmpresa/{id}")
    public String editarEmpresa(@PathVariable Long id ,
                                   @RequestParam Long idNuevo,
                                   @RequestParam String nombreEmpresa,
                                   @RequestParam String direccion,
                                   @RequestParam String email,
                                   @RequestParam String telefono,
                                   @RequestParam Consultora consultora,
                                   @RequestParam List<Encuesta> listaEncuestas){
        empresaServ.editarEmpresa(id, idNuevo, nombreEmpresa, direccion, email, telefono, consultora, listaEncuestas);
        return "Se ha editado la empresa con exito" ; 
    
 
    
    
    
    
}
    
}
