package uebung_4_0;

public class Uebung_4_0 {

	public static void main(String[] args) {

		int maximum = 1000;
		int summe = 0;
		int zahl = 1;

		do {
			summe = summe + zahl;
			System.out.println("Summe:" + summe);
			zahl = zahl + 1;

		}

		while (summe + zahl <= maximum);

		// while (summe <= maximum) {
		// summe = summe + zahl;
		// System.out.println("Summe:" + summe);
		// zahl = zahl + 1;
	}
}
