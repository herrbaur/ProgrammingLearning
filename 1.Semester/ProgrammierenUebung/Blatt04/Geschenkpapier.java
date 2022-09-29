package ProgrammierenUebung.Blatt04;

import java.awt.*;
import javax.swing.JFrame;

public class Geschenkpapier extends JFrame {

	public static int width = 1024;
	public static int height = 1024;

	public Geschenkpapier() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(width, height);
		this.setTitle("Geschenkpapier" + this.getClass().getName());
		this.setVisible(true);
	}

	public int getRandomNumber(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}

	public static void main(String[] args) {
		new Geschenkpapier();
	}

	public void paint(Graphics g) {
		
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		this.meineZufallsSterne(g); 
	}

	public void meineZufallsSterne(Graphics g) {
		for (int anzahl = 30; anzahl>0; anzahl--) {
			int r = getRandomNumber(150, 50);
			int xMitte = (int) (this.getWidth()/20+(Math.random() * this.getWidth())*18/20);
			int yMitte = (int) (this.getWidth()/20+(Math.random() * this.getHeight())*18/20);

			this.zeichneEinenStern(g, xMitte, yMitte, r);
		}
	}

	public void zeichneEinenStern(Graphics g, int xMitte, int yMitte, int r) {

		double gradSchritte = 15;

		for (int zaehler = 1; zaehler <= (360 / gradSchritte); zaehler++) {
			int xCoord_1 = (int) (xMitte + r * Math.sin(zaehler * Math.toRadians(gradSchritte)));
			int yCoord_1 = (int) (yMitte + r * Math.cos(zaehler * Math.toRadians(gradSchritte)));
			g.setColor(Color.BLUE);
			g.drawLine(xMitte, yMitte, xCoord_1, yCoord_1);
		}

		for (int zaehler = 1; zaehler <= (360 / gradSchritte); zaehler++) {
			int xCoord_2 = (int) (xMitte + (r / 2) * Math.sin(zaehler * Math.toRadians(gradSchritte) + Math.toRadians(gradSchritte / 2)));
			int yCoord_2 = (int) (yMitte + (r / 2) * Math.cos(zaehler * Math.toRadians(gradSchritte) + Math.toRadians(gradSchritte / 2)));
			g.setColor(Color.MAGENTA);
			g.drawLine(xMitte, yMitte, xCoord_2, yCoord_2);
		}
	}
}
