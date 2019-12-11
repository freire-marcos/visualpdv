package com.marcos.vpdv.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.vpdv.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	List<Produto> findByNomeProduto(String nomeProduto);

	Optional<Produto> findById(int id);
	Produto getOne(int id);


}
