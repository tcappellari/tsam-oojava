package cappellari.tiziano.ereditarieta.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cappellari.tiziano.ereditarieta.Azienda;
import cappellari.tiziano.ereditarieta.Manager;
import cappellari.tiziano.ereditarieta.Progetto;
import cappellari.tiziano.ereditarieta.Stagista;
import cappellari.tiziano.ereditarieta.Sviluppatore;

public class AziendaTest extends Azienda {

	@Test
	public void test() {
		
		Manager d = new Manager();
		d.setStipendio(1000); //metodo del Dipendente
		d.setAnzianita(5); //metodo del Dipendente
		d.setBonus(120); //metodo del Manager

		Sviluppatore s1 = new Sviluppatore();
		s1.setAnzianita(1); //metodo del Dipendente
		s1.setStipendio(800); //metodo del Dipendente
		
		Sviluppatore s2 = new Sviluppatore();
		s2.setAnzianita(2); //metodo del Dipendente
		s2.setStipendio(800); //metodo del Dipendente
		
		Stagista stag = new Stagista();
		stag.setAnzianita(5);
		stag.setStipendio(1000);
		
		
		Azienda a = new Azienda();
		
		// impostare manager + sviluppatore su azienda
		a.setManagers(new Manager[] {d});
		a.setSviluppatori(new Sviluppatore[]{s1, s2});
		a.setStagisti(new Stagista[]{stag});
		
		assertEquals(17164, a.totaleStipendi());
		
	}

}
