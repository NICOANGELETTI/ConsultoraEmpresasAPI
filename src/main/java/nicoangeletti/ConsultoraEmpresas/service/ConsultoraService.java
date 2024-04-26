
package nicoangeletti.ConsultoraEmpresas.service;

import java.util.List;
import nicoangeletti.ConsultoraEmpresas.model.Consultora;
import nicoangeletti.ConsultoraEmpresas.model.Empresa;
import nicoangeletti.ConsultoraEmpresas.repository.IConsultoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultoraService implements IConsultoraService {

    @Autowired
    IConsultoraRepository consultoraRepo;
    
    @Override
    public void guardarConsultora(Consultora consultora) {
        consultoraRepo.save(consultora);
    }

    @Override
    public List<Consultora> traerConsultoras() {
       List<Consultora> listaConsultoras = consultoraRepo.findAll();
       return listaConsultoras;

    }

    @Override
    public Consultora traerConsultora(Long idConsultora) {
       Consultora consultora = consultoraRepo.findById(idConsultora).orElse(null);
       return consultora;

    }

    @Override
    public void eliminarConsultora(Long idConsultora) {
        consultoraRepo.deleteById(idConsultora);
    }

    @Override
    public void editarConsultora(Long idOriginal, Long idNuevo, String nombreConsultora, String direccion, String email, String telefono, List<Empresa> listaEmpresas) {
        Consultora consultora = this.traerConsultora(idOriginal);
        consultora.setIdConsultora(idNuevo);
        consultora.setNombreConsultora(nombreConsultora);
        consultora.setDireccion(direccion);
        consultora.setEmail(email);
        consultora.setTelefono(telefono);
        consultora.setListaEmpresas(listaEmpresas);
        
        
        this.guardarConsultora(consultora);
        
        
        
    }
    
}


