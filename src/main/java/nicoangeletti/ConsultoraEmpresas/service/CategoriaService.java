
package nicoangeletti.ConsultoraEmpresas.service;

import java.util.List;
import nicoangeletti.ConsultoraEmpresas.model.Categoria;
import nicoangeletti.ConsultoraEmpresas.model.Pregunta;
import nicoangeletti.ConsultoraEmpresas.repository.ICategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService implements ICategoriaService {

    
    @Autowired
    ICategoriaRepository categoriaRepo;
    
    @Override
    public void guardarCategoria(Categoria categoria) {
        categoriaRepo.save(categoria);
    }

    @Override
    public List<Categoria> traerCategorias() {
        List<Categoria> listaCategorias = categoriaRepo.findAll();
        return listaCategorias;
    }

    @Override
    public Categoria traerCategoria(Long idCategoria) {
        Categoria categoria = categoriaRepo.findById(idCategoria).orElse(null);
        return categoria;
    }

    @Override
    public void eliminarCategoria(Long idCategoria) {
        categoriaRepo.deleteById(idCategoria);
    }

    @Override
    public void editarCategoria(Long idOriginal, Long idNuevo, String nombreCategoria, List<Pregunta> listaPreguntas) {
        Categoria categoria = this.traerCategoria(idOriginal);
        
        categoria.setIdCategoria(idNuevo);
        categoria.setNombreCategoria(nombreCategoria);
        categoria.setPreguntas(listaPreguntas);
        
        this.guardarCategoria(categoria);
        
        
        
    }
    
}
