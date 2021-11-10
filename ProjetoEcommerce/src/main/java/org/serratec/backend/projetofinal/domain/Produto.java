package org.serratec.backend.projetofinal.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.DecimalMin;


@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "produto_id")
	private Long id;
	
	
	@Column(name = "Nome", nullable = false, length = 60)
	private String nome;

	
	@DecimalMin(value = "0.1", message = "Este valor não pode ser menor que 10 centavos!")
	@Column(name = "Preço", nullable = false)
	private double precoVenda;
	
	@DecimalMin(value = "0", message = "Este valor não pode ser menor que zero!")
	@Column(name = "Quantidade", nullable = false)
	private Integer quantidade;
	
	@Column(name = "Validade", nullable = false)
	private Date validade;
	
	@ManyToOne
	@JoinColumn(name = "id_endereco")
	private Categoria categoria;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getPreco() {
		return precoVenda;
	}



	public void setPreco(double preco) {
		this.precoVenda = preco;
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
