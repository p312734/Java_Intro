package musicplayer;

import java.io.*;
import java.time.Duration;

public class Song {
 
	/* Just a class */
	 
	 
	private String titel;
	private String interpret;
	private Duration laenge;
	
	
	public Song (String interpret, String titel, long laengeInSekunden) {
		/**
		 * @param interpret String
		 * @param titel String
		 * @param lanegeInSekunden String
		 */

		this.setInterpret(interpret);
		this.setTitel(titel);
		this.setLaengeInSekunden(laengeInSekunden);
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
			throw new IllegalArgumentException ("Länge ist kleiner oder gleich 0 Sekunden");
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


