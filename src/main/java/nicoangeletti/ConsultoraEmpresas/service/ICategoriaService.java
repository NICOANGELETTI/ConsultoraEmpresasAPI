
package nicoangeletti.ConsultoraEmpresas.service;

import java.util.List;
import nicoangeletti.ConsultoraEmpresas.model.Categoria;
import nicoangeletti.ConsultoraEmpresas.model.Pregunta;



public interface ICategoriaService {
    
    
    
      public void guardarCategoria(Categoria categoria);
    
    public List<Categoria> traerCategorias();
    
    public Categoria traerCategoria(Long idCategoria);
    
    public void eliminarCategoria(Long idCategoria);

    public void editarCategoria(Long idOriginal, Long idNuevo ,String nombreCategoria , List<Pregunta> listaPreguntas );
            
         
      

           
            
            
}
