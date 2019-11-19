package com.marcos.vpdv.models;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Fornecedor {

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
	


}
