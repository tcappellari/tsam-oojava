package cappellari.tiziano.azienda.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import cappellari.tiziano.azienda.base.Azienda;
import cappellari.tiziano.azienda.base.ContrattoLavoro;
import cappellari.tiziano.azienda.base.Dipendente;

public class AziendaTest {

	@Test
	public void testStipendi() {
		
		Azienda microapple = new Azienda();
		microapple.setPiva("00000000001");
		microapple.setRagioneSociale("MicroApple snc");
		
		ContrattoLavoro contratto = new ContrattoLavoro();
		contratto.setTipo("Apprendista");
		contratto.setPagaBase(600*100);
		
		Dipendente bill = new Dipendente();
		bill.setCognome("Gates");
		bill.setNome("Bill");
		bill.setContratto(contratto);
		
		Dipendente steve = new Dipendente();
		steve.setCognome("Jobs");
		steve.setNome("Steve");
		steve.setContratto(contratto);
		
		Dipendente[] dips = new Dipendente[] {
				bill,
				steve
		};
		
		microapple.setDipendenti(dips);
		int stipendi = microapple.stipendi();
		
		assertEquals(120000, stipendi);
	}
	
	@Test
	public void testStipendiZeroDipendenti() {
		
		Azienda microapple = new Azienda();
		microapple.setPiva("00000000001");
		microapple.setRagioneSociale("MicroApple snc");
		
		int stipendi = microapple.stipendi();
		
		assertEquals(0, stipendi);
	}

}
