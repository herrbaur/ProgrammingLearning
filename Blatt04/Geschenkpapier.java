package Blatt04;

import java.awt.*;
import javax.swing.JFrame;

public class Geschenkpapier extends JFrame {

    public static int width = 1024;
    public static int height = 1024;

    public Geschenkpapier() {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1024, 1024);
        this.setTitle("Schnitzel mit Pommes" + this.getClass().getName());
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Geschenkpapier();
    }

    public void paint(Graphics g) {
        for (int anzahl = 10; anzahl > 0; anzahl--) {
            this.Stern(g); // Aufruf der selbst programmierten Methode
        }
    }

    public void Stern(Graphics g) {

        double Gradschritte = 15;
        double radius = 50 + 100 * Math.random();
        int[] xKoordinate = new int[100];
        int[] yKoordinate = new int[100];
        double xMitte = this.getWidth() / 20 + (this.getWidth()*18/20) * Math.random();
        double yMitte = this.getHeight() / 20 + (this.getHeight()*18/20) * Math.random();
        
        xKoordinate[0] = (int)xMitte;
        yKoordinate[0] = (int)yMitte;
               
        for (int zaehler = 1; zaehler <= (360 / Gradschritte); zaehler++) {
            xKoordinate[1] = (int) (xKoordinate[0] + radius * Math.sin(zaehler * Math.toRadians(Gradschritte)));
            yKoordinate[1] = (int) (yKoordinate[0] + radius * Math.cos(zaehler * Math.toRadians(Gradschritte)));
            g.setColor(Color.BLUE);
            g.drawLine(xKoordinate[0], yKoordinate[0], xKoordinate[1], yKoordinate[1]);
        }
        ;
        for (int zaehler = 1; zaehler <= (360 / Gradschritte); zaehler++) {
            xKoordinate[2] = (int) (xKoordinate[0] + (radius / 2)
                    * Math.sin(zaehler * Math.toRadians(Gradschritte) + Math.toRadians(Gradschritte / 2)));
            yKoordinate[2] = (int) (yKoordinate[0] + (radius / 2)
                    * Math.cos(zaehler * Math.toRadians(Gradschritte) + Math.toRadians(Gradschritte / 2)));
            g.setColor(Color.MAGENTA);
            g.drawLine(xKoordinate[0], yKoordinate[0], xKoordinate[2], yKoordinate[2]);
        }
        ;

    }
}