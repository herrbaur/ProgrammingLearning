package ProgrammierenUebung.Blatt01;

import java.util.Scanner;

public class Befragung {

    public static void main(String[] args) {
        int h;
        float p_i;

        System.out.println("Bitte Anzahl Hoerende eingeben:");
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        System.out.println("Es gibt " + h + " Hoerende.");

        System.out.println("1. Persoenlicher Internetanschluss bzw. -zugang? Anzahl:");
        p_i = 100.f * sc.nextInt() / h;
        System.out.println("Anteil: " + p_i + "%");

        System.out.println("2. Eigener PC? Anzahl:");
        p_i = 100.f * sc.nextInt() / h;
        System.out.println("Anteil: " + p_i + "%");

        System.out.println("3. Gehen in die Mensa? Anzahl:");
        p_i = 100.f * sc.nextInt() / h;
        System.out.println("Anteil: " + p_i + "%");

        System.out.println("4. Hören Sie bei der Vorlesung zu? Anzahl:");
        p_i = 100.f * sc.nextInt() / h;
        System.out.println("Anteil: " + p_i + "%");

        sc.close(); 
    }
}
