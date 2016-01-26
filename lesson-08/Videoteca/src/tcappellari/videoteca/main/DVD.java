package tcappellari.videoteca.main;

public class DVD extends Supporto {

	// cent di euro
	public int costoNoleggio(int gg) {
		int gglimit = 2;
		if (gg <= gglimit) {
			return gg * 150;
		}
		else {
			return gglimit * 150 + 200 * (gg - gglimit);
		}
		
	}
}
