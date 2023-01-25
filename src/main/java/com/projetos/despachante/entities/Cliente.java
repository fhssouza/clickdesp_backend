package com.projetos.despachante.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.projetos.despachante.entities.enums.TipoCliente;

@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String cpfOuCnpj;
	private String habilitacao;
	private String email;
	private Integer tipocliente;
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
	Set<Endereco> enderecos = new HashSet<>();
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "tb_telefone")
	private Set<String> telefones = new HashSet<>();
	
	public Cliente() {
	}

	public Cliente(Long id, String nome, String cpfOuCnpj, String habilitacao, String email, TipoCliente tipocliente) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpfOuCnpj = cpfOuCnpj;
		this.habilitacao = habilitacao;
		this.email = email;
		this.tipocliente = tipocliente.getCod();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}

	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}

	public String getHabilitacao() {
		return habilitacao;
	}

	public void setHabilitacao(String habilitacao) {
		this.habilitacao = habilitacao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoCliente getTipocliente() {
		return TipoCliente.toEnum(tipocliente);
	}

	public void setTipocliente(TipoCliente tipocliente) {
		this.tipocliente = tipocliente.getCod();
	}

	public Set<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Set<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Set<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(Set<String> telefones) {
		this.telefones = telefones;
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
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}
	
}
