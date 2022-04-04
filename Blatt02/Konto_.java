package Blatt02;

import java.util.Scanner;

public class Konto_ {

	public static void main(String[]args) {
		double guthaben = 0.0;
		double zins = 2.0;
		double guthaben_erhoehung = 1000.0;
		int jahre = 30;
		int auswahl;

		System.out.println("Bitte entscheiden Sie welche der folgenden Berechnung Sie ausführen möchten:"); // Aufgabenteil                             
		System.out.println("1) Sparplan mit Zinseszins");                                                   // e)
		System.out.println("2) Sparplan ohne Zinseszins");
		System.out.println("3) Erforderliche Dauer eines Sparziels mit Zinseszins");
		Scanner sc = new Scanner(System.in);
		auswahl = sc.nextInt();

		if (auswahl == 1) {
			System.out.println("Bitte geben Sie ihr Startguthaben ein:"); // Aufgabenteil b
			guthaben = sc.nextDouble();

			System.out.println("Bitte geben Sie den Zinssatz (in %) ein:");
			zins = sc.nextDouble();

			System.out.println("Bitte geben Sie die Laufzeit (in Jahren) ein:");
			jahre = sc.nextInt();
			for (int i = 1; i <= jahre; i++) { // Aufgabenteil b)
				guthaben = guthaben + guthaben_erhoehung;
				System.out.println("Guthaben nach dem " + i + ". Jahr: " + guthaben);
				guthaben = guthaben * (1 + zins / 100);
			}


		} else if (auswahl == 2) {
			System.out.println("Bitte geben Sie ihr Startguthaben ein:");               // Aufgabenteil c)
			guthaben = sc.nextDouble();

			System.out.println("Bitte geben Sie den Zinssatz (in %) ein:");
			zins = sc.nextDouble();

			System.out.println("Bitte geben Sie die Laufzeit (in Jahren) ein:");
			jahre = sc.nextInt();
			for (int j = 1; j <= jahre; j++) {                                          //guthaben = guthaben + guthaben_erhoehung;
				System.out.println("Guthaben nach dem " + j + ". Jahr: " + guthaben);
				guthaben = guthaben + guthaben_erhoehung;
				guthaben = guthaben + guthaben_erhoehung * j * (zins / 100);
			}

		} else if (auswahl == 3) {
			int jahrzaehler = 1;                                                        // Aufgabenteil d)
			double sparziel;

			System.out.println("Bitte geben Sie ihr Startguthaben ein:"); 
			guthaben = sc.nextDouble();

			System.out.println("Bitte geben Sie den Zinssatz (in %) ein:");
			zins = sc.nextDouble();

			System.out.println("Bitte geben Sie ihr Sparziel ein:");
			sparziel = sc.nextDouble();

			while (guthaben <= sparziel) {
				jahrzaehler++;
				guthaben = guthaben * (1 + zins / 100);
				guthaben = guthaben + guthaben_erhoehung;

				if (guthaben >= sparziel) {
					System.out.println("Guthaben nach dem " + jahrzaehler + ". Jahr: " + guthaben);

				}
			}
			sc.close();
		}
	}
}