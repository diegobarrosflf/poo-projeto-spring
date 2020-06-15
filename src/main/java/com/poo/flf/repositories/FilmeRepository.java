package com.poo.flf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poo.flf.domain.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Integer>{

}
