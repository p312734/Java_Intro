
/**
 * Spezialisierung von {@link Fahrzeug} für Fahrräder
 *
 * @author Oliver
 */
public class Fahrrad extends Fahrzeug {

	public Fahrrad(String modell, double vmax, int Sitzplaetze) {
		super(modell, vmax, Sitzplaetze);
	}

	
	/**
     * Setter für das Attribut Höchstgeschwindigkeit
     *
     * @param hoechstgeschwindigkeit die neue Höchstgeschwindigkeit in km/h
     * @throws IllegalArgumentException wenn Höchstgeschwindigkeit nicht
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
