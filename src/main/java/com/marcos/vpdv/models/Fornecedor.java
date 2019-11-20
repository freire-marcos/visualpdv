package com.marcos.vpdv.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.marcos.vpdv.base.models.BaseEntity;

@Entity
@Table(name = "fornecedor")
public class Fornecedor extends BaseEntity implements Serializable {

	@Column(name = "nome_fantasia", nullable = false)
	@NotNull @NotEmpty
	private String nomeFantasia;
	
	@Column(name = "rasao_social", nullable = false)
	@NotNull @NotEmpty
	private String rasaoSocial;
	
	@Column(name = "cpf_cnpj", nullable = false, unique = true)
	@NotNull @NotEmpty
	private String cpfCnpj;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_pessoa", nullable = false)
	private EnumTipoPessoa tipoPessoa;
		
	@Embedded
	private Endereco endereco;
	
	@Column(name = "contato", nullable = false)
	@NotNull @NotEmpty
	private String contato;
	
	@Column(name = "telefone_1", nullable = false)
	@NotNull @NotEmpty
	private String telefone1;
	
	@Column(name = "telefone_2")
	private String telefone2;
	
	@Column(name = "telefone_3")
	private String telefone3;
	
	@Column(name = "email", nullable = false)
	@NotNull @NotEmpty
	private String email;
	

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRasaoSocial() {
		return rasaoSocial;
	}

	public void setRasaoSocial(String rasaoSocial) {
		this.rasaoSocial = rasaoSocial;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public EnumTipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(EnumTipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	


}
