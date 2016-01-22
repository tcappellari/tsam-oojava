package cappellari.tiziano.azienda.base;

public class Azienda {

	private String ragioneSociale;
	private String piva;
	private Dipendente[] dipendenti;
	
	public int stipendi() {
		if (dipendenti == null)
			return 0;
		
		int tot = 0;
		for(Dipendente d: dipendenti) {
			tot += d.stipendio();
		}
		return tot;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getPiva() {
		return piva;
	}

	public void setPiva(String piva) {
		this.piva = piva;
	}

	public Dipendente[] getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(Dipendente[] dipendenti) {
		this.dipendenti = dipendenti;
	}
	
	
}
