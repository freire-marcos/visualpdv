package com.marcos.vpdv.controllers;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.vpdv.controllers.dto.DetalhesProdutoDto;
import com.marcos.vpdv.controllers.dto.ProdutoDto;
import com.marcos.vpdv.controllers.forms.AtualizacaoProdutoForm;
import com.marcos.vpdv.models.Produto;
import com.marcos.vpdv.repository.ProdutoRepository;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public List<ProdutoDto> listarProduto(String nomeProduto){
		if(nomeProduto == null) {
			List<Produto> produtos = produtoRepository.findAll();
			
			return ProdutoDto.converter(produtos);
		}
		else {
			List<Produto> produtos = produtoRepository.findByNomeProduto(nomeProduto);
			return ProdutoDto.converter(produtos);
		}
	}
	
	@PostMapping
	public ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto){
		produtoRepository.save(produto);
		return ResponseEntity.ok().build();
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<DetalhesProdutoDto> detalhar(@PathVariable Long id) {
		Optional<Produto> produto = produtoRepository.findById(id);
		if(produto.isPresent()) {
			return ResponseEntity.ok(new DetalhesProdutoDto(produto.get()));
		}
		return ResponseEntity.notFound().build();
		
	}
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<DetalhesProdutoDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizacaoProdutoForm form){
		Produto produto = form.atualizar(id, produtoRepository);
		return ResponseEntity.ok(new DetalhesProdutoDto(produto));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		
		produtoRepository.deleteById(id);
		
		return ResponseEntity.ok().build();
	}
	
}














