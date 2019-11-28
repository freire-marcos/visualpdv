package com.marcos.vpdv.controllers.forms;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.marcos.vpdv.models.Categoria;
import com.marcos.vpdv.models.Fornecedor;
import com.marcos.vpdv.models.Produto;
import com.marcos.vpdv.models.SubCategoria;
import com.marcos.vpdv.repository.CategoriaRepository;
import com.marcos.vpdv.repository.FornecedorRepository;
import com.marcos.vpdv.repository.ProdutoRepository;
import com.marcos.vpdv.repository.SubCategoriaRepository;

import lombok.Data;

@Data
public class ProdutoForm {

	@NotNull @NotEmpty
	private String nomeProduto;
	
	@NotNull @NotEmpty
	private String codProduto;
	
	@NotNull
	private Id categoriaId;
	
	@NotNull
	private Id subCategoriaId;
	
	@NotNull
	private BigDecimal valorVenda;
	
	@NotNull
	private BigDecimal valorCompra;
	
	@NotNull @NotEmpty
	private String dataValidade;
	
	@NotNull @NotEmpty
	private String dataCompra;
	
	private Id fornecedorId;

	public Produto converter(CategoriaRepository categoriaRepository, 
			SubCategoriaRepository subCategoriaRepository, 
			FornecedorRepository fornecedorRepository) {
		
		Categoria categoria = categoriaRepository.findById(categoriaId);
		SubCategoria subCategoria = subCategoriaRepository.findById(subCategoriaId);
		Fornecedor fornecedor = fornecedorRepository.findById(fornecedorId);
		
		return new Produto(nomeProduto, codProduto, categoria, subCategoria,
				valorVenda, valorCompra, dataValidade, dataCompra, fornecedor);
	}
}
