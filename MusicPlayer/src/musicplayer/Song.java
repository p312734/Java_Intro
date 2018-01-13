package musicplayer;

import java.io.*;

public class Song {
 
	public String titel;
	public String interpret;
	public int laengeInSekunden;
	
	
	public Song () {

		this.interpret = "Blue Screen";
		this.titel = "Fatal Error - System Halted";
		this.laengeInSekunden = 7;
	}


	private String formatiereDauer() {
	  String zeitformatiert = String.valueOf(this.laengeInSekunden / 60) + ":" + String.valueOf(this.laengeInSekunden % 60);
	  return zeitformatiert;
	}
	
	
	public String liefereSongDaten () {
		return ("Interpret: " + this.interpret + " / Titel: " + this.titel + " / Dauer: " + this.formatiereDauer());
	}
	
	public void druckeSong() {
		System.out.println(liefereSongDaten());
	}
}


