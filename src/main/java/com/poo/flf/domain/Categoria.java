package com.poo.flf.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import com.poo.flf.model.EntidadeNomeada;

@Entity
public class Categoria extends EntidadeNomeada implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToMany(mappedBy = "categorias")
	private List<Filme> filmes = new ArrayList<>();
	
	public Categoria() {

	}

	public Categoria(String nome) {
		this.setNome(nome);
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}

}
