package tcappellari.interfacce.ui;


public class ActivityAnon {
		

	private String message;

	public ActivityAnon(String msg) {
		message = msg;
	}
	
	public String getMessage() { return message; }
	
	public void run() {
		Button bok = new Button();
		bok.setListener(new ButtonInterface(){
			@Override
			public void onClick(boolean b) {
				System.out.println("Grazie per aver premuto il pulsante, longpress? " 
									+ b
									+ " da parte di " + message);
			}
		});
		
		Button bko = new Button();
		bko.setListener(new ButtonInterface(){
			@Override
			public void onClick(boolean b) {
				System.out.println("Sciocchino, longpress? "
						+ b
						+ " da parte di " + message);
			}
		});

		
		// UI gestita dal sistema
		bko.userClick(true);
	}
	
	

	
	public static void main(String[] args) {		
		ActivityAnon activity = new ActivityAnon("ActivityAnon");
		activity.run();
		
	}

}