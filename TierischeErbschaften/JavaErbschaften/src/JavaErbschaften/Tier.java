package JavaErbschaften;

public class Tier {

	private String name;
	private int gewicht;
	private char geschlecht; 

	public static final char MAENNLICH = 'm';
	public static final char WEIBLICH = 'w';

	
	public Tier(String name, int gewicht, char geschlecht) {
	
		this.setName(name);
		this.setGewicht(gewicht);
		
		if ((geschlecht == MAENNLICH) || (geschlecht == WEIBLICH)) {
			this.setGeschlecht(geschlecht);
		} else {
			throw new IllegalArgumentException ("Geschlecht enthält nicht definierten Wert!");
		}
	}


	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	
	public int getGewicht() {
		return this.gewicht;
	}

	public void setGeschlecht(char geschlecht) {
		this.geschlecht = geschlecht;
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
		Tier myTier = new Tier("Tier-Amöbe", 100, MAENNLICH);
		myTier.druckeTier();

		Hund myHund = new Hund("Tier-Bello", 110, MAENNLICH);
		myHund.druckeTier();

		Katze myKatze = new Katze("Cat-Miau", 120, WEIBLICH);
		myKatze.druckeTier();

		Dackel myDackel = new Dackel("Wauwauchen", 111, WEIBLICH);
		myDackel.druckeTier();

		Dobermann myDobermann = new Dobermann("Töhle", 112, WEIBLICH);
		myDobermann.druckeTier();

		Dackel myDackel2 = new Dackel(211);
		myDackel2.druckeTier();
		
		Dobermann myDobermann2 = new Dobermann(212);
		myDobermann2.druckeTier();
	}

}

