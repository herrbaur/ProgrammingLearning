package ProgrammierenUebung.Blatt03;
import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse, um ein Raster zu malen
 */
public class LoesungKegel extends JFrame {

    /** Konstruktor. Nichts zu ändern hier */
    public LoesungKegel(){
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(610,417);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName()); 
        this.setVisible(true);
    }

    /** Main-Methode. Nichts zu ändern hier. */
    public static void main(String[] args){
    	new LoesungKegel();
    }
   
    /** Paint-Methode. Nichts zu ändern hier. Diese Methode 
     *  wird beim Öffnen des Fensters automatisch aufgerufen. 
     *  Die Methode wird auch aufgerufen, wenn die Größe des Fensters
     *  verändert wird. 
     *  @param g Grafik, auf die gezeichnet wird.
     *  */
    public void paint(Graphics g){
    	/* Löschen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
    	g.clearRect(0, 0, this.getWidth(), this.getHeight());
    	
    	
    	this.meinKegel(g); // Aufruf der selbst programmierten Methode
    }
   
	/** 
	 * Hier bitte die Lösung, um den Kegel zu zeichnen
	 * 
	 */
   public void meinKegel(Graphics g){
        int[] xKoordinate = new int[43];
        int[] yKoordinate = new int[2];
        yKoordinate[0] = this.getHeight()/4;
        yKoordinate[1] = this.getHeight()*3/4;
        int xStep = this.getWidth()/86;
        for (int i=1;i < xKoordinate.length;i++){      //legt den Inhalt des Arrays fest
        xKoordinate[i] = this.getWidth()/4 + xStep * i;
        }
        for (int j=1;j < xKoordinate.length;j++){
            if (j < 42 && j > 1){
                g.setColor(Color.GRAY);
            }
            else{
                g.setColor(Color.BLACK);
            }
            g.drawLine(xKoordinate[j], yKoordinate[0], xKoordinate[43-j], yKoordinate[1]);
            g.drawLine(xKoordinate[1], yKoordinate[1], xKoordinate[42], yKoordinate[1]);
            g.drawLine(xKoordinate[1], yKoordinate[0], xKoordinate[42], yKoordinate[0]);
        }
   } 
}