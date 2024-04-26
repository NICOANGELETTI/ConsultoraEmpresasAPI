
package nicoangeletti.ConsultoraEmpresas.repository;

import nicoangeletti.ConsultoraEmpresas.model.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRespuestaRepository extends JpaRepository<Respuesta , Long> {
    
}
