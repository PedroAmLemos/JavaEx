package br.uel.atendimento;

import java.util.ArrayList;

public class Fila {
	private ArrayList<String> fila = new ArrayList<String>();
	
	public void entrarFila(String nome) {
		this.fila.add(nome);
	}
	
	public void desistirFila(String nome) {
		this.fila.remove(nome);
	}
	
	public void atenderCliente() {
		System.out.println(this.fila.get(0)+" será atendido agora...");
		this.fila.remove(0);
	}
	
	public int buscarPosicao(String nome) {
		int posicao = this.fila.indexOf(nome);
		return posicao;
	}
	
	public void imprimirFIla() {
		for (String nome: this.fila) {
			System.out.printf("%s ", nome);
		}
		System.out.println();
	}
	

}
