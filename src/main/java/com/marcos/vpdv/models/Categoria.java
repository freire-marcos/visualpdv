package com.marcos.vpdv.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.marcos.vpdv.base.models.BaseEntity;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Entity
@Table(name = "categoria")
@Data
public class Categoria extends BaseEntity implements Serializable {

	@Column(name = "descricao")
	private String descricao;
	

	
	
}
