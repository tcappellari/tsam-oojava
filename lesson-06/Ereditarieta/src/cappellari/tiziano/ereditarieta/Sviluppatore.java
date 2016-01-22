package cappellari.tiziano.ereditarieta;

public class Sviluppatore extends Dipendente {
	
	private String[] linguaggiPreferiti;
	
	public int calcolaStipendio() {
		
		// 80% del stipendio del Dipendente
		return Math.round(super.calcolaStipendio() * 80.0f / 100);

	}

	public String[] getLinguaggiPreferiti() {
		return linguaggiPreferiti;
	}

	public void setLinguaggiPreferiti(String[] linguaggiPreferiti) {
		this.linguaggiPreferiti = linguaggiPreferiti;
	}
	

}
