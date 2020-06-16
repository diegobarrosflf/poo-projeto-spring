package com.poo.flf.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.poo.flf.model.EntidadeNomeada;

@Entity
public class Filme extends EntidadeNomeada implements Serializable {
	private static final long serialVersionUID = 1L;

	private Double preco;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "FILME_CATEGORIA",
		joinColumns =  @JoinColumn(name ="filme_id"),
		inverseJoinColumns = @JoinColumn(name="categoria_id")
			)
	private List<Categoria> categorias = new ArrayList<>();

	public Filme() {

	}

	public Filme(String nome, Double preco) {
		super();
		this.setNome(nome);
		this.preco = preco;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

}
