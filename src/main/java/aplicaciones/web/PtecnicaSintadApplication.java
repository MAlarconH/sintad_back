package aplicaciones.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import aplicaciones.web.modelo.Usuario;
import aplicaciones.web.service.UsuarioService;

@SpringBootApplication
public class PtecnicaSintadApplication implements CommandLineRunner {
	
	@Autowired(required=true)
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private UsuarioService usuarioService;
	
	public static void main(String[] args) {
		SpringApplication.run(PtecnicaSintadApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		String password = "12345";

		for (int i=0; i<4; i++) {
			String passwordBcrypt = passwordEncoder.encode(password);
			System.out.println(passwordBcrypt);
		}

		Usuario usuario = usuarioService.findByUsername("malarconh");
		System.out.println(usuario.toString());
	}

}
