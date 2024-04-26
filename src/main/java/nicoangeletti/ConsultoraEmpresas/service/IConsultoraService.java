
package nicoangeletti.ConsultoraEmpresas.service;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import nicoangeletti.ConsultoraEmpresas.model.Consultora;
import nicoangeletti.ConsultoraEmpresas.model.Empresa;


public interface IConsultoraService {
    
    
    
    
    public void guardarConsultora(Consultora consultora);
    
    public List<Consultora> traerConsultoras();
    
    public Consultora traerConsultora(Long idConsultora);
    
    public void eliminarConsultora(Long idConsultora);

    public void editarConsultora(Long idOriginal, Long idNuevo , String nombreConsultora, String direccion,String email,String telefono , List<Empresa> listaEmpresas);
            
            
            
            
      
    
}
