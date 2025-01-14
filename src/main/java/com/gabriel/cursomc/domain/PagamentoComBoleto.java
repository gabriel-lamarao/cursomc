package com.gabriel.cursomc.domain;

import java.util.Date;

import com.gabriel.cursomc.domain.enums.EstadoPagamento;

import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date dataVecimento;
	@Temporal(TemporalType.DATE)
	private Date dataPagamento;

	public PagamentoComBoleto() {

	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVecimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVecimento = dataVecimento;
	}

	public Date getDataVecimento() {
		return dataVecimento;
	}

	public void setDataVecimento(Date dataVecimento) {
		this.dataVecimento = dataVecimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	
	
}
