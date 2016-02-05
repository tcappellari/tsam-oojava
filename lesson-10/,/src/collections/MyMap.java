package collections;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	
	public static void main(String[] args) {
		
		// chiave, valore.
		
		Map<String, Integer> maps = new HashMap<>();
		maps.put("a", 5);
		maps.put("b", 3);
		maps.put("c", 2);
		
		int x = maps.get("b"); // ricerco x chiave, ottengo il valore
		
		System.out.println(x);
		
		// importante.
		for(String s: maps.keySet()) {
			int y = maps.get(s);
			System.out.println("->" + y);
		}
		
		
		// dato un array di person
		// creare un hashmap e un treemap 
		// che permetta di contare quante persone "equals" ci sono
		// nell'array.
		
		// Esempio:
		// ["pippo", "pluto", "pippo", "gigi"]
		// {"pippo":2, "pluto":1, "gigi": 1}
		
		
		
		
		
		
	}

}
