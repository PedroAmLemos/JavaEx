package br.uel.template.mp3;

import java.util.ArrayList;

public abstract class Ordenar {
	public abstract Boolean comparar(Musica musicaA, Musica musicaB);
	
	public abstract void imprimirOrdenacao(ArrayList<Musica>lista);
	
	private ArrayList<Musica>lista;
	
	public void ordenacao() {
		for(int i=0; i<lista.size()-1; i++) {
			for(int j=0; j<lista.size()-i-1; j++) {
				if(this.comparar(lista.get(j), lista.get(j+1))) {
					Musica temp = lista.get(j+1);
					lista.set(j+1, lista.get(j));
					lista.set(j, temp);
				}
			}			
		}
		this.imprimirOrdenacao(lista);
		
	}
	public ArrayList<Musica> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Musica> lista) {
		this.lista = lista;
	}

}
