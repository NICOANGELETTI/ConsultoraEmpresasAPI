
package nicoangeletti.ConsultoraEmpresas.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Consultora {
    
     @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)  
    private Long idConsultora;
    private String nombreConsultora; 
    private String direccion;
    private String email;
    private String telefono; 
    
    @OneToMany(mappedBy= "consultora")
      List<Empresa> listaEmpresas ;
    
    
    
    
    




    
}
