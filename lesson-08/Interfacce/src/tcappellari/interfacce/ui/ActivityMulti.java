package tcappellari.interfacce.ui;


class ButtonInterfaceOK  implements ButtonInterface {
	@Override
	public void onClick(boolean b) {
		System.out.println("Grazie per aver premuto il pulsante, longpress? " 
							+ b
							+ " da parte di " + getMessage());
	}
}

class ButtonInterfaceKO  implements ButtonInterface {
	@Override
	public void onClick(boolean b) {
		System.out.println("Sciocchino, longpress? "
				+ b
				+ " da parte di " + getMessage());
	}
}

public class ActivityMulti {
		
	private String message;
	//
	//
	//
	public ActivityMulti(String msg) {
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
		ActivityMulti activity = new ActivityMulti("ActivityMulti");
		activity.run();
		
	}


}
