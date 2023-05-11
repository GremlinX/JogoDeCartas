package br.com.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Jogo {
	private Baralho baralho;
	
	public Jogo(Baralho baralho) {
		this.baralho = baralho;
		popularBaralho(baralho);
		baralho.embaralhar();
	}
	
	public void popularBaralho(Baralho baralho) {
		baralho.adicionarCarta(new Carta("Guerreiro Orc", 1, 1, 1, "Investida"));
	    baralho.adicionarCarta(new Carta("Mago Humano", 2, 2, 2, "Provocar"));
	    baralho.adicionarCarta(new Carta("Ladino Elfo", 3, 3, 3, "Furtividade"));
	    baralho.adicionarCarta(new Carta("Guerreiro Doende", 4, 4, 4, "Apunhalar"));
	    baralho.adicionarCarta(new Carta("Feiticeiro Humano", 5, 5, 5, "Envenenar"));
	    baralho.adicionarCarta(new Carta("Tartaruga Ninja", 2, 3, 4, "Cortes rápidos"));
	    baralho.adicionarCarta(new Carta("Stalker", 2, 3, 4, "Perseguir"));
	    baralho.adicionarCarta(new Carta("Fantasma", 2, 3, 4, "Assustar"));
	    baralho.adicionarCarta(new Carta("Ladrão", 2, 3, 4, "Furtar"));
	    baralho.adicionarCarta(new Carta("Assassino", 2, 3, 4, "Degolar"));
	    baralho.adicionarCarta(new Carta("Franco-Atirador", 2, 3, 4, "Camperar"));
	    baralho.adicionarCarta(new Carta("Necromancer", 2, 3, 4, "Necromancia"));
	}

	public void distribuirCartas(Baralho baralho, List<Jogador> jogadores) {
	    for (int i = 0; i < 5; i++) {
	        for (Jogador jogador : jogadores) {
	        	jogador.comprarCarta();
	        }
	    }
	}
}
