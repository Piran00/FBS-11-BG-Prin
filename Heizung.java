public class Heizung {
	double temperatur; // Datenfelder
	double min;
	double max;
	double schrittweite;

	public Heizung(double usr_min, double usr_max ) { // Konstruktor
		min = usr_min;
		max = usr_max;
		temperatur = 15;
		schrittweite = 5.0;
	}

	public void set_schrittweite(double usr_in) {
		if (usr_in > 0) { // Checken, ob "schrittweite" größer als 0 ist
			schrittweite = usr_in;
		}
	}

	public void wärmer() {
		if (temperatur + schrittweite > max) { // Überprüfen, ob die neue Temperatur größer als das "max" ist
			temperatur = max;
		} else {
			temperatur += schrittweite; // Mit "+="" kürzt man "temperatur = temperatur + schrittweite" ab
		}
	}


	public void kälter()
	{
		if (temperatur - schrittweite < min) {
			temperatur = min;
		} else {
			temperatur -= schrittweite; // Mit "-=" kürzt man "temperatur = temperatur - schrittweite" ab
		}
	}


	public double return_temp() {
		return temperatur;
	}

}
