package com.marcos.vpdv.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.marcos.vpdv.base.models.BaseEntity;

@Entity
@Table(name = "categoria")
public class Categoria extends BaseEntity implements Serializable {

	@Column(name = "descricao")
	private String descricao;
	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
