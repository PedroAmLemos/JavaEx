package br.uel.empresa;

public class Gerente {
	private double salario;
	String nome;
	
	public Gerente(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void aumentarSalario() {
		this.setSalario(this.getSalario() * 1.1);
	}
	
	public void aumentarSalario(double taxa) {
		this.salario *= (1 + (taxa/100));
	}

}
