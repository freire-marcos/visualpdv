package com.marcos.vpdv.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.marcos.vpdv.base.models.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "produto")
@Data
@EqualsAndHashCode(callSuper=false)
public class Produto extends BaseEntity implements Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 8419560703375603687L;

	@Column(name = "nome_produto", nullable = false)
	@NotNull @NotEmpty
	private String nomeProduto;
	
	@Column(name = "cod_produto", nullable = false)
	@NotNull @NotEmpty
	private String codProduto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoria_id", nullable = false)
	private Categoria categoria;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subcategoria_id", nullable = false)
	private SubCategoria subCategoria;
	
	@Column(name = "valor_venda", nullable = false)
	@NotNull
	private BigDecimal valorVenda;
	
	@Column(name = "valor_compra", nullable = false)
	@NotNull
	private BigDecimal valorCompra;
	
	@Column(name = "data_validade", nullable = false)
	@NotNull @NotEmpty
	private String dataValidade;
	
	@Column(name = "data_compra", nullable = false)
	@NotNull @NotEmpty
	private String dataCompra;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fornecedor_id", nullable = false)
	private Fornecedor fornecedor;
	
	// subtrai o valor de compra, do valor de venda. retornando uma margem aproximada de lucro
	public BigDecimal margemLucro() {
		
		BigDecimal margem = this.valorVenda.subtract(valorCompra);
		return margem;
	}

	public Produto() {
		
	}
	
	
}












