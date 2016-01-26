package tcappellari.videoteca.main;

public class BlueRay extends Supporto implements CalcoloCostoNoleggio {

	// l'annotation Override NON serve per abilitare
	// l'override, ma per far verificare al compilatore
	// che il metodo sia effettivamente un override.
	@Override
	public int costoNoleggio(int gg) {
		float penale = 0.1f;
		if (gg == 1)
			return 100;
		else
			//return Math.round(costoNoleggio(gg - 1) + costoNoleggio(gg - 1) * penale); 
			return Math.round(costoNoleggio(gg - 1) * (1 + penale));
	}
}
