/**
 * Spezialisierung von {@link Fahrzeug} f�r PKWs
 *
 * @author Kai G�nster
 */
public class PKW extends Fahrzeug implements Motorisiert {

	public PKW(String modell, double vmax, int Sitzplaetze) {
		super(modell, vmax, Sitzplaetze);
	}
}
