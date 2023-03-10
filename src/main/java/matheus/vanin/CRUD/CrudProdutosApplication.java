package matheus.vanin.CRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CrudProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudProdutosApplication.class, args);
	}

}
