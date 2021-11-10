package org.serratec.backend.projetofinal.dto;

import java.util.Date;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;

import org.serratec.backend.projetofinal.domain.Categoria;
import org.serratec.backend.projetofinal.domain.Produto;

public class ProdutoCadastroDTO {
	
	@Size(max = 60, message = "Tamanho máximo de 60 caracteres!")
	private String nome;

	
	@DecimalMin(value = "0.1", message = "Este valor não pode ser menor que 10 centavos!")
	private double preco;
	
	@DecimalMin(value = "0", message = "Este valor não pode ser menor que zero!")
	private Integer quantidade;
	
	
	private Date validade;
	
	private Categoria categoria;
	
	
	public ProdutoCadastroDTO () {
		
	}
	
	//IMPLEMENTAR CATEGORIA AQUI TAMBÉM
	public ProdutoCadastroDTO(Produto produto) {
		super();
		this.nome = produto.getNome();
		this.preco= produto.getPreco();
		this.quantidade = produto.getQuantidade();
		this.validade = produto.getValidade();
		}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	

	
}
