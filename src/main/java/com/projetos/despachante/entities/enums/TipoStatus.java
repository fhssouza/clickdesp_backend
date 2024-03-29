package com.projetos.despachante.entities.enums;

public enum TipoStatus {
	
	ABERTO(1, "Aberto"),
	FINALIZADO(2, "Finalizado");
	
	private int cod;
	private String descricao;
	
	private TipoStatus(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoStatus toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (TipoStatus x : TipoStatus.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}

}
