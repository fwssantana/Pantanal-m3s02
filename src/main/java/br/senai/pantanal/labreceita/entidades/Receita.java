package br.senai.pantanal.labreceita.entidades;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Receita {

	@Column
	private String titulo;
	
	@Column
	private int tempoPreparo;
	
	@Column
	private NivelDificuldade nivelDificuldade;
	
	@Column
	private int qntPessoasServidas;
	
	@OneToMany(mappedBy = "receita")
	private List<Ingrediente> ingredientes;
	
	
	private List<String> passosPreparo;
	private TipoReceita tipoReceita;
	private List<Restricao> restricoes;
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}

	public int getTempoPreparo() {
		return tempoPreparo;
	}

	public void setTempoPreparo(int tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}

	public NivelDificuldade getNivelDificuldade() {
		return nivelDificuldade;
	}

	public void setNivelDificuldade(NivelDificuldade nivelDificuldade) {
		this.nivelDificuldade = nivelDificuldade;
	}

	public int getQntPessoasServidas() {
		return qntPessoasServidas;
	}

	public void setQntPessoasServidas(int qntPessoasServidas) {
		this.qntPessoasServidas = qntPessoasServidas;
	}

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public List<String> getPassosPreparo() {
		return passosPreparo;
	}

	public void setPassosPreparo(List<String> passosPreparo) {
		this.passosPreparo = passosPreparo;
	}

	public TipoReceita getTipoReceita() {
		return tipoReceita;
	}

	public void setTipoReceita(TipoReceita tipoReceita) {
		this.tipoReceita = tipoReceita;
	}

	public List<Restricao> getRestricoes() {
		return restricoes;
	}

	public void setRestricoes(List<Restricao> restricoes) {
		this.restricoes = restricoes;
	}
	
}
