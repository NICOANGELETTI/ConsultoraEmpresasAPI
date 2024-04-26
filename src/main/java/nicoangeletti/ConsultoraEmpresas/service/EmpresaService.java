
package nicoangeletti.ConsultoraEmpresas.service;

import java.util.List;
import nicoangeletti.ConsultoraEmpresas.model.Consultora;
import nicoangeletti.ConsultoraEmpresas.model.Empresa;
import nicoangeletti.ConsultoraEmpresas.model.Encuesta;
import nicoangeletti.ConsultoraEmpresas.repository.IEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService implements IEmpresaService{

    
    @Autowired
    IEmpresaRepository empresaRepo;
    
    
    
    @Override
    public void guardarEmpresa(Empresa empresa) {
        empresaRepo.save(empresa);
    }

    @Override
    public List<Empresa> traerEmpresas() {
        List<Empresa> listaEmpresas = empresaRepo.findAll();
        return listaEmpresas;
    }

    @Override
    public Empresa traerEmpresa(Long idEmpresa) {
        Empresa empresa = empresaRepo.findById(idEmpresa).orElse(null);
        return empresa; 
    }

    @Override
    public void eliminarEmpresa(Long idEmpresa) {
        empresaRepo.deleteById(idEmpresa);
        
        
    }

    @Override
    public void editarEmpresa(Long idOriginal, Long idNuevo, String nombreEmpresa, String direccion, String email, String telefono, Consultora consultora, List<Encuesta> listaEncuestas) {
        Empresa empresa = this.traerEmpresa(idOriginal);
        
        empresa.setIdEmpresa(idNuevo);
        empresa.setNombreEmpresa(nombreEmpresa);
        empresa.setDireccion(direccion);
        empresa.setEmail(email);
        empresa.setTelefono(telefono);
        empresa.setConsultora(consultora);
        empresa.setListaEncuestas(listaEncuestas);
        
        this.guardarEmpresa(empresa);

        
        
    }
    
}
