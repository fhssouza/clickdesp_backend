package com.projetos.despachante.entities.enums;

public enum Procedencia {
	
	NACIONAL(1, "Nacional"),
	IMPORTADO(2,"Importado");
	
	private int cod;
	private String descricao;
	
	private Procedencia(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Procedencia toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (Procedencia x : Procedencia.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}

}
