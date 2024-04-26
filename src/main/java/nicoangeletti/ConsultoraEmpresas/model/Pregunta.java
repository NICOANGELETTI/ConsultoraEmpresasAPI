
package nicoangeletti.ConsultoraEmpresas.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Pregunta {
 
       @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)  
    private Long idPregunta;
    private String pregunta;
    
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
   
@OneToMany(mappedBy = "pregunta", cascade = CascadeType.ALL)
private List<Respuesta> opcionesRespuesta;
    
     @ManyToOne
    private Encuesta encuesta;
    
    
    
    
    
    
 
    
    
}
