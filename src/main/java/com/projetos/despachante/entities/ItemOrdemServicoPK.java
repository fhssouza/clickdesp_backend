package com.projetos.despachante.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ItemOrdemServicoPK implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "ordemservico_id")
	private OrdemServico ordemServico;
	
	@ManyToOne
	@JoinColumn(name = "servico_id")
	private Servico servico;
	
	public OrdemServico getOrdemServico() {
		return ordemServico;
	}
	public void setOrdemServico(OrdemServico ordemServico) {
		this.ordemServico = ordemServico;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ordemServico, servico);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemOrdemServicoPK other = (ItemOrdemServicoPK) obj;
		return Objects.equals(ordemServico, other.ordemServico) && Objects.equals(servico, other.servico);
	}

}
