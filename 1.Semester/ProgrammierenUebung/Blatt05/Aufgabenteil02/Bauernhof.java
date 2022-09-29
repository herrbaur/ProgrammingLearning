
package ProgrammierenUebung.Blatt05.Aufgabenteil02;

public class Bauernhof {

	public static void main(String[] args) {
		Bauer Walter = new Bauer("Walter");	
		Bauer Manfred = new Bauer("Manfred");
		Huhn Huhn1 = new Huhn("Heidrun");
		Huhn Huhn2 = new Huhn("Heike");
		Huhn Huhn3 = new Huhn("Hannelore");
		
		Walter.rufeHuhn(Huhn2);
		Walter.fuettern(Huhn1);
		Manfred.fuettern(Huhn2);
		Walter.fuettern(Huhn3);
		
		Walter.berechneAnzahlHungrigerHuehner();
		Manfred.berechneAnzahlHungrigerHuehner();
		
		}
}