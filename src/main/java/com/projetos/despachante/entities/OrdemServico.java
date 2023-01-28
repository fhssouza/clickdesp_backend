package com.projetos.despachante.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projetos.despachante.entities.enums.TipoStatus;

@Entity
@Table(name = "tb_ordemservico")
public class OrdemServico implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date Instante;
	
	private Integer status;
	private String observacao;
	
	@ManyToOne
	@JoinColumn(name = "tipoServico_id")
	private TipoServico tipoServico;
	
	@ManyToOne
	@JoinColumn(name = "veiculo_id")
	private Veiculo veiculo;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@OneToMany(mappedBy = "id.ordemServico", fetch = FetchType.EAGER)
	private Set<ItemOrdemServico> itens = new HashSet<>();
	
	public OrdemServico() {
	}

	public OrdemServico(Long id, Date instante, TipoStatus status, String observacao, Veiculo veiculo,
			TipoServico tipoServico, Cliente cliente) {
		super();
		this.id = id;
		Instante = instante;
		this.status = status.getCod();
		this.observacao = observacao;
		this.veiculo = veiculo;
		this.tipoServico = tipoServico;
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getInstante() {
		return Instante;
	}

	public void setInstante(Date instante) {
		Instante = instante;
	}

	public TipoStatus getStatus() {
		return TipoStatus.toEnum(status);
	}

	public void setStatus(TipoStatus status) {
		this.status = status.getCod();
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Set<ItemOrdemServico> getItens() {
		return itens;
	}

	public void setItens(Set<ItemOrdemServico> itens) {
		this.itens = itens;
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
		OrdemServico other = (OrdemServico) obj;
		return Objects.equals(id, other.id);
	}

}
