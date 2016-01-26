package tcappellari.interfacce.main;

public class A {

	private Protocollo p;
	
	public void peer(Protocollo p) {
		this.p = p;
	}
	
	public void run() {
		p.faiquesto();
		p.faiquello();
	}
	
}
