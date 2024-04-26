
package nicoangeletti.ConsultoraEmpresas.repository;

import nicoangeletti.ConsultoraEmpresas.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria , Long> {
    
}
