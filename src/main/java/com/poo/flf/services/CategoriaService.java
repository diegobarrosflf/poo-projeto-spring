package com.poo.flf.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.poo.flf.domain.Categoria;
import com.poo.flf.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	


}
