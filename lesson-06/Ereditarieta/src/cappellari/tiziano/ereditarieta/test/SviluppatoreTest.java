package cappellari.tiziano.ereditarieta.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cappellari.tiziano.ereditarieta.Sviluppatore;

public class SviluppatoreTest {

	@Test
	public void testCalcolaStipendio() {
		Sviluppatore s = new Sviluppatore();
		s.setCognome("Rossi");
		s.setNome("Luca");
		s.setAnzianita(1);
		s.setStipendio(800);
		
		assertEquals(768, s.calcolaStipendio());
	}

}
