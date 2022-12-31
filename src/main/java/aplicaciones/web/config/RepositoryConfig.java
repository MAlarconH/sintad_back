package aplicaciones.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import aplicaciones.web.modelo.Tipo_contribuyente;
import aplicaciones.web.modelo.Tipo_documento;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {
	
	@Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Tipo_contribuyente.class, Tipo_documento.class);

    }
}
