import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0;
		
		List<MusicaMP3> musicas = 
				new LinkedList<>();
		
		do {
			
			System.out.println("Digite a sua opção");
			System.out.println("1- Adicionar música");
			System.out.println("2- Ordenar música por título");
			System.out.println("3- Ordenar música por artista");
			System.out.println("4- Buscar música por título");
			System.out.println("5- Buscar música por artista");
			System.out.println("6- Embaralhar lista de músicas");
			System.out.println("7- Sair");
			
			
			opcao = sc.nextInt();
			
			sc.nextLine();
			
			switch (opcao) {
			
			case 1:
				System.out.println("Digite o título da música");
				String titulo = sc.nextLine();
				System.out.println("Digite o nome do artista");
				String artista = sc.nextLine();
				MusicaMP3 novaMusica = new MusicaMP3(titulo, artista);
				musicas.add(novaMusica);
				imprimirListaMusicas(musicas);
				break;
			case 2:
				Collections.sort(musicas,
						new ComparadorMusica(MusicaMP3.CriterioClassificacao.TITULO));
				imprimirListaMusicas(musicas);
				break;
			case 3:
				Collections.sort(musicas,
						new ComparadorMusica(MusicaMP3.CriterioClassificacao.ARTISTA));
				imprimirListaMusicas(musicas);
				break;
			case 4:
				System.out.println("Digite o título da música");
				String tituloBusca = sc.nextLine();
				MusicaMP3 musicaBusca = new MusicaMP3(tituloBusca, null);
				int posicao = Collections.binarySearch(musicas,musicaBusca,
						new ComparadorMusica(MusicaMP3.CriterioClassificacao.TITULO));
				System.out.printf("A música está na posição %d da lista%n", posicao);
				break;
			case 5:
				System.out.println("Digite o nome do artista");
				String artistaBusca = sc.nextLine();
				musicaBusca = new MusicaMP3(null, artistaBusca);
				posicao = Collections.binarySearch(musicas,musicaBusca,
						new ComparadorMusica(MusicaMP3.CriterioClassificacao.ARTISTA));
				System.out.printf("A música está na posição %d da lista%n", posicao);
				break;
			case 6:
				Collections.shuffle(musicas);
				imprimirListaMusicas(musicas);
				break;
			}
			
		} while (opcao != 7);

	}
	
	public static void imprimirListaMusicas(List<MusicaMP3> lista) {
		System.out.println("**********Lista de músicas**********");
		for (MusicaMP3 musica : lista) {
			System.out.println(musica);
		}
		System.out.println("************************************");
	}

}
