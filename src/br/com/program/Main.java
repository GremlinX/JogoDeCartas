package br.com.program;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Cria baralho
		Baralho baralho = new Baralho();
		// Cria jogo
		Jogo jogo = new Jogo(baralho);
		// Cria jogadores; inicializa a lista jogadores
		List<Jogador> jogadores = new ArrayList<Jogador>();
		
		// System.out.println(baralho.getCartas());
		jogadores.add(new Jogador("Jogador 1", baralho));
	    jogadores.add(new Jogador("Jogador 2", baralho));
	    jogo.distribuirCartas(baralho, jogadores);
		System.out.println(jogadores.get(0).getCartasDoJogador());
		System.out.println(jogadores.get(1).getCartasDoJogador());
		System.out.println(baralho.getCartas());
	}
}
