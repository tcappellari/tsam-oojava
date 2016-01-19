package cappellari.tiziano.azienda.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cappellari.tiziano.azienda.test.base.AziendaTest;
import cappellari.tiziano.azienda.test.base.DipendenteTest;

@RunWith(Suite.class)
@SuiteClasses({AziendaTest.class, DipendenteTest.class})
public class AllTests {

}
