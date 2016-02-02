package tcappellari.interfacce.ui;

// l'oggetto button vuole comunicare a chi lo utilizza
// l'evento relativo al click
public class Button {
	
	private ButtonInterface binterface;
	
	public void setListener(ButtonInterface callback) {
		binterface = callback; // upcasting
	}
	
	// questo metodo è chiamato dal sistema
	// quando qualcuno preme il pulsante nell'UI
	public void userClick(boolean b) {
		// voglio informare l'oggetto che mi sta utilizzando.
		
		// usando la ButtonInterface posso informare
		// gli oggetti che si sono "registrati" mediante
		// la set listener e che implementano l'interfaccia ButtonInterface
		
		if (binterface != null) { 
			binterface.onClick(b);
		}
	}

}
