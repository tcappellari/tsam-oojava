
public class Test {

	public static void main(String[] args) {
		// creo fiat UNO
		Car fiatuno = new Car();
		fiatuno.model = "fiat uno disel";
		
		Carburatore c50 = new Carburatore();
		c50.size = 50;
		
		Engine v16 = new Engine();
		v16.cilindrata = "2000";
		v16.carburatore = c50; 
		
		fiatuno.motore = v16;
		
		Pneumatico[] pirelli = new Pneumatico[4];
		Pneumatico ansx = new Pneumatico();
		ansx.raggio = 20;
		Pneumatico andx = new Pneumatico();
		andx.raggio = 20;
		Pneumatico posx = new Pneumatico();
		posx.raggio = 20;
		Pneumatico podx = new Pneumatico();
		podx.raggio = 20;
		
		pirelli[0] = ansx;
		pirelli[1] = andx;
		pirelli[2] = posx;
		pirelli[3] = podx;
		
		fiatuno.pneumatici = pirelli;
		
		// creo fiat PUNTO
		
		Car fiatpunto = new Car();
		fiatpunto.model = "fiat PUNTO";
		Carburatore c35 = new Carburatore();
		c35.size = 35;
		
		Engine v8 = new Engine();
		v8.cilindrata = "1000";
		v8.carburatore = c35; 
		
		fiatpunto.motore = v8;
		
		// STAMPO fiatuno e poi fiat punto
		stampaAuto(fiatuno);
		stampaAuto(fiatpunto);
		
		stampaAutoSmart(fiatuno);
		
	}
	
	static void stampaAutoSmart(Car c) {
		String caract = c.caratteristiche();
		System.out.println(caract);
	}
	
	static void stampaAuto(Car x) {
		System.out.println("Modello: " + x.model);
		Engine e = x.motore;
		System.out.println(e.cilindrata + " cc");
		System.out.println("carburatore: " 
				+ x.motore.carburatore.size);
	}
}

