package com.projetos.despachante.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tiposervico")
public class TipoServico implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Descricao;
	
	@OneToMany(mappedBy = "tipoServico")
	Set<OrdemServico> ordensServicos = new HashSet<>();
	
	public TipoServico() {
	}

	public TipoServico(Long id, String descricao) {
		super();
		this.id = id;
		Descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public Set<OrdemServico> getOrdensServicos() {
		return ordensServicos;
	}

	public void setOrdensServicos(Set<OrdemServico> ordensServicos) {
		this.ordensServicos = ordensServicos;
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
		TipoServico other = (TipoServico) obj;
		return Objects.equals(id, other.id);
	}
	
}
