package com.poo.flf.domain;

import java.io.Serializable;

import com.poo.flf.model.EntidadeNomeada;

public class Categoria extends EntidadeNomeada implements Serializable {
	private static final long serialVersionUID = 1L;

	public Categoria() {

	}

	public Categoria(String nome) {
		this.setNome(nome);
	}

}
