package musicplayer;

import java.io.*;
import java.time.Duration;

public class Song {
 
	/* Just a class */
	
	private static long gesamtLaenge; 
	 
	private String titel;
	private String interpret;
	private Duration laenge;
	

	public static long getGesamtLaenge() {
		return Song.gesamtLaenge;
	}
	
	
	public void setLaengeInSekunden(int laengeInSekunden) {
		Song.gesamtLaenge -= this.getLaengeInSekunden();
		Song.gesamtLaenge += laengeInSekunden;
		this.setLaengeInSekunden(laengeInSekunden);
	}

	public Song (String interpret, String titel, long laengeInSekunden) {
		/**
		 * @param interpret String
		 * @param titel String
		 * @param lanegeInSekunden long
		 */

		this.setInterpret(interpret);
		this.setTitel(titel);
		this.setLaengeInSekunden(laengeInSekunden);
	}

	public Song (String titel, long laengeInSekunden) {
		/**
		 * @param titel String
		 * @param lanegeInSekunden long
		 */

		this("Unbekannter K�nstler", titel, laengeInSekunden);
	}	
	

	public Song (String titel, int stunden, int minuten, int sekunden) {
		/**
		 * @param titel String
		 * @param lanegeInSekunden long
		 */

		this("Unbekannter K�nstler", titel, stunden * 3600 + minuten * 60 + sekunden);
	}
	
	
	public void setInterpret(String interpret) {
		if (interpret == null) {
			throw new IllegalArgumentException ("Interpret ist null");
		}		
		this.interpret = interpret;
	}
	
	public void setTitel(String titel) {
		if (titel == null) {
			throw new IllegalArgumentException ("Titel ist null");
		}		
		this.titel = titel;
	}

	public void setLaengeInSekunden(long laengeInSekunden) {
		if (laengeInSekunden <= 0) {
			throw new IllegalArgumentException ("L�nge ist kleiner oder gleich 0 Sekunden");
		}			
		this.laenge = Duration.ofSeconds(laengeInSekunden);
	}
	
	public String getInterpret() {
		return this.interpret;
	}
	
	public String getTitel() {
		return this.titel;
	}
	
	public long getLaengeInSekunden() {
		return this.laenge.getSeconds();
	}
	
	private String formatiereDauer() {
		String zeitformatiert = ((this.getLaengeInSekunden() / 60)<10? "0":"") + String.valueOf(this.getLaengeInSekunden() / 60) + ":" 
								+ ((this.getLaengeInSekunden() % 60)<10? "0":"") + String.valueOf(this.getLaengeInSekunden() % 60);
	  return zeitformatiert;
	}
	
	
	public String liefereSongDaten () {
		return ("Interpret: " + this.interpret + " / Titel: " + this.titel + " / Dauer: " + this.formatiereDauer());
	}
	
	public void druckeSong() {
		System.out.println(liefereSongDaten());
	}
}


