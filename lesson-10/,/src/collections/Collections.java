package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;



class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object o) {	
		if (!(o instanceof Person))
			return false;
		
		Person p = (Person)o;
		
		if (this.name == null)
			return p.name == null;
					
		return this.name.equals(p.name);
	}
	
	
}

class PersonHash {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// necessario per hash set
	@Override
	public boolean equals(Object o) {	
		if (!(o instanceof PersonHash))
			return false;
		
		PersonHash p = (PersonHash)o;
		
		if (this.name == null)
			return p.name == null;
					
		return this.name.equals(p.name);
	}
	
	// necessario per hash set
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	
}

class PersonTree implements Comparable<PersonTree>{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// necessario per tree
	@Override
	public boolean equals(Object o) {	
		if (!(o instanceof PersonTree))
			return false;
		
		PersonTree p = (PersonTree)o;
		
		if (this.name == null)
			return p.name == null;
					
		return this.name.equals(p.name);
	}
	
	// interface comparable, necessario per treeset.
	@Override
	public int compareTo(PersonTree p) {
		// restituire valore negativo se this < p
		// = 0 se this equals p
		// valore positivo se this > p
		
		return this.name.compareTo(p.getName());
	}
	
}



public class Collections {
	
	
	public static void main(String[] args) {
		
		{
			
			ArrayList al = new ArrayList();
			al.add("Ciao"); // String è un Object (inteso come tipo dato)
			
			Person p = new Person();
			p.setName("Pers");
			al.add(p);
			al.add("tutti");
			
			// String x = al.get(1); errore, get restituisce un Object
			try {		
				String x = (String)al.get(1);
				System.out.println(x);
			} catch(ClassCastException e) {
				System.out.println("Sono un cattivone...");
			}
		}
		{
			ArrayList<String> als = new ArrayList<String>();
			als.add("Ciao");
			Person p = new Person();
			p.setName("Pers");
			//als.add(p); // una Persona non è una String(a)
			als.add("tutti");
			
			String x = als.get(1);
			System.out.println(x);
			
			
			ArrayList<Person> alp = new ArrayList<>();
			alp.add(p);
			
			// Covariance
			List<Person> lp = new LinkedList<>();
			//
			lp.add(p);
			
		}
		
		{
			// boxing
			int x = 5;
			Integer bx = x; // boxing: sempre "safe"
			
			bx = null;
			
			try {
				int xunboxing = bx; // unboxing: può lanciare exception
				System.out.println(xunboxing);
			} catch(NullPointerException e){
				System.out.println(":(");
			}
			
			//			
			Integer iy = 140;
			Integer iz = 140;
			
			if (iy == iz) {
				System.out.println(iy + " è uguale a " + iz);
			} else {
				System.out.println(iy + " è diverso a " + iz);
			}
			
			// con riferimenti, per verificare se due elementi
			// contengono lo stesso valore, si usa il metodo equals!
			
			if (iy.equals(iz)) {
				System.out.println(iy + " è uguale a " + iz);
			} else {
				System.out.println(iy + " è diverso a " + iz);
			}
			
		}
		
		{

			String s1 = "ciao";
			String s2 = "ci";
			s2 += "ao";

			// usare sempre equals
			if (s1 == s2) {
				System.out.println(s1 + " è uguale a " + s2);
			} else {
				System.out.println(s1 + " è diverso da " + s2);
			}
			if (s1.equals(s2)) {
				System.out.println(s1 + " è uguale a " + s2);
			} else {
				System.out.println(s1 + " è diverso da " + s2);
			}
			
		}
		{
			Person p1 = new Person();
			p1.setName("Pers");
			
			Person p2 = new Person();
			p2.setName("Pers");

			if (p1.equals(p2)) {
				System.out.println("uguali");
			} else {
				System.out.println("non uguali");
			}
			
			
			List<Person> lp = new ArrayList<>();
			lp.add(p1);
			lp.add(p2);
			
			Person p3 = new Person();
			p3.setName("Pers");
			
			if (lp.contains(p3)) {
				System.out.println("contiene");
			} else {
				System.out.println("non contiene");
			}
			
			for(Person p: lp) {
				System.out.println(p.getName());
			}
			
		}
		{
			List<Integer> ls = Arrays.asList(2, 3, 4, 5, 9, 12);
			
			
			Optional<Integer> oi = ls.stream().map(x -> x + 2)
					   .filter(x -> x % 2 == 0)
					   .reduce((a, x) -> a + x);
			int x = oi.orElse(0);
			System.out.println(x);
			
		}
		
		{
			{
				// Set
				Set<PersonHash> sp = new HashSet<>();
				
				PersonHash p1 = new PersonHash();
				p1.setName("Pers");
				sp.add(p1);
				
				PersonHash p2 = new PersonHash();
				p2.setName("Pers");
				sp.add(p2);
				
				PersonHash p3 = new PersonHash();
				p3.setName("Pers");
				
				if (sp.contains(p3)) {
					System.out.println("contiene");
				} else {
					System.out.println("non contiene");
				}
				
				for(PersonHash p: sp) {
					System.out.println(p.getName());
				}
			}
			
			{
				// Tree set
				Set<PersonTree> sp = new TreeSet<>();
				PersonTree p1 = new PersonTree();
				p1.setName("Pers");
				sp.add(p1);
				
				PersonTree p2 = new PersonTree();
				p2.setName("Pers");
				sp.add(p2);
				
				PersonTree p3 = new PersonTree();
				p3.setName("Pers");
				
				if (sp.contains(p3)) {
					System.out.println("contiene");
				} else {
					System.out.println("non contiene");
				}
				
				for(PersonTree p: sp) {
					System.out.println(p.getName());
				}
				
				// su tutte le collection è implementanta
				// la struttura dati: iterator
				
				Iterator<PersonTree> iter = sp.iterator();
				while(iter.hasNext()) {
					PersonTree pt = iter.next();
					//uso pt
				}
				
			}
			
			
		}
		
		
	}

}
