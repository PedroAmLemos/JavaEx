package br.uel.ex1;

import java.util.Calendar;

public class HeartRates {
	private String nome;
	private String sobrenome;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;

	public HeartRates(String nome, String sobrenome, int dia, int mes, int ano) {
		this.nome = nome; 
		this.sobrenome = sobrenome;
		this.diaNascimento = dia;
		this.mesNascimento = mes;
		this.anoNascimento = ano;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getDiaNascimento() {
		return diaNascimento;
	}

	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}

	public int getMesNascimento() {
		return mesNascimento;
	}

	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	public int getAnos() {
		Calendar nascimento = Calendar.getInstance();
		Calendar hoje		= Calendar.getInstance();
		
		nascimento.set(this.anoNascimento, this.mesNascimento, this.diaNascimento);
		
		int anos = hoje.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR);
		
		return anos;
	}
	
	public int getFrequenciaMaxima() {
		int frequencia = 220 - this.getAnos();
		return frequencia;
	}
	
	public double getFrequenciaAlvo() {
		double frequencia = this.getFrequenciaMaxima() * 0.85 - this.getFrequenciaMaxima() * 0.5;
		return frequencia;
	}

	public void printDados() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Sobrenome: "+ this.sobrenome);
		System.out.printf("Data de nascimento: %d/%d/%d%n", 
				this.diaNascimento, this.mesNascimento, this.anoNascimento);
		System.out.println("Idade: "+this.getAnos());
		System.out.printf("Frequencia cardiaca maxima: %d%n", this.getFrequenciaMaxima());
		System.out.printf("Frequencia cardiaca alvo: %.2f%n", this.getFrequenciaAlvo());
	}
}
