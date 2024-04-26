package nicoangeletti.ConsultoraEmpresas.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Empresa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)  
    private Long idEmpresa; 
    
    private String nombreEmpresa;
    private String direccion; 
    private String email;
    private String telefono; 
    
    @ManyToOne
    @JoinColumn(name = "consultora_id") // nombre de la columna en la tabla Empresa
    private Consultora consultora; // Relación ManyToOne con Consultora
    
    @OneToMany(mappedBy = "empresa")
     List<Encuesta> listaEncuestas;
    
}
