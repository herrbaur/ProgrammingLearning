package Blatt05.Aufgabenteil02;

public class Huhn {

	//Instanzvariablen
	private String name;
	private boolean hungrig;
	//Klassenvariable durch "static"
	private static int anzahlHuehner; 
	
	// Konstruktormethode
	public Huhn(String Name) {
		name  = Name;
		hungrig = true;
		anzahlHuehner++;
	}
	
	public void setHungrig(boolean sethungrig) {
		hungrig = sethungrig;
	}
	
	public boolean getStatus(Huhn huhn) {
		return huhn.hungrig;
	}
	
	// Jedes Huhn welches die Methode getName aufrufen kann, bekommt den Namen zurÃ¼ck
	public String getName() {		
		return this.name;
	}
	
	public static int getAnzahlHuehner() {
		return anzahlHuehner;
	}
	
}