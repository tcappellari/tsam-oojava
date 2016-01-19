package cappellari.tiziano.commercialista;

import cappellari.tiziano.azienda.Azienda;
import cappellari.tiziano.azienda.ContrattoLavoro;
import cappellari.tiziano.azienda.Dipendente;

public class TestCommercialista {
	
	public static void main(String[] args) {
		
	
		Azienda sun = new Azienda();
		sun.setPiva("00000000001");
		sun.setRagioneSociale("MicroApple snc");
		
		ContrattoLavoro contratto = new ContrattoLavoro();
		contratto.setTipo("Apprendista");
		contratto.setPagaBase(3000*100);
		
		Dipendente bill = new Dipendente();
		bill.setCognome("Moon");
		bill.setNome("X");
		bill.setContratto(contratto);
		
		Dipendente steve = new Dipendente();
		steve.setCognome("Saturn");
		steve.setNome("Y");
		steve.setContratto(contratto);
		
		Dipendente[] dips = new Dipendente[] {
				bill,
				steve
		};
		
		sun.setDipendenti(dips);
		int stipendi = sun.stipendi();

		System.out.println("Totale stipendi della " 
				+ sun.getRagioneSociale() 
				+ ": " + stipendi
				+ " centesimi di euro");
		
	}

}
