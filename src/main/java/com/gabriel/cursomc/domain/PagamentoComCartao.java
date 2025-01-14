package com.gabriel.cursomc.domain;

import jakarta.persistence.Entity;

@Entity
public class PagamentoComCartao {
	private static final long serialVersionUID = 1L;

	private Integer numeroDeParcelas;

	public PagamentoComCartao() {

	}

	public PagamentoComCartao(Integer numeroDeParcelas) {
		super();
		this.numeroDeParcelas = numeroDeParcelas;
	}

}
