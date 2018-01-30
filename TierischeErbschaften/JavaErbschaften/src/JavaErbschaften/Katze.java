package JavaErbschaften;

public class Katze extends Tier {

	public Katze(String name, int gewicht, char geschlecht) {
		super(name, gewicht, geschlecht);
	}

	public Katze(int gewicht) {
		super("Feste_Katze", gewicht, MAENNLICH);
	}
	
}
