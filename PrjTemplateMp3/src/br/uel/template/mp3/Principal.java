package br.uel.template.mp3;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Musica>lista = new ArrayList<Musica>();
		Musica musicaA = new Musica("echoes", "pink floyd", "echoes");
		Musica musicaB = new Musica("smile", "david gilmour", "on a island");
		Musica musicaC = new Musica("dancing queen", "abba", "arrival");
		Musica musicaD = new Musica("across the universe", "beatles", "let it be");
		lista.add(musicaC);
		lista.add(musicaB);
		lista.add(musicaA);
		lista.add(musicaD);
		
		for(Musica musica : lista) {
			System.out.println("Nome: " + musica.getNome()+ " Artista: " + musica.getArtista());
		}
		System.out.println();
		Ordenar nome = new OrdenacaoNome(); 
		nome.setLista(lista);
		nome.ordenacao();

		System.out.println();		
		Ordenar artista = new OrdenacaoArtista();
		artista.setLista(lista);
		artista.ordenacao();

	}

}
