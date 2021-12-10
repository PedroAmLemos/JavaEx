package br.uel.template.mp3;

import java.util.ArrayList;

public class OrdenacaoArtista extends Ordenar{

	@Override
	public Boolean comparar(Musica musicaA, Musica musicaB) {
		if(musicaA.artista.compareToIgnoreCase(musicaB.artista) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public void imprimirOrdenacao(ArrayList<Musica> lista) {
		System.out.println("Ordenação por nome do artista");
		for(Musica musica : lista) {
			System.out.println("Artista: " + musica.getArtista()+ " Nome: " + musica.getNome());
		}
	}




}
