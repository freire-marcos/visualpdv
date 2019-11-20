package com.marcos.vpdv.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.marcos.vpdv.base.models.BaseEntity;

@Entity
@Table(name = "pessoa")
public class Pessoa extends BaseEntity implements Serializable{

	@Column(name = "nome", nullable = false)
	@NotNull @NotEmpty
	private String nome;
	
	@Column(name = "cpf", nullable = false)
	@NotNull @NotEmpty
	private String cpf;
	
	@Column(name = "telefone_1", nullable = false)
	@NotNull @NotEmpty
	private String telefone1;
	
	@Column(name = "telefone_2")
	private String telefone2;
	
	@Column(name = "telefone_3")
	private String telefone3;
	
	@Embedded
	private Endereco endereco;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getTelefone3() {
		return telefone3;
	}

	public void setTelefone3(String telefone3) {
		this.telefone3 = telefone3;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
	
	
	
}
