package com.test.api.model.entity;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String telefone;
	
	@NotNull
	private String email;
	
	@NotNull
	private String sexo;
	
	// Criando um construtor vazio padrão e outro construtor com parametros obrigatorios
	
	public Usuario(){
		
	}
	
	public Usuario( Long id, String nome, String telefone, String email, String sexo) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.sexo = sexo;
	}
	
	// Criando os getters e setters 
	
	public Long getId(Long id) {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome(String nome) {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getTelefone(String telefone) {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail(String email) {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSexo(String sexo) {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
