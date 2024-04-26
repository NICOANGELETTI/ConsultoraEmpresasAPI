
package nicoangeletti.ConsultoraEmpresas.service;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;
import nicoangeletti.ConsultoraEmpresas.model.Consultora;
import nicoangeletti.ConsultoraEmpresas.model.Empresa;
import nicoangeletti.ConsultoraEmpresas.model.Encuesta;


public interface IEmpresaService {
    
 
      public void guardarEmpresa(Empresa empresa);
    
    public List<Empresa> traerEmpresas();
    
    public Empresa traerEmpresa(Long idEmpresa);
    
    public void eliminarEmpresa(Long idEmpresa);

    public void editarEmpresa(Long idOriginal, Long idNuevo , String nombreEmpresa, String direccion,String email,String telefono ,Consultora consultora, List<Encuesta> listaEncuestas);
            
            
        
            
    
    
    
    
}
