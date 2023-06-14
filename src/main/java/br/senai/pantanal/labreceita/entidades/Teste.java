package br.senai.pantanal.labreceita.entidades;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		Receita receita1 = new Receita();
		
		List<Restricao> restricoes = new ArrayList<>();
		restricoes.add(Restricao.AMENDOIM);
		restricoes.add(Restricao.GLUTEN);
		
		receita1.setRestricoes(restricoes);
	}
	
}
