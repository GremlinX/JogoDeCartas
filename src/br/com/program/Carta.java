package br.com.program;

public class Carta {
	private String nome;
    private int custo;
    private int poder;
    private int vida;
    private String efeito;
    
    // Constructor
    public Carta(String nome, int custo, int poder, int vida, String efeito) {
        this.nome = nome;
        this.custo = custo;
        this.poder = poder;
        this.vida = vida;
        this.efeito = efeito;
    }
    
    //Getters Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCusto() {
		return custo;
	}
	public void setCusto(int custo) {
		this.custo = custo;
	}
	public int getPoder() {
		return poder;
	}
	public void setPoder(int poder) {
		this.poder = poder;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public String getEfeito() {
		return efeito;
	}
	public void setEfeito(String efeito) {
		this.efeito = efeito;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: ");
		sb.append(nome + " | ");
		sb.append("Custo: ");
		sb.append(custo + " | ");
		sb.append("Poder: ");
		sb.append(poder + " | ");
		sb.append("Vida: ");
		sb.append(vida + " | ");
		sb.append("Efeito: ");
		sb.append(efeito + "\n");
		return sb.toString();
	}
}
