package br.senai.pantanal.labreceita.entidades;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Ingrediente {

	@ManyToOne
	@JoinColumn(name = "id_receita")
	private Receita receita;
	
}
