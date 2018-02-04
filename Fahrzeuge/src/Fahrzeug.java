import java.io.*;
import java.math.*;


/**
 * Abstrakte Oberklasse f�r alle Arten von Fahrzeugen. Definiert
 * allgemeing�ltige Attribute wie Modell, H�chstgeschwindigkeit und Anzahl der
 * Sitze.
 *
 * @author Kai G�nster
 */
public abstract class Fahrzeug {

	private String modell;
	private double vmax;
	private int sitzplaetze;


    /**
     * Konstruktor mit allen Attributen
     *
     * @param modell Fahrzeugmodell
     * @param hoechstgeschwindigkeit H�chstgeschwindigkeit
     * @param sitze Anzahl Sitze
     */
	public Fahrzeug(String modell, double vmax, int sitzplaetze) {
		this.setModell(modell);
		this.setVmax(vmax);
		this.setSitzplaetze(sitzplaetze);
	};

    /**
     * Setter f�r das Attribut Modell
     *
     * @param modell das neue Modell
     */
	public void setModell(String modell) {
		this.modell = modell;
	}
	
    /**
     * Getter f�r das Attribut Modell
     *
     * @return das Modell
     */
	public String getModell() {
		return this.modell;
	}

    /**
     * Setter f�r das Attribut H�chstgeschwindigkeit
     *
     * @param hoechstgeschwindigkeit die neue H�chstgeschwindigkeit in km/h
     * @throws IllegalArgumentException wenn H�chstgeschwindigkeit nicht
     * zwischen 0 und 320 km/h
     */	
	public void setVmax(double vmax) {
		if ((vmax<0) || (vmax>320)) {
			throw new IllegalArgumentException("Vmax muss zwischen 0 und 320 km/h liegen.");
		}
		this.vmax = vmax;
	}

    /**
     * Getter f�r das Attribut H�chstgeschwindigkeit
     *
     * @return die H�chstgewschindigkeit in km/h
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
        Aus Entfernung in km und Geschwindigkeit in km/h l�sst sich die 
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
