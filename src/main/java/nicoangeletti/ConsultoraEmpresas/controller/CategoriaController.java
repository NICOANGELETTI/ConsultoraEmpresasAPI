
package nicoangeletti.ConsultoraEmpresas.controller;

import java.util.List;
import nicoangeletti.ConsultoraEmpresas.model.Categoria;
import nicoangeletti.ConsultoraEmpresas.model.Pregunta;
import nicoangeletti.ConsultoraEmpresas.service.ICategoriaService;
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
public class CategoriaController {
    
    
    
     @Autowired
     ICategoriaService categoriaServ;
    
   
    
        @PostMapping("/categoria/crear")
    public String crearCategoria(@RequestBody Categoria categoria){
        categoriaServ.guardarCategoria(categoria);
        return "Se ha creado la consultora con exito";
    }
    
    
    @GetMapping("/categoria/traerCategorias")
    public List<Categoria> traerCategorias(){
    List<Categoria> listaCategorias = categoriaServ.traerCategorias();
    return listaCategorias ;
}
    
    
    @GetMapping("/categoria/traerCategoria/{id}")
    public Categoria traerCategoria(@PathVariable Long id){
        Categoria consultora = categoriaServ.traerCategoria(id);
        return consultora;
      
    }
    
    
   @DeleteMapping("/categoria/eliminarCategoria/{id}")
   public String eliminarCategoria(@PathVariable Long id){
       categoriaServ.eliminarCategoria(id);
       return "Se ha eliminado la categoria con exito";
       
   }
    
   
   
   
   @PutMapping("categoria/editarCategoria/{id}")
    public String editarCategoria(@PathVariable Long id ,
                                   @RequestParam Long idNuevo,
                                   @RequestParam String nombreCategoria,
                                   @RequestParam List<Pregunta> listaPreguntas){
       categoriaServ.editarCategoria(idNuevo, idNuevo, nombreCategoria, listaPreguntas);
        return "Se ha editado la consultora con exito" ; 
    }
    
   
 
    
    
    
    
    
}
