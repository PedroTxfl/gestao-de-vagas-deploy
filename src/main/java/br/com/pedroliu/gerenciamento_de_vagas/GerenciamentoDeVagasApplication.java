package br.com.pedroliu.gerenciamento_de_vagas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
//@OpenAPIDefinition(
//	info = @Info(
//		title = "Gerenciamento de Vagas",
//		description = "API responsável pelo gerenciamento de vagas",
//		version = "1"
//	)
//)
//@SecurityScheme(name = "jwt_auth", scheme = "bearer", bearerFormat = "JWT", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class GerenciamentoDeVagasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciamentoDeVagasApplication.class, args);
	}

}
