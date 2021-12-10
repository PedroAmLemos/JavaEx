package br.uel.decorator;

public class SucoBasico implements Suco {
	
	private String nome;
	
	private double preco;
	
	public SucoBasico(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

}
