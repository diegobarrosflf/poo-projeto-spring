package com.poo.flf;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poo.flf.domain.Categoria;
import com.poo.flf.repositories.CategoriaRepository;

@SpringBootApplication
public class PooProjetoSpringApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(PooProjetoSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria("Ação");
		Categoria cat2 = new Categoria("Terror");
		Categoria cat3 = new Categoria("Comédia");

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

	}

}
