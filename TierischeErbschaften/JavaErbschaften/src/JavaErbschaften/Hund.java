package JavaErbschaften;

public class Hund extends Tier {
    
	public Hund(String name, int gewicht, char geschlecht) {
		super(name, gewicht, geschlecht);
	}

	public Hund(int gewicht) {
		super("Fester_Hund", gewicht, WEIBLICH);
	}
}
