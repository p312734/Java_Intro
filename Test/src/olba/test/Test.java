package olba.test;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		double dist = 5450;
		double vmax = 100;
		double fahrzeit;
		String strfahrzeit;
		
		double fahrzeitmin = 0;
		double fahrzeitstd = 0;
		double fahrzeittag = 0;

		fahrzeit = dist / vmax; 

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
	
		System.out.println(strfahrzeit);
	}
}
