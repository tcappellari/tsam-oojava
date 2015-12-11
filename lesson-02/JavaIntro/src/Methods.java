
// non esistono funzioni in Java
//public static void main(String[] args) {
//}

public class Methods {

	// TIPO_VALORE_RITORNO nomeMetodo(argomenti)
	// argomenti == TipoArg1 nomeArg1, TipoArg2 nomeArg2, ...
	
	static int sumAll(int[] myarray) {
		int sum = 0;
		for(int x: myarray) {
			sum += x;
		}
		return sum;
	}
	
	// method == functions all'interno di una classe
	public static void main(String[] args) {
		
		int[] a = new int[] {2,5,7,1};
		
		int result = sumAll(a);
		System.out.println(result);
	}
	
}
