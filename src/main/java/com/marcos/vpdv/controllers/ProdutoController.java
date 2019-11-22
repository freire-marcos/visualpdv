package com.marcos.vpdv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.vpdv.controllers.dto.ProdutoDto;
import com.marcos.vpdv.models.Produto;
import com.marcos.vpdv.repository.ProdutoRepository;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
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
}
