package com.gabriel.cursomc.domain;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public abstract class PagamentoComBoleto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date dataVecimento;
	@Temporal(TemporalType.DATE)
	private Date dataPagamento;

	public PagamentoComBoleto() {

	}
}
