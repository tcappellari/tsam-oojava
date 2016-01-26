package tcappellari.videoteca.main;


// non posso creare un oggetto istanza di una classe astratta. errore in compile time.
public abstract class Supporto {
	
	private Film film;

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}
	
	// metodo per far felice il compilatore
	/*public int costoNoleggio(int gg) {
		return 0; //valore di default
	}*/

	
	public abstract int costoNoleggio(int gg);
	
}
