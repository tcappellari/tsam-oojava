
public class Persona {

	private String name;
	private String surname;
	private int eta;
	private String password;
	
	void setEta(int e) { // package access
		if ( e <= 150) {
			eta = e;
		}
	}
	
	// accessibile a tutte le classi, 
	// indipendentemente dal package in cui si trovano
	public int getEta() { 
		return eta;
	}
	
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	void setSurname(String surname) {
		this.surname = surname;
	}
	String getSurname() {
		return surname;
	}
	
	void setPassword(String password) {
		this.password = password;
	}
	private String getPassword() {
		return password;
	}
	boolean verificaPassword(String pass) {
		return pass.equals(this.password);
	}
}
