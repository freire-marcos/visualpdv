package com.marcos.vpdv.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.vpdv.models.Categoria;
import com.marcos.vpdv.models.SubCategoria;

public interface SubCategoriaRepository extends JpaRepository<SubCategoria, Long>{

	SubCategoria findById(Id subCategoriaId);

}
