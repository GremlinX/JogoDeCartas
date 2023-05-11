package br.com.program;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
	private String nome;
	private Baralho baralho;
	private ArrayList<Carta> cartasDaMao;
	
	//Constructor
	public Jogador(String nome, Baralho baralho) {
        this.setNome(nome);
        this.baralho = baralho;
        this.cartasDaMao = new ArrayList<Carta>();
    }
	
	// Getter Setter
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Carta> getCartasDoJogador() {
		return cartasDaMao;
	}
	
	public void comprarCarta() {
		Carta cartaDoBaralho = baralho.getCartas().remove(0);
		getCartasDoJogador().add(cartaDoBaralho);
    }



	
}
