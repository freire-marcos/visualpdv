package com.marcos.vpdv.controllers.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import com.marcos.vpdv.models.Produto;

import lombok.Data;

@Data
public class ProdutoDto {

	private int id;
	private String nomeProduto;
	private BigDecimal valorCompra;
	private BigDecimal valorVenda;
	private BigDecimal margemLucro;
	private String fornecedor;
	
	
	public ProdutoDto(Produto produto) {

		this.id = produto.getId();
		this.nomeProduto = produto.getNomeProduto();
		this.valorCompra = produto.getValorCompra();
		this.valorVenda = produto.getValorVenda();
		this.margemLucro = produto.margemLucro();
		this.fornecedor = produto.getFornecedor().getNomeFantasia();
	}


	public static List<ProdutoDto> converter(List<Produto> produtos) {

		return produtos.stream().map(ProdutoDto::new).collect(Collectors.toList());
	}
	
	
}
