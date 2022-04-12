package de.demmer.dennis;

import java.util.ArrayList;

public class Application {
	
	public static void main(String[] args) {

		//STRG + SHIFT + O -> Auto Import
		
		Hund hund1 = new Hund(10, "Bello");
		Hund hund2 = new Hund(10, "Carlo");
		Hund hund3 = new Hund(10, "Klausi");
		Hund hund4 = new Hund(10, "Wuffi");

		ArrayList<Hund> hundListe = new ArrayList<Hund>();
		hundListe.add(hund1);
		hundListe.add(hund2);
		hundListe.add(hund3);
		hundListe.add(hund4);

		
		
		for(Hund h : hundListe) {
			System.out.println(h.getName());
			System.out.println(h.getAge());
			System.out.println("***********");
		}
				
		System.out.println(hundListe.size());

		hundListe.clear();
		
		
		
	}
	
}
