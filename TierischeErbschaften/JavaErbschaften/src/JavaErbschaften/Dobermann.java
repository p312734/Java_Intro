package JavaErbschaften;

public class Dobermann extends Hund {

	public Dobermann(String name, int gewicht, char geschlecht) {
		super(name, gewicht, geschlecht);
	}
	
	public Dobermann(int gewicht) {
		super("Fester_Dobermann", gewicht, WEIBLICH);
	}
}
