
package nicoangeletti.ConsultoraEmpresas.repository;

import nicoangeletti.ConsultoraEmpresas.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpresaRepository extends JpaRepository<Empresa , Long> {
    
}
