
public class Operators {

	
	public static void main(String[] args) {
		
		int i1 = 7;
		int i2 = 6;
		
		// sum +, sub -, molt * , div /, mod %
		int i3 = i1 + i2;
		System.out.println("i1 + i2");
		System.out.println(i3);
		
		System.out.println("i1 + i2");
		System.out.println(i1 + i2);
		
		// div
		int idiv = i1 / i2; // divisione intera (perchè gli operandi sono interi)
		System.out.println("i1 / i2");	
		System.out.println(i1);
		System.out.println("/");
		System.out.println(i2);
		System.out.println("=");
		System.out.println(idiv);
		
		double ddiv = i1 / i2; // divisione intera (perchè gli operandi sono interi)
		System.out.println(ddiv);
		
		double d1 = i1;
		ddiv = d1 / i2;
		System.out.println(ddiv);

		// uso valore double per modificare 
		// l'operatore divisione intera in oparazione divisione tra double
		double ddivt = 1.0 * i1 / i2;

		System.out.println(ddivt);
		
		// Assignments
		
		i1 += 5; // +=, -=, *=, /=
		i2++; // 'same as' i2 +=1 same as i2 = i2 + 1
		
		System.out.println(i1);
		System.out.println(i2);
		
		// boolean operators
		
		boolean b1 = false;
		boolean b2 = true;
		
		// and &&, or ||, not !
		boolean b3 = b1 && b2;
		System.out.println("b1 && b2");
		System.out.println(b3);
		
		// String
		String str1 = " Hello ";
		String str2 = " world! ";
		
		String str3 = str1 + str2;
		System.out.println(str3);
		
		String str4 = str1 + i1;
		System.out.println(str4);
		
		String str5 = i1 + str1;
		System.out.println(str5);
		
		System.out.println("Il valore di i1 è: " + i1 + " e quello di i2 è: " + i2);
		
		
	}
}
