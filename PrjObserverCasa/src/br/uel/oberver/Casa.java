package br.uel.oberver;

import java.util.HashSet;
import java.util.Set;


public class Casa implements Subject{
	private Set<Observer> pessoas = new HashSet<Observer>();
	private int porta; // 0 fechado 1 aberto
	
	@Override
	public void attach(Observer observer) {
		pessoas.add(observer);
		
	}

	@Override
	public void detach(Observer observer) {
		pessoas.remove(observer);		
	}
	
	@Override
	public void notificar() {
		// TODO Auto-generated method stub
		for(Observer pessoa : pessoas) {
			pessoa.update(this);
		}
		
	}
	
	public void abrirPorta() {
		this.setPorta(1);
		this.notificar();
	}

	public void fecharPorta() {
		this.setPorta(0);
	}

	
	// so pra tirar o warning
	public int getPorta() {
		return porta;
	}

	public void setPorta(int porta) {
		this.porta = porta;
	}
	

}
