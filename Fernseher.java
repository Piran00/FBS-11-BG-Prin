public class Fernseher {
	private boolean aus; // Datenfelder
	private boolean stumm;
	private int lautstärke;
	private int sender;

	public Fernseher() { // Konstruktor
		aus = true;
		stumm = false;
		lautstärke = 5;
		sender = 1;
	}

	public void anschalten() {
		aus = !aus; // Mit "!" kann man den Wert eines Booleans umkehren
	}

	public void stumm() {
		stumm = !stumm; // Selbes wie darüber; "stumm" wird mit jedem Methoden-Aufruf umgekehrt
	}

	public void lautstärke_erhöhen() {
		if (lautstärke + 1 <= 10) { // Hier passiert: Falls "lautstärke" + 1 kleiner gleich 10, dann...
			lautstärke++; // Mit "++" kann man den Wert einer Zahl (hier "lautstärke") um 1 erhöhen
		}

		stumm = false;
	}

	public void lautstärke_verringern() {
		if (lautstärke - 1 >= 0) { // Hier passiert: Falls "lautstärke" - 1 größer gleich 10, dann...
			lautstärke --; // Wie oben wird der Wert von "lautstärke" um 1 verändert; nur diesmal wird dieser subtrahiert
		}

		stumm = false;
	}

	public void sender_auswählen(int usr_selection) {
		if (usr_selection <= 30) {
			sender = usr_selection;
		}
	}

	public void return_state() {
		if (aus) { // Wenn "aus" den Wert "true" hat (also der Fernseher aus ist), dann...
			System.out.println("An/Aus: false");
		} else { // ansonsten...
			System.out.println("An/Aus: true");
			System.out.println("Stumm: " + stumm);
			System.out.println("Lautstärke: " + lautstärke);
			System.out.println("Sender: " + sender);
		}
	}































}
