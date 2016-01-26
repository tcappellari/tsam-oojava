package tcappellari.videoteca.test.main;

import static org.junit.Assert.*;

import org.junit.Test;

import tcappellari.videoteca.main.*;

public class VideotecaTest {

	@Test
	public void testTotalePreventivo() {
		
		DVD dvd = new DVD();
		//...
		Cassetta cass = new Cassetta();
		//..
		BlueRay br = new BlueRay();
		//...
		
		
		NoleggioFilm nfdvd = new NoleggioFilm();
		nfdvd.setSupporto(dvd);
		nfdvd.setNumeroGiorni(2);
		
		NoleggioFilm nfcass = new NoleggioFilm();
		nfcass.setSupporto(cass);
		nfcass.setNumeroGiorni(1);
		
		NoleggioFilm nfbr = new NoleggioFilm();
		nfbr.setSupporto(br);
		nfbr.setNumeroGiorni(1);
		
	
		//Videoteca vt = new Videoteca();
		int tot = Videoteca.totalePreventivo(new NoleggioFilm[]{nfdvd, nfbr, nfcass});
		assertEquals(300 + 100 + 100, tot);
		
		
	}

}
