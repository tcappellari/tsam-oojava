package tcappellari.interfacce.ui;


class ButtonInterfaceOK  implements ButtonInterface {
	
	private ActivityMulti parent;
	
	public ButtonInterfaceOK(ActivityMulti parent) {
		this.parent = parent;
	}
	
	@Override
	public void onClick(boolean b) {
		System.out.println("Grazie per aver premuto il pulsante, longpress? " 
							+ b
							+ " da parte di " + parent.getMessage());
	}
}

class ButtonInterfaceKO  implements ButtonInterface {
	
	private ActivityMulti parent;
	
	public ButtonInterfaceKO(ActivityMulti parent) {
		this.parent = parent;
	}
	
	@Override
	public void onClick(boolean b) {
		System.out.println("Sciocchino, longpress? "
				+ b
				+ " da parte di " + parent.getMessage());
	}
}

public class ActivityMulti {
		
	private String message;

	public ActivityMulti(String msg) {
		message = msg;
	}
	
	public String getMessage() { return message; }
	
	public void run() {
		Button bok = new Button();
		bok.setListener(new ButtonInterfaceOK(this));
		
		Button bko = new Button();
		bko.setListener(new ButtonInterfaceKO(this));

		
		// UI gestita dal sistema
		bko.userClick(true);
	}
	
	

	
	public static void main(String[] args) {		
		ActivityMulti activity = new ActivityMulti("ActivityMulti");
		activity.run();
		
	}


}
