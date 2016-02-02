package tcappellari.interfacce.ui;

public class ActivityInner {
		
	
	private class ButtonInterfaceOK  implements ButtonInterface {
		

		@Override
		public void onClick(boolean b) {
			System.out.println("Grazie per aver premuto il pulsante, longpress? " 
								+ b
								+ " da parte di " + message);
		}
	}

	private class ButtonInterfaceKO  implements ButtonInterface {
		
		@Override
		public void onClick(boolean b) {
			System.out.println("Sciocchino, longpress? "
					+ b
					+ " da parte di " + message);
		}
	}
	
	private String message;

	public ActivityInner(String msg) {
		message = msg;
	}
	
	public String getMessage() { return message; }
	
	public void run() {
		Button bok = new Button();
		bok.setListener(new ButtonInterfaceOK());
		
		Button bko = new Button();
		bko.setListener(new ButtonInterfaceKO());

		
		// UI gestita dal sistema
		bko.userClick(true);
	}
	
	

	
	public static void main(String[] args) {		
		ActivityInner activity = new ActivityInner("ActivityInner");
		activity.run();
		
	}


}
