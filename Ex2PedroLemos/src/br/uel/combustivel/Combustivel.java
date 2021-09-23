package br.uel.combustivel;

public class Combustivel {
	private String nomeCombustivel;
	private double preco;

	public Combustivel(String nome, double preco) {
		this.nomeCombustivel = nome;
		this.preco = preco;
	}

	public String getNomeCombustivel() {
		return nomeCombustivel;
	}

	public void setNomeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double absLitro(double qntLitro) {
		double preco = qntLitro * this.preco;
		System.out.println("O preço de "+ qntLitro+ " litros da gasolina "+ this.nomeCombustivel +" é "+preco +" reais");
		return preco;
	}
	
	public double absDin(double qntDin) {
		double qntLitro = qntDin / preco;
		System.out.println("Foram abastecidos "+ qntLitro +" litros " + "com " +qntDin +" reais, o combustível utilizado foi a " +this.nomeCombustivel);
		return qntLitro;
	}

}
