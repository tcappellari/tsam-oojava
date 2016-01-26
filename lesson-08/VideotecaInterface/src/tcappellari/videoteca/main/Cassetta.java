package tcappellari.videoteca.main;

public class Cassetta extends Supporto {

	public int costoNoleggio(int gg) {
		int gglimit = 1;
		if (gg <= gglimit) {
			return gg * 100;
		}
		else {
			return gglimit * 100 + 200 * (gg - gglimit);
		}
	}

}
