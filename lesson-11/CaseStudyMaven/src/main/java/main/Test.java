package main;

import java.io.BufferedReader;
import java.io.FileReader;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;

public class Test {
	
	public static void main(String[] args) {
		FileReader fr = new FileReader("nomefile.csv");
		BufferedReader br = new BufferReader(fr);
		
		// ciclo while finche str == null
		String str = br.readLine();
		
		// split
		String[] items = str.split(";");
		
		
		// seleziono i campi dell'indirizzo + l'id (ovvero n. riga)
		// indirizzo sono i campi ALZ 	NAVIGLIO GRANDE	98
		// creo oggetto con questi campi address, l'id su list di integer
		
		// salvo su Map<Address, List<Integer>> indirizzoAttivita
		// {address1: [id1, id2], address2: [id3, id4]}
		
		// chiamo google maps per ogni address
		
		// pre prova usare sync
		GeoApiContext context = new GeoApiContext().setApiKey("AIza...");
		GeocodingResult[] results =  GeocodingApi.geocode(context,
		    "1600 Amphitheatre Parkway Mountain View, CA 94043").await();
		
		// progetto finale: usare async
		
		
		
		
		System.out.println(results[0].formattedAddress);
		System.out.println(results[0].geometry.location.lat);
		System.out.println(results[0].geometry.location.lng);
		
		
		// salvo lat/lng + addressname
		
		FileWriter fw = new FileWriter("nomefileout.csv");
		PrintWriter pw = new PrintWriter(fw);
		
		per ogni key e ogni id della map
		pw.println("id1;lat;lng;address_di_google");
		

		
		
	}

}
