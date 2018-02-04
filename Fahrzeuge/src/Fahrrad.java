
/**
 * Spezialisierung von {@link Fahrzeug} f�r Fahrr�der
 *
 * @author Oliver
 */
public class Fahrrad extends Fahrzeug {

	public Fahrrad(String modell, double vmax, int Sitzplaetze) {
		super(modell, vmax, Sitzplaetze);
	}

	
	/**
     * Setter f�r das Attribut H�chstgeschwindigkeit
     *
     * @param hoechstgeschwindigkeit die neue H�chstgeschwindigkeit in km/h
     * @throws IllegalArgumentException wenn H�chstgeschwindigkeit nicht
     * zwischen 0 und 135 km/h
     */
	
	@Override
	public void setVmax(double vmax) {
		if (vmax>135) {
			throw new IllegalArgumentException("Vmax muss unter 135 km/h liegen.");
		}
		super.setVmax(vmax);
	}

}
