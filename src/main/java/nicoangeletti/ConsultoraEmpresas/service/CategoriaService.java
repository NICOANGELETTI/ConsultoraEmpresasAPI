
package nicoangeletti.ConsultoraEmpresas.service;

import java.util.List;
import nicoangeletti.ConsultoraEmpresas.model.Categoria;
import nicoangeletti.ConsultoraEmpresas.model.Pregunta;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService implements ICategoriaService {

    @Override
    public void guardarCategoria(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Categoria> traerCategorias() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Categoria traerCategoria(Long idCategoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarCategoria(Long idCategoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarCategoria(Long idOriginal, Long idNuevo, String nombreCategoria, List<Pregunta> listaPreguntas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
