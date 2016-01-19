package cappellari.tiziano.ereditarieta.test;

import static org.junit.Assert.*;

import org.junit.Test;
import cappellari.tiziano.ereditarieta.*;

public class PersonaTest {

	@Test
	public void test() {
		Persona p = new Persona();
		p.setNome("Luca");
		p.setCognome("Rossi");
		assertEquals("Luca, Rossi", p.bigliettoVisita());
	}

}
