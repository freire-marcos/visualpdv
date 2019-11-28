package com.marcos.vpdv.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.marcos.vpdv.base.models.BaseEntity;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Entity
@Table(name = "subcategoria")
@Data
public class SubCategoria extends BaseEntity implements Serializable{

	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoria_id", nullable = false)
	private Categoria categoria;


	
}
