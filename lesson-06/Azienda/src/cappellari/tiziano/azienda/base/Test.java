package cappellari.tiziano.azienda;

public class Test {

	public static void main(String[] args) {
		
		if (args.length < 1) {
			System.err.println("manca parametro stipendio");
			return;
		}
		
		String strStipendio = args[0];
		int stipendio = Integer.parseInt(strStipendio);
		
		Azienda microapple = new Azienda();
		microapple.setPiva("00000000001");
		microapple.setRagioneSociale("MicroApple snc");
		
		ContrattoLavoro contratto = new ContrattoLavoro();
		contratto.setTipo("Apprendista");
		contratto.setPagaBase(stipendio*100);
		
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

		System.out.println("Totale stipendi della " 
				+ microapple.getRagioneSociale() 
				+ ": " + stipendi
				+ " centesimi di euro");
	}

}
