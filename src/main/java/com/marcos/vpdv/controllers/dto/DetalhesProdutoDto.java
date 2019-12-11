package com.marcos.vpdv.controllers.dto;

import java.math.BigDecimal;

import com.marcos.vpdv.models.Produto;

import lombok.Data;

@Data
public class DetalhesProdutoDto {

	private String nomeProduto;
	private String codProduto;
	private String categoria;
	private String subCategoria;
	private BigDecimal valorVenda;
	private BigDecimal valorCompra;
	private BigDecimal margem;
	private String dataValidade;
	private String dataCompra;
	private String fornecedor;
	
	public DetalhesProdutoDto(Produto produto) {
		this.nomeProduto = produto.getNomeProduto();
		this.codProduto = produto.getCodProduto();
		this.categoria = produto.getCategoria().getDescricao();
		this.subCategoria = produto.getSubCategoria().getDescricao();
		this.valorVenda = produto.getValorVenda();
		this.valorCompra = produto.getValorCompra();
		this.margem = produto.margemLucro();
		this.dataValidade = produto.getDataValidade();
		this.dataCompra = produto.getDataCompra();
		this.fornecedor = produto.getFornecedor().getNomeFantasia();
	}
}
