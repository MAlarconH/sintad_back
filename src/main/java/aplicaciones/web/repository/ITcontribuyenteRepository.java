package aplicaciones.web.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import aplicaciones.web.modelo.Tipo_contribuyente;

@RepositoryRestResource(path = "contribuyentes")
public interface ITcontribuyenteRepository extends PagingAndSortingRepository<Tipo_contribuyente, Integer> {

}
