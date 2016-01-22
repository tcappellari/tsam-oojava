package cappellari.tiziano.ereditarieta;

// DREAM
public class AziendaSmart {

	private Dipendente[] dipendenti;
	
	public int totaleStipendi() {
		int tot = 0;
		for(Dipendente dip: dipendenti) {
			
			// AAAH!!!!
			// il tipo dato di dip è Dipendente.
			// ma io voglio chiamare il metodo calcolaStipendio()
			// di sviluppatore, stagista...
			
			// secondo fatto.
			// il tipo dato di dip è Dipendente A COMPILE TIME. 
			// a run-time (ovvero durante l'esecuzione
			// dip è un riferimento a un oggetto che di volta in volta
			// può essere Sviluppatore, Manager, Stagista...
			
			// late binding (ovvero legame tra oggetto e metodo chiamato
			// avviene a run-time).
			
			// Note:
			// questo comporta che:
			// - durante lo sviluppo di una determinata classe/metodo non
			// so quale sarà l'effettivo codice eseguito nella chiamata
			// al metodo
					
			// polimorfismo: dip è di due tipi: è un Dipendente (a compile time) ma anche un Sviluppatore o Stagista..
			tot += dip.calcolaStipendio();
		}
		return tot;
	}

	public Dipendente[] getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(Dipendente[] dipendenti) {
		this.dipendenti = dipendenti;
	}
	
	
}
