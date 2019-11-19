package com.marcos.vpdv.models;

public enum EnumTipoPessoa {

	FISICA("Física"),
	JURIDICA("Jurídica");
	
	private String descricao;

	private EnumTipoPessoa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
