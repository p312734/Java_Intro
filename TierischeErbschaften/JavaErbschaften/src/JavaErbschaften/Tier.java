package JavaErbschaften;

import java.io.*;

public class Tier {

	private String name;
	private int gewicht;
	private char geschlecht; 

	public static final char MAENNLICH = 'm';
	public static final char WEIBLICH = 'w';

	
	public Tier(String name, int gewicht, char geschlecht) {
	
		this.name = name;
		this.gewicht = gewicht;
		
		if ((geschlecht == MAENNLICH) || (geschlecht == WEIBLICH)) {
			this.geschlecht = geschlecht;
		} else {
			throw new IllegalArgumentException ("Geschlecht enth�lt nicht definierten Wert!");
		}
	}

	public String getName() {
		return this.name;
	}
	
	public int getGewicht() {
		return this.gewicht;
	}

	public char getGeschlecht() {
		return this.geschlecht;
	}


	public void druckeTier() {
		System.out.println(toString());
	}
	

	public String toString() {
		  return this.getName() + " / " + this.getGewicht() + "kg / Geschlecht: " + this.getGeschlecht() + " /  Klasse: "+ this.getClass().getName(); 
		}
	
	public static void main(String[] args) {
		Tier myTier = new Tier("Tier-Am�be", 100, MAENNLICH);
		myTier.druckeTier();

		Hund myHund = new Hund("Tier-Bello", 110, MAENNLICH);
		myHund.druckeTier();

		Katze myKatze = new Katze("Cat-Miau", 120, WEIBLICH);
		myKatze.druckeTier();

		Dackel myDackel = new Dackel("Wauwauchen", 111, WEIBLICH);
		myDackel.druckeTier();

		Dobermann myDobermann = new Dobermann("T�hle", 112, WEIBLICH);
		myDobermann.druckeTier();

		
	}

}

