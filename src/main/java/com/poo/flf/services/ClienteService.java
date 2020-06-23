package com.poo.flf.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.flf.domain.Cliente;
import com.poo.flf.repositories.ClienteRepository;
import com.poo.flf.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"
				+ " id: " + id + ", tipo: " + Cliente.class.getName()));
	}
	
	


}
