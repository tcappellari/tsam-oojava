package tcappellari.interfacce.main;

public class Main {
	
	public static void main(String[] args) {
		
		A a = new A();
		a.peer(new B());
		a.run();
		
		a.peer(new C());
		a.run();
		
		// protocollo è un interfaccia, non è
		// possibile creare oggetti instanza di un interfaccia
		// idea: un'interfaccia tutti i metodi non implementati... 
		//Protocollo proto = new Protocollo();
		

		a.peer(new Protocollo(){
			public void faiquesto() {
				System.out.println("faiquesto fatto da Anon");
			}
			
			public void faiquello() {
				System.out.println("faiquello fatto da Anon");
			}
		});
		a.run();
		
		
		Protocollo p2 = new Protocollo(){
			public void faiquesto() {
				System.out.println("faiquesto fatto da Anon2");
			}
			
			public void faiquello() {
				System.out.println("faiquello fatto da Anon2");
			}
		};
		a.peer(p2);
		a.run();
		
	}

}
