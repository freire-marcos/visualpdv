package com.marcos.vpdv.controllers.forms;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import com.marcos.vpdv.models.Produto;
import com.marcos.vpdv.repository.ProdutoRepository;

public class AtualizacaoProdutoForm {

	@NotNull
	private String codProduto;
	@NotNull
	private int categoria;
	@NotNull
	private int subCategoria;
	@NotNull
	private BigDecimal valorVenda;
	@NotNull
	private BigDecimal valorCompra;
	@NotNull
	private int fornecedor;
	
	public Produto atualizar(int id, ProdutoRepository produtoRepository) {

		Produto produto = produtoRepository.findById(id);
		produto.setCodProduto(this.codProduto);
		produto.getCategoria().setId(categoria);
		produto.getSubCategoria().setId(subCategoria);
		produto.setValorVenda(valorVenda);
		produto.setValorCompra(valorCompra);
		produto.getFornecedor().setId(fornecedor);
		return produto;
	}

}
