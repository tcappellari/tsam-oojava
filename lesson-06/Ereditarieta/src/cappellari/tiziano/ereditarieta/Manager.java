package cappellari.tiziano.ereditarieta;

public class Manager extends Dipendente {
	
	int bonus;
	Progetto progetto;
	
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
		int tot = getStipendio() * getAnzianita();
		return tot + Math.round((tot * bonus) / 100.0f);
	}
	

}
