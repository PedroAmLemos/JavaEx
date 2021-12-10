import java.util.Comparator;

public class ComparadorMusica implements Comparator<MusicaMP3> {
	
	private MusicaMP3.CriterioClassificacao criterio;
	
	public ComparadorMusica(MusicaMP3.CriterioClassificacao pCriterio) {
		this.criterio = pCriterio;
	}

	@Override
	public int compare(MusicaMP3 o1, MusicaMP3 o2) {
		
		if (this.criterio.equals(MusicaMP3.CriterioClassificacao.ARTISTA)) {
			return o1.getArtista().compareToIgnoreCase(o2.getArtista());
		} else {
			return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
		}
	}

}
