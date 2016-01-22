package cappellari.tiziano.ereditarieta;

public class Main {
	
	public static void main(String[] args) {
		
		Dipendente s1 = null;
		if (args[0].equals("s")) {
			s1 = new Sviluppatore();
		} else {
			s1 = new Manager();
		}
		s1.setAnzianita(1); //metodo del Dipendente
		s1.setStipendio(800); //metodo del Dipendente
		
		s1.calcolaStipendio();
		
		
		
		
	}

}
