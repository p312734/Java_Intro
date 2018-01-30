package JavaErbschaften;

public class Dackel extends Hund {

	public Dackel(String name, int gewicht, char geschlecht) {
		super(name, gewicht, geschlecht);
	}

	public Dackel(int gewicht) {
		super("Fester_Dackel", gewicht, WEIBLICH);
	}
}
