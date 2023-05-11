package br.com.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
	private List<Carta> cartas;
	
	// Constructor
	public Baralho() {
        cartas = new ArrayList<Carta>();
    }
	
	// Getter Setter
	public List<Carta> getCartas() {
		return cartas;
	}
	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}
	
	
	public void adicionarCarta(Carta carta) {
        cartas.add(carta);
    }

    public void embaralhar() {
        //Collections.shuffle(cartas);
    }
}
