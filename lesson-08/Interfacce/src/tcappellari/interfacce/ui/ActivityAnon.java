package tcappellari.interfacce.ui;

class X implements ButtonInterface {
	public void onClick(boolean b) {
		System.out.println("qualcuno ha premuto il pulsante!");
		
	}
}

public class ActivityAnon {

	
	public static void main(String[] args) {
		
		// il mio codice
		Button b = new Button();
		
		// voglio dire al pulsante che quando qualcuno
		// ci fa click sopra, mi informi dell'evento.
		
		// mi registro come listener dell'oggetto button.
		b.setListener(new ButtonInterface() {
			
			public void onClick(boolean b) {
				System.out.println("qualcuno ha premuto il pulsante!");
				
			}
		});
		


		
		// UI gestita dal sistema
		
		// qualche tempo dopo qualcuno fa click.
		// simulo mediante chiamata al metodo userClick

		b.userClick(true);
		
		
	}
	
}
