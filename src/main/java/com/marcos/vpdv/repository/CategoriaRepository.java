package com.marcos.vpdv.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.vpdv.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	Categoria findById(int categoriaId);

}
