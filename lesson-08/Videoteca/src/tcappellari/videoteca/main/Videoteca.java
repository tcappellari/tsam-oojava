package tcappellari.videoteca.main;

public class Videoteca {
	
	
	static public int totalePreventivo(NoleggioFilm[] filmsnoleggiati) {
		
		int tot = 0;
		for(NoleggioFilm nf: filmsnoleggiati) {
			int giorni = nf.getNumeroGiorni();
			Supporto s = nf.getSupporto(); 
			tot += s.costoNoleggio(giorni);
			
		}

		return tot;
	}

}
