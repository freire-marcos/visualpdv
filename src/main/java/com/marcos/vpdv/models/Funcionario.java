package com.marcos.vpdv.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "funcionario")
public class Funcionario extends Pessoa implements Serializable {

	@Column(name = "turno", nullable = false)
	@NotNull @NotEmpty
	private String turno;
	
	@Column(name = "registro", nullable = false)
	@NotNull @NotEmpty
	private String registro;
	
	@Column(name = "rg", nullable = false)
	@NotNull @NotEmpty
	private String rg;
	
	@Column(name = "ctps", nullable = false)
	@NotNull @NotEmpty
	private String ctps;
	
	@Column(name = "salario_base", nullable = false)
	@NotNull @NotEmpty
	private BigDecimal salarioBase;
	
	@Column(name = "email", nullable = false)
	@NotNull @NotEmpty
	private String email;
	
	

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public BigDecimal getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(BigDecimal salarioBase) {
		this.salarioBase = salarioBase;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
