package cappellari.tiziano.ereditarieta;

public class Manager extends Dipendente {
	
	private int bonus;
	private Progetto progetto;
	
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public Progetto getProgetto() {
		return progetto;
	}
	public void setProgetto(Progetto progetto) {
		this.progetto = progetto;
	}
	
	public int calcolaStipendio() {
		// stipendio è un attributo privato della class Dipendente.
		// privato === non accessibile all'esterno della classe che lo definisce
		// NOTA: l'oggetto Manager contiene l'attributo stipendio (e il suo valore)
		int tot = Math.round(getStipendio() + getStipendio() * getAnzianita() * 1.2f);
		// bonus è privato, ma è accessibile perchè è definito all'interno della stessa classe (Manager)
		return tot + Math.round((tot * bonus) / 100.0f);
	}

}
