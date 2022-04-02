package Blatt03;
import java.awt.*;
import javax.swing.JFrame;

public class LoesungDiagonalen extends JFrame {

    public LoesungDiagonalen(){
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        this.setSize(600,400);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName()); 
        this.setVisible(true);
    }

    public static void main(String[] args){
    	new LoesungDiagonalen();
    }

    public void paint(Graphics g){
    	/* Löschen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
    	g.clearRect(0, 0, this.getWidth(), this.getHeight());
    	
    	this.meineDiagonalen(g); // Aufruf der selbst programmierten Methode
    }
   
   public void meineDiagonalen(Graphics g){
		int x25 = this.getWidth() / 4;		// x-Koordinate bei 25% der Fensterbreite (von links)
		int x75 = this.getWidth() * 3 / 4;  // x-Koordinate bei 75% der Fensterbreite (von links)
		int y25 = this.getHeight() / 4;		// y-Koordinate bei 25% der Fensterbreite (von oben)
		int y75 = this.getHeight() * 3 / 4; // y-Koordinate bei 75% der Fensterbreite (von oben)

		g.drawLine(x75, y25, x25, y25);
		g.drawLine(x25, y25, x25, y75);
		g.drawLine(x25, y75, x75, y75);
		g.drawLine(x75, y75, x75, y25);

		g.setColor(Color.RED); 
		g.drawLine(x25, y25, x75, y75);

		g.setColor(Color.BLUE); 
		g.drawLine(x25, y75, x75, y25);
   } 
}
