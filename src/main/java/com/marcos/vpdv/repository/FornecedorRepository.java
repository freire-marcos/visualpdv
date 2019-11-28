package com.marcos.vpdv.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.vpdv.models.Fornecedor;
import com.marcos.vpdv.models.SubCategoria;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long>{


	Fornecedor findById(Id fornecedorId);

}
