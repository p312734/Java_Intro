/**
 * Spezialisierung von {@link Fahrzeug} für PKWs
 *
 * @author Kai Günster
 */
public class PKW extends Fahrzeug implements Motorisiert {

	public PKW(String modell, double vmax, int Sitzplaetze) {
		super(modell, vmax, Sitzplaetze);
	}
}
