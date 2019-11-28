package com.marcos.vpdv.repository;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.vpdv.models.Categoria;
import com.marcos.vpdv.models.Fornecedor;
import com.marcos.vpdv.models.Produto;
import com.marcos.vpdv.models.SubCategoria;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	List<Produto> findByNomeProduto(String nomeProduto);


}
