package com.marcos.vpdv.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = false)
public class Funcionario extends Pessoa implements Serializable {

	@Column(name = "turno", nullable = false)
	@NotNull @NotEmpty
	protected String turno;
	
	@Column(name = "registro", nullable = false)
	@NotNull @NotEmpty
	protected String registro;
	
	@Column(name = "rg", nullable = false)
	@NotNull @NotEmpty
	protected String rg;
	
	@Column(name = "ctps", nullable = false)
	@NotNull @NotEmpty
	protected String ctps;
	
	@Column(name = "salario_base", nullable = false)
	@NotNull @NotEmpty
	private BigDecimal salarioBase;
	
	@Column(name = "email", nullable = false)
	@NotNull @NotEmpty
	protected String email;
	
	
	
}
