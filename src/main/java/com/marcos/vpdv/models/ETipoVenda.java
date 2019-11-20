package com.marcos.vpdv.models;

public enum ETipoVenda {

	BALCAO("balcao"),
	MESA("mesa"),
	DELIVERY("delivery");
	
	private String descricao;

	private ETipoVenda(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
