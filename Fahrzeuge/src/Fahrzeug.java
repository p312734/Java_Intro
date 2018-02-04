import java.io.*;
import java.math.*;


/**
 * Abstrakte Oberklasse für alle Arten von Fahrzeugen. Definiert
 * allgemeingültige Attribute wie Modell, Höchstgeschwindigkeit und Anzahl der
 * Sitze.
 *
 * @author Kai Günster
 */
public abstract class Fahrzeug {

	private String modell;
	private double vmax;
	private int sitzplaetze;


    /**
     * Konstruktor mit allen Attributen
     *
     * @param modell Fahrzeugmodell
     * @param hoechstgeschwindigkeit Höchstgeschwindigkeit
     * @param sitze Anzahl Sitze
     */
	public Fahrzeug(String modell, double vmax, int sitzplaetze) {
		this.setModell(modell);
		this.setVmax(vmax);
		this.setSitzplaetze(sitzplaetze);
	};

    /**
     * Setter für das Attribut Modell
     *
     * @param modell das neue Modell
     */
	public void setModell(String modell) {
		this.modell = modell;
	}
	
    /**
     * Getter für das Attribut Modell
     *
     * @return das Modell
     */
	public String getModell() {
		return this.modell;
	}

    /**
     * Setter für das Attribut Höchstgeschwindigkeit
     *
     * @param hoechstgeschwindigkeit die neue Höchstgeschwindigkeit in km/h
     * @throws IllegalArgumentException wenn Höchstgeschwindigkeit nicht
     * zwischen 0 und 320 km/h
     */	
	public void setVmax(double vmax) {
		if ((vmax<0) || (vmax>320)) {
			throw new IllegalArgumentException("Vmax muss zwischen 0 und 320 km/h liegen.");
		}
		this.vmax = vmax;
	}

    /**
     * Getter für das Attribut Höchstgeschwindigkeit
     *
     * @return die Höchstgewschindigkeit in km/h
     */
	public double getVmax() {
		return this.vmax;
	}

	
	public void setSitzplaetze(int sitzplaetze) {
		this.sitzplaetze = sitzplaetze;
	}
	

	public int getSitzplaetze() {
		return this.sitzplaetze;
	}

	
	public void fahreNach(String Ziel, double dist) {
		System.out.println("Ziel: " + Ziel + " / Entfernung: " + dist + " km / Fahrzeit: " + berechneFahrzeitAlsString(dist));
	}
	
	protected String berechneFahrzeitAlsString(double dist) {
	    /*
        Aus Entfernung in km und Geschwindigkeit in km/h lässt sich die 
        Fahrzeit in Stunden berechnen. Da beide double-Werte sind ist auch das 
        Ergebnis ein double, nicht die ganzzahlige Stundenzahl.
        */
		
		double fahrzeit;
		String strfahrzeit;
		
		double fahrzeitmin = 0;
		double fahrzeitstd = 0;
		double fahrzeittag = 0;

		fahrzeit = dist / this.getVmax(); 

		fahrzeitstd = Math.floor((fahrzeit));
		
		fahrzeitmin = ((fahrzeit - fahrzeitstd) * 60);
		
		if (fahrzeitstd > 24) {
			fahrzeittag = Math.floor(fahrzeitstd / 24);
			fahrzeitstd = fahrzeitstd - fahrzeittag * 24;
		}
		
		strfahrzeit = (int) fahrzeitmin + " min";
		
		if (fahrzeitstd > 0) {
			strfahrzeit = (int) fahrzeitstd + " h, " + strfahrzeit;
		}
		
		if (fahrzeittag > 0) {
		  strfahrzeit = (int) fahrzeittag + " Tag(e), " + strfahrzeit;	
		}
		return strfahrzeit;
		
	}
}
