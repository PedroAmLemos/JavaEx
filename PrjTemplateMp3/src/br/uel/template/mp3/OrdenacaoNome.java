package br.uel.template.mp3;

import java.util.ArrayList;

public class OrdenacaoNome extends Ordenar{

	@Override
	public Boolean comparar(Musica musicaA, Musica musicaB) {
		if(musicaA.nome.compareToIgnoreCase(musicaB.nome) > 0) {
			return true;
		}
		return false;
	}

	public void imprimirOrdenacao(ArrayList<Musica> lista) {
		System.out.println("Ordenação por nome da musica");
		for(Musica musica : lista) {
			System.out.println("Nome: " + musica.getNome()+ " Artista: " + musica.getArtista());
		}
	}

}
