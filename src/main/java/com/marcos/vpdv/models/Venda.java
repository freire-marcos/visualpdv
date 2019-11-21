package com.marcos.vpdv.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.marcos.vpdv.base.models.BaseEntity;

import lombok.Data;

@Entity
@Table(name = "venda")
@Data
public class Venda extends BaseEntity implements Serializable {


	@Column(name = "data_hora_venda")
	private LocalDateTime dataHoraVenda;
	
	@Column(name = "nome_cliente")
	private String nomeCliente;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_venda", nullable = false)
	@NotNull @NotEmpty
	private ETipoVenda tipoVenda;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "produto_id")
	private List<Produto> produtos;
	
	@Column(name = "desconto")
	private BigDecimal desconto;
	
	@Column(name = "valor_conta")
	private BigDecimal valorConta;
	
		
	
}
