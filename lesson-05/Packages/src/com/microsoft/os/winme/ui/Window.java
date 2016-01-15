package com.microsoft.os.winme.ui;

import com.microsoft.os.win3000.ui.Button3D;
//import com.microsoft.os.winxp.ui.Window;

public class Window {

	public static void main(String[] args) {
		System.out.println("Solo una window di winme");
		
		Button b = new Button(); //same package (winme button) 
		b.setLabel("Click me!");
		
		com.microsoft.os.winxp.ui.Button bxp = new com.microsoft.os.winxp.ui.Button();
		
		
		Button3D b3D = new Button3D();
		
	}
	
}
