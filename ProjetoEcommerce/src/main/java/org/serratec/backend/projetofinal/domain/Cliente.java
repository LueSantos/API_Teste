package org.serratec.backend.projetofinal.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cliente_id")
	@ApiModelProperty(value = "Identificador único do Cliente")
	private Long id;
	
	@NotBlank(message = "O nome do cliente não pode estar vazio")
	@Column(name = "Nome", nullable = false, length = 60)
	@ApiModelProperty(value = "Nome do Usuário acima de 60 caracteteres")
	private String nome;
	
		
	@Size(max = 11)	
	@NotNull(message= "O cpf não pode ser nulo")
	@CPF(message = "Digite um CPF válido")
	@ApiModelProperty(value = "CPF", required = true)
	@Column(name = "Cpf", nullable = false, length = 11)
	private String cpf;
	
	@Email(message = "Digite um e-mail válido")
	@Column(name = "Email", nullable = false, length = 50)
	@ApiModelProperty(value = "Email", required = true)
	private String email;
	
	@Column(name = "Nascimento")
	@Temporal(TemporalType.DATE)
	@ApiModelProperty(value = "Data de Nascimento", required = true)
	private Date dataNascimento;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;
	
	

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		
		return "Código: " + this.id + "\n Nome: " + this.nome + "\n Email: " + this.email;
	}
	
}
