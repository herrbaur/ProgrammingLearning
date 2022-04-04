package Plotter_Part1.src;
import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame {
    public static int width = 1024;
    public static int height = 786;

    /**
     * Konstruktor aus der Übung
     */
    public Grid() {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setTitle("Plotter");
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Grid();
    }

    // TODO: implementiere ein Koordinatenkreuz
    /**
     * coordinates zeichnet ein Koordinatenkreuz.
     */
    public void coordinates(Graphics g) {
        int[] xAxis = new int[4];
        int[] yAxis = new int[4];
        xAxis[1] = this.getWidth()/4;
        yAxis[1] = this.getHeight()/4;
        xAxis[2] = this.getWidth()*3/4;
        yAxis[2] = this.getHeight()*3/4;
        g.drawLine(xAxis[1], yAxis[2], xAxis[2], yAxis[2]);
		g.drawLine(xAxis[1], yAxis[1], xAxis[1], yAxis[2]);
    }

    // TODO: implementiere eine Achsenbeschriftung
    /**
     * labels zeichnet Achsenbeschriftungen bei ganzen Zahlen.
     */
    public void labels(Graphics g) {
        
    }

    // TODO: implementiere einen Funktionsplot.
    /**
     * plot zeichnet die durch die Expression e angegebene Funktion in der angegebenen Farbe in g.
     */
    public void plot(Graphics g, Expression e, Color c) {

    }

    /**
     * paint-Methode wie in der Vorlesung
     */
    public void paint(Graphics g) {
        coordinates(g);
        labels(g);
        // TODO: Hier weitere Beispiele einfügen
        // TODO: An diese Stelle sollst Du auch in den späteren Aufgabenteilen jeweils Funktionen in unterschiedlicher Syntax schreiben.
        plot(g, new HardcodedSin(), Color.RED);
    }
}
