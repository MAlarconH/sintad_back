package aplicaciones.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import aplicaciones.web.modelo.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	public Usuario findByUsername(String username);
}
