package exceptions;


class MyException extends Exception {
	
	private int status;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}

class MyBadException extends Exception {
}

public class Main {
	
	int x = 5;
	
	static int g(int a) throws MyException, MyBadException {
		
		//Main m = null;
		//a = m.x;
		
		if (a < 0) {
			MyException me = new MyException();
			me.setStatus(a);
			throw me;
		} else if (a == 0){
			throw new MyBadException();
		}
		
		return a * 2;
		
	}
	
	static int f(int a) throws MyException {
		int x = 0;
		try {
			x = g(a);
		} catch(MyBadException e) {
			
		} finally {
			System.out.println("finally f");
		}
		
		// codice NON eseguito in caso di exception
		x++;
		return x;
	}
	
	public static void main(String[] arg) {
		
		int x = -5;
		
		try {
			
			System.out.println("start try");
			
			int y = f(x);
			
			// codice NON eseguito in caso di exception
			System.out.println("y = " + y);
			System.out.println("end try");
			
		} catch(MyException e) {
			// blocco eseguito solo se c'è un exception di tipo MyException
			System.out.println("blocco catch " + e.getStatus());
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}
		
		finally {
			// codice che viene eseguito sia
			// in caso di exception che non
			System.out.println("QUI SEMPRE, dopo il try o catch");
		}
		
		System.out.println("fuori dal try");
		
	}
	
	

}
