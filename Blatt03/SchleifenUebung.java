package Blatt03;
import java.util.Scanner;

public class SchleifenUebung{
    public static void main (String[]args){
        int auswahl;

        System.out.println("Wähle deinen Programmteil:");
        Scanner sc = new Scanner(System.in);
        auswahl = sc.nextInt();
        sc.close();

        double startwert = -4;
        double endwert = 4;
        double schrittweite = 0.5;

        switch(auswahl){
        case 1:
            for (double i = startwert; i <= endwert; i += schrittweite){
                double quadratzahl = Math.pow(i,2);
                System.out.println("x, x²: "+i+", "+quadratzahl);
            }
            break;
        case 2:
            for (double i = startwert; i <= endwert; i += schrittweite){
                double sin = Math.sin(i);
                double cos = Math.cos(i);
                System.out.println("x, sin(x), cos(x): "+i+", "+sin+", "+cos);
            }
            break;
        }

    }
}