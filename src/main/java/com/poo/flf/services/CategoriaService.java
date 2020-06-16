package com.poo.flf.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.flf.domain.Categoria;
import com.poo.flf.repositories.CategoriaRepository;
import com.poo.flf.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"
				+ " id: " + id + ", tipo: " + Categoria.class.getName()));
	}
	
	


}
