package com.marcos.vpdv.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.vpdv.models.Categoria;
import com.marcos.vpdv.models.Produto;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	Categoria findById(Id categoriaId);

}
