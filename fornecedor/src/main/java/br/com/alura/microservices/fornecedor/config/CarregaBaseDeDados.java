package br.com.alura.microservices.fornecedor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.alura.microservices.fornecedor.model.InfoFornecedor;
import br.com.alura.microservices.fornecedor.repository.InfoRepository;

@Configuration
public class CarregaBaseDeDados {

	@Autowired
	private InfoRepository repository;
	
	@Bean
	CommandLineRunner carregaBanco() {
		return args -> {
			InfoFornecedor fornecedor = new InfoFornecedor(null, "Fornecedor-GO", "GO", "endereco do fornecedor de GO");
			
			repository.save(fornecedor);
		};
	}
	
}
