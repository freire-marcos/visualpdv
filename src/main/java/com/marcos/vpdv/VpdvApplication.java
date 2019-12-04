package com.marcos.vpdv;

import java.math.BigDecimal;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcos.vpdv.models.Categoria;
import com.marcos.vpdv.models.Fornecedor;
import com.marcos.vpdv.models.Produto;
import com.marcos.vpdv.models.SubCategoria;
import com.marcos.vpdv.repository.ProdutoRepository;

@SpringBootApplication
public class VpdvApplication {

	public static void main(String[] args) {
		SpringApplication.run(VpdvApplication.class, args);
		
		
//		Produto produto = new Produto();
//		produto.setNomeProduto("cerveja teste");
//		produto.setCodProduto("0001");
//		produto.getCategoria().setId(1);
//		produto.getSubCategoria().setId(1);
//		BigDecimal valorVenda = new BigDecimal(7.50);
//		produto.setValorVenda(valorVenda);
//		BigDecimal valorCompra = new BigDecimal(3.50);
//		produto.setValorCompra(valorCompra);
//		produto.setDataValidade("25-03-2020");
//		produto.setDataCompra("01-12-2019");
//		produto.getFornecedor().setId(3);
//		
//		ProdutoRepository produtoRepository = null;
//		produtoRepository.save(produto);
		
	}

}
