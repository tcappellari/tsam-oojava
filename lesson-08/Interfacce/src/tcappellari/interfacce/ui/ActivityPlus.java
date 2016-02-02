package tcappellari.interfacce.ui;

public class ActivityPlus {

	private String message;

	public ActivityPlus(String msg) {
		message = msg;
	}
	
	public String getMessage() { return message; }
	
	public void run() {
		Button bok = new Button();
		bok.setListener(b -> {
				System.out.println("Grazie per aver premuto il pulsante, longpress? " 
									+ b
									+ " da parte di " + message);
			});
		
		Button bko = new Button();
		bko.setListener(b -> {
				System.out.println("Sciocchino, longpress? "
						+ b
						+ " da parte di " + message);
			});

		
		// UI gestita dal sistema
		bko.userClick(true);
	}
	
	

	
	public static void main(String[] args) {		
		ActivityPlus activity = new ActivityPlus("ActivityPlus");
		activity.run();
		
	}
}
