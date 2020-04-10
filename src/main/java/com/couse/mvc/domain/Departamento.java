package com.couse.mvc.domain;

import java.util.ArrayList;

import javax.persistence.*;

import antlr.collections.List;

@Entity
@Table(name="DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{
	
	@Column(name = "nome" , nullable = false , unique = true , length = 60)
	private String nome;
	
	private List<Cargos> cargos = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
