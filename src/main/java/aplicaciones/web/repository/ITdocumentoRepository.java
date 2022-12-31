package aplicaciones.web.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import aplicaciones.web.modelo.Tipo_documento;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "documentos")
public interface ITdocumentoRepository extends PagingAndSortingRepository<Tipo_documento, Integer>{

}
