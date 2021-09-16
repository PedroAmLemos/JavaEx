package uel.br.funcionario;

public class Funcionario {
	private String nome;
	private double salario;
	static double vale;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void changeVale(double taxa) {
		vale = vale * taxa;
	}
	
	public double getSalarioTotal() {
		return vale + this.salario;
	}

}
