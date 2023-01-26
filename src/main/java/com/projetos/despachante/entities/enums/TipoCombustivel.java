package com.projetos.despachante.entities.enums;

public enum TipoCombustivel {

	ALCOOL(1, "Alcool"),
	GASOLINA(2, "Gasolina"),
	FLEX(3, "Flex"),
	DIESEL(4, "Diesel");
	
	private int cod;
	private String descricao;
	
	private TipoCombustivel(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCombustivel toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (TipoCombustivel x : TipoCombustivel.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
