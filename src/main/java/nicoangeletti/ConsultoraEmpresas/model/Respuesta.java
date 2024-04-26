
package nicoangeletti.ConsultoraEmpresas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
public class Respuesta {
    
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE) 
    private Long idRespuesta;
    private String descripcion; 
  @ManyToOne
@JoinColumn(name = "pregunta_id")
private Pregunta pregunta;

    

}
