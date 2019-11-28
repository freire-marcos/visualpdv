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

import lombok.Data;

@Entity
@Table(name = "produto")
@Data
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
	@NotNull
	private BigDecimal valorVenda;
	
	@Column(name = "valor_compra", nullable = false)
	@NotNull
	private BigDecimal valorCompra;
	
	@Column(name = "data_validade", nullable = false)
	@NotNull @NotEmpty
	private String dataValidade;
	
	@Column(name = "data_compra", nullable = false)
	@NotNull @NotEmpty
	private String dataCompra;
	
	@ManyToOne
	@JoinColumn(name = "fornecedor_id", nullable = false)
	private Fornecedor fornecedor;
	
	// subtrai o valor de compra, do valor de venda. retornando uma margem aproximada de lucro
	public BigDecimal margemLucro() {
		
		BigDecimal margem = this.valorVenda.subtract(valorCompra);
		return margem;
	}

	public Produto() {
		
	}

	public Produto(@NotNull @NotEmpty String nomeProduto, @NotNull @NotEmpty String codProduto, Categoria categoria,
			SubCategoria subCategoria, @NotNull BigDecimal valorVenda, @NotNull BigDecimal valorCompra,
			@NotNull @NotEmpty String dataValidade, @NotNull @NotEmpty String dataCompra, Fornecedor fornecedor) {
		super();
		this.nomeProduto = nomeProduto;
		this.codProduto = codProduto;
		this.categoria = categoria;
		this.subCategoria = subCategoria;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.dataValidade = dataValidade;
		this.dataCompra = dataCompra;
		this.fornecedor = fornecedor;
	}
	
	
}












