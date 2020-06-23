package com.poo.flf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poo.flf.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
