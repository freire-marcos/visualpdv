package com.marcos.vpdv.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "garcon")
@Data
@EqualsAndHashCode(callSuper = false)
public class Garcon extends Funcionario implements Serializable {

	@Column(name = "adicional")
	private BigDecimal adicional;
	
		
}
