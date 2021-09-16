package br.uel.carro;

public class Carro {
	private String marca;
	private String modelo;

	public int getMarcha(int velocidade) {
		if (velocidade < 20) {
			return 1;
		} else if (velocidade < 30) {
			return 2;
		} else if (velocidade < 40) {
			return 3;
		} else if (velocidade < 50) {
			return 4;
		} else {
			return 5;
		}
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return this.modelo;
	}

}
