package com.marcos.vpdv.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.marcos.vpdv.base.models.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = false)
public class Pessoa extends BaseEntity implements Serializable{

	@Column(name = "nome", nullable = false)
	@NotNull @NotEmpty
	protected String nome;
	
	@Column(name = "cpf", nullable = false)
	@NotNull @NotEmpty
	protected String cpf;
	
	@Column(name = "telefone_1", nullable = false)
	@NotNull @NotEmpty
	protected String telefone1;
	
	@Column(name = "telefone_2")
	protected String telefone2;
	
	@Column(name = "telefone_3")
	private String telefone3;
	
	@Embedded
	protected Endereco endereco;
	
	
	
}
