package com.marcos.vpdv.controllers.forms;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import com.marcos.vpdv.models.Categoria;
import com.marcos.vpdv.models.Fornecedor;
import com.marcos.vpdv.models.Produto;
import com.marcos.vpdv.models.SubCategoria;
import com.marcos.vpdv.repository.ProdutoRepository;

import lombok.Data;

@Data
public class AtualizacaoProdutoForm {

	@NotNull
	private String codProduto;
	@NotNull
	private Categoria categoria;
	@NotNull
	private SubCategoria subCategoria;
	@NotNull
	private BigDecimal valorVenda;
	@NotNull
	private BigDecimal valorCompra;
	@NotNull
	private Fornecedor fornecedor;
	
	public Produto atualizar(Long id, ProdutoRepository produtoRepository) {

		Produto produto = produtoRepository.getOne(id);
		produto.setCodProduto(this.codProduto);
		produto.setCategoria(this.categoria);
		produto.setSubCategoria(this.subCategoria);
		produto.setValorVenda(this.valorVenda);
		produto.setValorCompra(this.valorCompra);
		produto.setFornecedor(this.fornecedor);
		return produto;
	}

}
