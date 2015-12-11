
public class Arrays {

	public static void main(String[] args) {
		
		// 1. la dimensione dell'array deve essere 
		//    indicata all'atto della creazione e non può più essere modificata
		// 2. L'array è immutabile
		// 3. i valori di un array devono essere tutti dello stesso tipo
		
		int[] iarray = new int[5]; // array di 5 elementi, inizializzati a 0
		
		boolean[] barray = new boolean[5]; // array di 5 elementi, inizializzati a false
		
		// accedo tramite operatore []
		int x = iarray[3];
		System.out.println(x);
		iarray[3] = 50;
		System.out.println(iarray[3]);
		
		//iarray[5] = 20; // no compile time error, but run time error
		
		// NOTE!!!! Runtime vs compile time error
		
		boolean xx = false; // ex. read from user input
		int a = 5; // ex. read from file
		
		//if (xx) {
		//	iarray[3] = "hello"; // errore a compile time
		//}
		
		if (xx) {
			iarray[a] = 2;  // errore a run time (solo se xx sarà true)
		}
		
		// init array
		String[] strings = new String[] {"bar", "foo"};
		System.out.println(strings[1]);
		
		// for each
		System.out.println("for each");
		for(String s: strings) { // for (TIPO_DATO_ELEMENTO_DA_ESTRARRE : array)
			System.out.println(s);
		}
		
		System.out.println("for");
		for(int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
	}
	
}
