
public class Car {

	String model;
	Engine motore; // Aggragazione
	Pneumatico[] pneumatici; // Aggregazione di cardinalità # 4
	//Pneumatico sxant;
	//Pneumatico sxpost;
	//Pneumatico dxant;
	//Pneumatico dxpost;
	
	String caratteristiche() {
		String caract = "Modello: " + model + "\n";
		caract += motore.caratteristiche();
		for(Pneumatico p : pneumatici) {
			caract += p.caratteristiche() + "\n";
		}
		return caract;
	}
	
}
