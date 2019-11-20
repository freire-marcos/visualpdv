package com.marcos.vpdv.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "garcon")
public class Garcon extends Funcionario implements Serializable {

	@Column(name = "adicional")
	private BigDecimal adicional;
	
	

	public BigDecimal getAdicional() {
		return adicional;
	}

	public void setAdicional(BigDecimal adicional) {
		this.adicional = adicional;
	}
	
	
}
