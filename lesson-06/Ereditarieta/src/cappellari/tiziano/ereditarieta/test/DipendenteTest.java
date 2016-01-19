package cappellari.tiziano.ereditarieta.test;

import static org.junit.Assert.*;

import org.junit.Test;
import cappellari.tiziano.ereditarieta.*;

public class DipendenteTest {

	@Test
	public void test() {
		Dipendente d = new Dipendente();
		// metodi della classe Persona
		d.setNome("Marco");
		d.setCognome("Bianchi");
		
		assertEquals("Marco, Bianchi", d.bigliettoVisita());
		
		// metodi specifici della classe Dipendente
		d.setStipendio(1000);
		d.setAnzianita(5);
		d.setAzienda(new Azienda());
		
		int stip = d.calcolaStipendio();
		assertEquals(5000, stip);
		
	}

}
