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
	

}
