package com.poo.flf.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poo.flf.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@GetMapping
	public List<Categoria> test() {
		
		List<Categoria> categorias = new ArrayList<>();
		Categoria cat1 = new Categoria("Ação");
		Categoria cat2 = new Categoria("Terror");
		
		categorias.add(cat1);
		categorias.add(cat2);
		
		return categorias;
		
	}

}
