package Blatt05.Aufgabenteil02;

public class Bauer {
	
	//Instanzvariablen
	private String name;
	//Klassenvariable
	private static int anzahlGefuetterterHuehner;
	
	
	public Bauer(String Name) {
		name = Name;
	}
	
	// Übergabe des Objektes Huhn von der Klasse Huhn
	public void fuettern(Huhn huhn) {
		if(huhn.getStatus(huhn)== true){
			huhn.setHungrig(false);
			anzahlGefuetterterHuehner++;
		}
	}
	
	public void rufeHuhn(Huhn huhn) {
		System.out.println(huhn.getName());
	}
	
	public void berechneAnzahlHungrigerHuehner() {
		System.out.println(Huhn.getAnzahlHuehner() - anzahlGefuetterterHuehner);
	}
	
}