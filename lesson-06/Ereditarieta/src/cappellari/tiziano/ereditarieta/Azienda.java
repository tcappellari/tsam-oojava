package cappellari.tiziano.ereditarieta;

public class Azienda {
	
	private Sviluppatore[] sviluppatori;
	private Manager[] managers;
	
	// inserito per gestire stagista
	private Stagista[] stagisti;
	
	
	public int totaleStipendi() {
		int tot = 0;
		for(Sviluppatore s: sviluppatori) {
			tot += s.calcolaStipendio();
		}
		for(Manager m: managers) {
			tot += m.calcolaStipendio();
		}
		
		// inserito per gestire stagista
		for(Stagista s: stagisti) {
			tot += s.calcolaStipendio();
		}
		return tot;
	}



	public Sviluppatore[] getSviluppatori() {
		return sviluppatori;
	}



	public void setSviluppatori(Sviluppatore[] sviluppatori) {
		this.sviluppatori = sviluppatori;
	}



	public Manager[] getManagers() {
		return managers;
	}



	public void setManagers(Manager[] managers) {
		this.managers = managers;
	}


	// inserito per gestire stagista
	public Stagista[] getStagisti() {
		return stagisti;
	}

	// inserito per gestire stagista
	public void setStagisti(Stagista[] stagisti) {
		this.stagisti = stagisti;
	}
	
	

}
