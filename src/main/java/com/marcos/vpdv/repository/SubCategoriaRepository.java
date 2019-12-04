package com.marcos.vpdv.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.vpdv.models.SubCategoria;

public interface SubCategoriaRepository extends JpaRepository<SubCategoria, Long>{

	SubCategoria findById(int subCategoriaId);

}
