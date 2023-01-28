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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.projetos.despachante.entities.enums.Procedencia;
import com.projetos.despachante.entities.enums.TipoCombustivel;

@Entity
@Table(name = "tb_veiculo")
public class Veiculo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String placa;
	private String marca;
	private String modelo;
	private String chassi;
	private String renavam;
	private String cor;
	private Integer combustivel;
	private Integer ano;
	private Boolean arrendamento;
	private Integer procedencia;
	private Boolean alienacaoFiduciaria;
	private Integer crv;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date crvData;
	
	@JsonIgnore
	@OneToMany(mappedBy = "veiculo", fetch = FetchType.EAGER)
	private Set<OrdemServico> ordensServicos = new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	public Veiculo() {
	}

	public Veiculo(Long id, String placa, String marca, String modelo, String chassi, String renavam, String cor,
			TipoCombustivel combustivel, Integer ano, Boolean arrendamento, Procedencia procedencia,
			Boolean alienacaoFiduciaria, Integer crv, Date crvData, Cliente cliente) {
		super();
		this.id = id;
		this.placa = placa;
		this.setMarca(marca);
		this.modelo = modelo;
		this.chassi = chassi;
		this.renavam = renavam;
		this.cor = cor;
		this.combustivel = combustivel.getCod();
		this.ano = ano;
		this.arrendamento = arrendamento;
		this.procedencia = procedencia.getCod();
		this.alienacaoFiduciaria = alienacaoFiduciaria;
		this.crv = crv;
		this.crvData = crvData;
		this.setCliente(cliente);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public TipoCombustivel getCombustivel() {
		return TipoCombustivel.toEnum(combustivel);
	}

	public void setCombustivel(TipoCombustivel combustivel) {
		this.combustivel = combustivel.getCod();
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Boolean getArrendamento() {
		return arrendamento;
	}

	public void setArrendamento(Boolean arrendamento) {
		this.arrendamento = arrendamento;
	}

	public Procedencia getProcedencia() {
		return Procedencia.toEnum(procedencia);
	}

	public void setProcedencia(Procedencia procedencia) {
		this.procedencia = procedencia.getCod();
	}

	public Boolean getAlienacaoFiduciaria() {
		return alienacaoFiduciaria;
	}

	public void setAlienacaoFiduciaria(Boolean alienacaoFiduciaria) {
		this.alienacaoFiduciaria = alienacaoFiduciaria;
	}

	public Integer getCrv() {
		return crv;
	}

	public void setCrv(Integer crv) {
		this.crv = crv;
	}

	public Date getCrvData() {
		return crvData;
	}

	public void setCrvData(Date crvData) {
		this.crvData = crvData;
	}

	public Set<OrdemServico> getOrdensServicos() {
		return ordensServicos;
	}

	public void setOrdensServicos(Set<OrdemServico> ordensServicos) {
		this.ordensServicos = ordensServicos;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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
		Veiculo other = (Veiculo) obj;
		return Objects.equals(id, other.id);
	}
	
}
