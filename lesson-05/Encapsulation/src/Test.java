
public class Test {
	
	public static void main(String[] args) {
		Persona luca = new Persona();
		luca.setSurname("Bianchi");
		luca.setName("Luca");
		luca.setPassword("123456");
		//luca.eta = 54; eta è privato all'interno della classe Persona
		
		luca.setEta(20);
		luca.setEta(200);
		
		//luca.eta = 250;
		stampaDatiPersona(luca);
		
	}
	
	static void stampaDatiPersona(Persona p) {
		System.out.println(p.getName());
		String pass = "123";
		pass += "456";
		System.out.println("Password: " + p.verificaPassword(pass));
	}

}
