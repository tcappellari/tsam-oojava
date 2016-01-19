package cappellari.tiziano.azienda.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import cappellari.tiziano.azienda.base.ContrattoLavoro;
import cappellari.tiziano.azienda.base.Dipendente;

public class DipendenteTest {

	@Test
	public void testStipendio() {
		ContrattoLavoro contratto = new ContrattoLavoro();
		contratto.setTipo("Apprendista");
		contratto.setPagaBase(600*100);
		
		Dipendente bill = new Dipendente();
		bill.setCognome("Gates");
		bill.setNome("Bill");
		bill.setContratto(contratto);
		
		assertEquals(600*100, bill.stipendio());
	}

}
