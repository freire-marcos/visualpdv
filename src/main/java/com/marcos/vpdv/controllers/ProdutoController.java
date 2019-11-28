package com.marcos.vpdv.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.vpdv.controllers.dto.ProdutoDto;
import com.marcos.vpdv.controllers.forms.ProdutoForm;
import com.marcos.vpdv.models.Produto;
import com.marcos.vpdv.repository.CategoriaRepository;
import com.marcos.vpdv.repository.FornecedorRepository;
import com.marcos.vpdv.repository.ProdutoRepository;
import com.marcos.vpdv.repository.SubCategoriaRepository;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private SubCategoriaRepository subCategoriaRepository;
	
	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	@GetMapping
	public List<ProdutoDto> listaProduto(String nomeProduto){
		if(nomeProduto == null) {
			List<Produto> produtos = produtoRepository.findAll();
			
			return ProdutoDto.converter(produtos);
		}
		else {
			List<Produto> produtos = produtoRepository.findByNomeProduto(nomeProduto);
			return ProdutoDto.converter(produtos);
		}
	}
	
//	@PostMapping()
//	public ResponseEntity<ProdutoForm> cadastrarProduto(@RequestBody ProdutoForm produtoForm){
//		Produto produto = produtoForm.converter(categoriaRepository, subCategoriaRepository, fornecedorRepository);
//		produtoRepository.save(produto);
//		return ResponseEntity.ok().build();
//	}
	@PostMapping
	public ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto){
		produtoRepository.save(produto);
		return ResponseEntity.ok().build();
	}
	
}














