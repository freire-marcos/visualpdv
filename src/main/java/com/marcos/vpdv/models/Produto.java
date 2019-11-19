package com.marcos.vpdv.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.marcos.vpdv.base.models.BaseEntity;

@Entity
@Table(name = "produto")
public class Produto extends BaseEntity implements Serializable {

	
	@Column(name = "nome_produto", nullable = false)
	@NotNull @NotEmpty
	private String nomeProduto;
	
	@Column(name = "cod_produto", nullable = false)
	@NotNull @NotEmpty
	private String codProduto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoria_id", nullable = false)
	private Categoria categoria;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subcategoria_id", nullable = false)
	private SubCategoria subCategoria;
	
	@Column(name = "valor_venda", nullable = false)
	@NotNull @NotEmpty
	private BigDecimal valorVenda;
	
	@Column(name = "valor_compra", nullable = false)
	@NotNull @NotEmpty
	private BigDecimal valorCompra;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_validade", nullable = false)
	@NotNull @NotEmpty
	private Calendar dataValidade;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_compra", nullable = false)
	@NotNull @NotEmpty
	private Calendar dataCompra;
	
	@OneToMany
	@Column(name = "fornecedor", nullable = false)
	@NotNull @NotEmpty
	private List<Fornecedor> fornecedor;
}












