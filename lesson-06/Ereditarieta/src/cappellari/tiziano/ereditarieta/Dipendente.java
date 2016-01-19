package cappellari.tiziano.ereditarieta;

public class Dipendente extends Persona {

	int stipendio;
	int anzianita;
	Azienda azienda;
	public int getStipendio() {
		return stipendio;
	}
	public void setStipendio(int euroStipendio) {
		this.stipendio = euroStipendio;
	}
	public int getAnzianita() {
		return anzianita;
	}
	public void setAnzianita(int anniAnzianita) {
		this.anzianita = anniAnzianita;
	}
	public Azienda getAzienda() {
		return azienda;
	}
	public void setAzienda(Azienda azienda) {
		this.azienda = azienda;
	}
	
	public int calcolaStipendio() {
		return stipendio * anzianita;
	}
}
