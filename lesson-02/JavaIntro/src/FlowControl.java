
public class FlowControl {

	
	public static void main(String[] args) {
		
		// if
		int i1 = 10;
		int i2 = 20;
		if (i1 == i2) {
			System.out.println("i1 == i2");
		} else {
			System.out.println("i1 != i2");
		}
		
		switch(i1) {
		case 5:
			System.out.println("i1 è 5");
			break;
		case 10:
			System.out.println("i1 è 10");
			break;
		}
		
		// while
		System.out.println("while: from 0 to 10");
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		// do while
		System.out.println("do while: from 0 to 10");
		i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
		
		// while
		System.out.println("while: 20");
		i = 20;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		// do while
		System.out.println("do while: 20");
		i = 20;
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
		
		// for
		System.out.println("for");
		for(int index = 0; index < 10; index++) {
			System.out.println(index);
		}
		
	}
}
