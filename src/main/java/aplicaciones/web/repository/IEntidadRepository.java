package aplicaciones.web.repository;

import aplicaciones.web.modelo.Entidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEntidadRepository extends JpaRepository<Entidad, Integer> {

}
