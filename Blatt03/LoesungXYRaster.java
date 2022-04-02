package Blatt03;
import java.awt.*;
import javax.swing.JFrame;



/**
 * Klasse, um ein Raster zu malen
 */
public class LoesungXYRaster extends JFrame {

    /** Konstruktor. Nichts zu ändern hier */
    public LoesungXYRaster(){
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(604,417);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName()); 
        this.setVisible(true);
    }

    /** Main-Methode. Nichts zu ändern hier. */
    public static void main(String[] args){
    	new LoesungXYRaster();
    }

    public void paint(Graphics g){
    	/* Löschen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
    	g.clearRect(0, 0, this.getWidth(), this.getHeight());
    	
    	this.meinRaster(g); // Aufruf der selbst programmierten Methode
    }

    public void meinRaster(Graphics g){
        int[] xKoordinate = new int[12];
        int[] yKoordinate = new int[12];
        int xStep = this.getWidth()/22;
        int yStep = this.getHeight()/22;
        for (int i=1;i < xKoordinate.length;i++){      //legt den Inhalt des Arrays fest
            xKoordinate[i] = this.getWidth()/4 + xStep * i;
            yKoordinate[i] = this.getHeight()/4 + yStep * i;
        }
        for (int j=1;j < xKoordinate.length;j++){
            if (j%2 == 0){
                g.setColor(Color.GRAY);
            }
            else{
                g.setColor(Color.BLACK);
            }
            g.drawLine(xKoordinate[j], yKoordinate[1], xKoordinate[j], yKoordinate[11]);
            g.drawLine(xKoordinate[1], yKoordinate[j], xKoordinate[11], yKoordinate[j]);
        }      
    } 
}
