package br.com.umc.lista.modelo;

import java.util.Calendar;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Produto {
	
	private Long id;
	
	@NotEmpty(message = "Campo não pode estar vazio!") 
	@Size(min=5, message="Descrição deve ter pelo menos 5 caracteres")
	private String categoriaProduto;
	private String descricaoProduto;
	private double quantidadeProduto;
//	private boolean finalizado;
//	@DateTimeFormat(pattern="dd/MM/yyyy")
//	private Calendar dataFinalizacao;
//	private String responsavel;
	
	
//	public String getResponsavel() {
//		return responsavel;
//	}
//
//	public void setResponsavel(String responsavel) {
//		this.responsavel = responsavel;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCategoriaProduto() {
		return categoriaProduto;
	}
	
	public void setCategoriaProduto(String categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	
	public double getQuantidadeProduto() {
		return quantidadeProduto;
	}
	
	public void setQuantidadeProduto(double quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
	
	
	

//	public boolean isFinalizado() {
//		return finalizado;
//	}
//
//	public void setFinalizado(boolean finalizado) {
//		this.finalizado = finalizado;
//	}
//
//	public Calendar getDataFinalizacao() {
//		return dataFinalizacao;
//	}
//
//	public void setDataFinalizacao(Calendar dataFinalizacao) {
//		this.dataFinalizacao = dataFinalizacao;
//	}

}
