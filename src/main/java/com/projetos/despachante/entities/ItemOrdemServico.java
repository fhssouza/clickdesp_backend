package com.projetos.despachante.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_itemordemservico")
public class ItemOrdemServico implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@EmbeddedId
	private ItemOrdemServicoPK id = new ItemOrdemServicoPK();
	
	private Double valor;
	private Double desconto;
	private Double valorLiquido;
	
	public ItemOrdemServico() {
	}

	public ItemOrdemServico(OrdemServico ordemServico, Servico servico, Double valor, Double desconto, Double valorLiquido) {
		super();
		id.setOrdemServico(ordemServico);
		id.setServico(servico);
		this.valor = valor;
		this.desconto = desconto;
		this.valorLiquido = valorLiquido;
	}
	
	@JsonIgnore
	public OrdemServico getOrdemServico() {
		return id.getOrdemServico();
	}
	
	public Servico getServico() {
		return id.getServico();
	}

	public ItemOrdemServicoPK getId() {
		return id;
	}

	public void setId(ItemOrdemServicoPK id) {
		this.id = id;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(Double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemOrdemServico other = (ItemOrdemServico) obj;
		return Objects.equals(id, other.id);
	}

}
