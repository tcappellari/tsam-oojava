package cappellari.tiziano.ereditarieta.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cappellari.tiziano.ereditarieta.*;

public class ManagerTest {

	@Test
	public void test() {
		Manager d = new Manager();
		// metodi della classe Persona
		d.setNome("Super");
		d.setCognome("Bianchi");
		
		assertEquals("Super, Bianchi", d.bigliettoVisita());
		
		// metodi specifici della classe Dipendente
		d.setStipendio(1000);
		d.setAnzianita(5);
		d.setAzienda(new Azienda());
		
		// metodi specifici della classe Manager
		d.setBonus(20);
		d.setProgetto(new Progetto());
		
		int stip = d.calcolaStipendio();
		assertEquals(6000 , stip);
	}
	
	@Test
	public void testStipendioBasso() {
		Manager d = new Manager();
		// metodi della classe Persona
		d.setNome("Super");
		d.setCognome("Bianchi");
		
		assertEquals("Super, Bianchi", d.bigliettoVisita());
		
		// metodi specifici della classe Dipendente
		d.setStipendio(10);
		d.setAnzianita(1);
		d.setAzienda(new Azienda());
		
		// metodi specifici della classe Manager
		d.setBonus(8);
		d.setProgetto(new Progetto());
		
		int stip = d.calcolaStipendio();
		assertEquals(11 , stip);
	}

}
