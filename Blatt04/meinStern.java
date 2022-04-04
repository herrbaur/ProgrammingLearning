package Blatt04;
import java.awt.*;
import javax.swing.JFrame;

public class meinStern extends JFrame {

    public static int width = 1024;
    public static int height = 786;


    public meinStern(){
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setTitle("Schnitzel mit Pommes");
        this.setVisible(true);
        }



    public static void main(String[]args){
        new meinStern();
    }
    
}
