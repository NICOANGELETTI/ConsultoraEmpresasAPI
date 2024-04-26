
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
public class Categoria {
    
    
       @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)  
    private Long idCategoria;
    private String nombreCategoria; 
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<Pregunta> preguntas = new ArrayList<>();

    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
