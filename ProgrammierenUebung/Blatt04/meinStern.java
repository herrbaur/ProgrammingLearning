package ProgrammierenUebung.Blatt04;
import java.awt.*;
import javax.swing.JFrame;

public class meinStern extends JFrame {

    public static int width = 1024;
    public static int height = 1024;

    public meinStern(){
          super();
          setDefaultCloseOperation(EXIT_ON_CLOSE);
          this.setSize(1024,1024);
          this.setTitle("Schnitzel mit Pommes" + this.getClass().getName()); 
          this.setVisible(true);
    }

    public static void main(String[]args){
        new meinStern();
    }

    public void paint(Graphics g){
        g.clearRect(0, 0, this.getWidth(), this.getHeight());


        this.Stern(g); // Aufruf der selbst programmierten Methode
    }

    public void Stern(Graphics g){
        double Gradschritte = 15;
        int radius = 200;
        int[] xKoordinate = new int[100];
        int[] yKoordinate = new int[100];

        xKoordinate[0] = this.getWidth()/2;
        yKoordinate[0] = this.getHeight()/2;
        for(int zaehler=1;zaehler<=(360/Gradschritte);zaehler++) {
            xKoordinate[1] = (int) (xKoordinate[0] + radius*Math.sin(zaehler*Math.toRadians(Gradschritte)));
            yKoordinate[1] = (int) (yKoordinate[0] + radius*Math.cos(zaehler*Math.toRadians(Gradschritte))); 
            g.setColor(Color.BLUE);
            g.drawLine(xKoordinate[0],yKoordinate[0],xKoordinate[1],yKoordinate[1]);
        };
        for(int zaehler=1;zaehler<=(360/Gradschritte);zaehler++) {
            xKoordinate[2] = (int) (xKoordinate[0] + (radius/2)*Math.sin(zaehler*Math.toRadians(Gradschritte)+Math.toRadians(Gradschritte/2)));
            yKoordinate[2] = (int) (yKoordinate[0] + (radius/2)*Math.cos(zaehler*Math.toRadians(Gradschritte)+Math.toRadians(Gradschritte/2)));
            g.setColor(Color.MAGENTA);
            g.drawLine(xKoordinate[0], yKoordinate[0], xKoordinate[2], yKoordinate[2]);
        };
    }
}