
package nicoangeletti.ConsultoraEmpresas.repository;

import nicoangeletti.ConsultoraEmpresas.model.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPreguntaRepository extends JpaRepository<Pregunta , Long>{
    
}
