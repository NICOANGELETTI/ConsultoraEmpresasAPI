package nicoangeletti.ConsultoraEmpresas.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Encuesta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)  
    private Long idEncuesta;
    
    private String nombreEncuesta;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin; 
    
    @ManyToOne
    @JoinColumn(name = "empresa_id") // nombre de la columna en la tabla Encuesta
    private Empresa empresa; // Relación ManyToOne con Empresa
    
    @OneToMany(mappedBy = "encuesta", cascade = CascadeType.ALL)
    private List<Pregunta> listaPreguntas;
    
    // Constructor, getters y setters omitidos para brevedad
}
