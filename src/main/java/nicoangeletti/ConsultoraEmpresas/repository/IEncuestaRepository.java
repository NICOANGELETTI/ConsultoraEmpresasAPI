
package nicoangeletti.ConsultoraEmpresas.repository;

import nicoangeletti.ConsultoraEmpresas.model.Encuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEncuestaRepository extends JpaRepository<Encuesta , Long>{
    
}
