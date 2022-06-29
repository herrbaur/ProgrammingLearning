package Blatt08;

import java.lang.Math;

public class MethodenUebung {

    public static float value = 3.9f;

    public float Betrag(float Zahl){
        float Betrag;
        if(Zahl < 0){
            Betrag = Zahl * (-1);
        }
        else{
            Betrag = Zahl;
        }
        return Betrag;
    }
    public float Aufrunden(float Zahl){
        float Runden = (int)Zahl+1;
        return Runden;
    }
    public float Abrunden(float Zahl){
        float Runden = (int)Zahl;
        return Runden;
    }
    public boolean Restlosteilbar(int Zähler, int Nenner){
        boolean Restlosteilbar = true;
        if(Zähler%Nenner != 0){
            Restlosteilbar = false;
        }
        return Restlosteilbar;
    }
    public float Abstand(int x1, int x2, int y1, int y2){
        float Abstand = (float) Math.sqrt(Math.pow((x1-y1),2)+Math.pow((x2-y2),2));

        return Abstand;
    }
    public float kleinsteZahl(float Zahl1, float Zahl2, float Zahl3){
        float kleinsteZahl = Zahl1;
        if(Zahl2 < kleinsteZahl){
            kleinsteZahl = Zahl2;
        }
        if(Zahl3 <kleinsteZahl){
            kleinsteZahl = Zahl3;
        }

        return kleinsteZahl;
    }
    public static void main(String[]args){
        MethodenUebung Methode = new MethodenUebung();
        System.out.println(Methode.Betrag(value));
        System.out.println(Methode.Aufrunden(value));
        System.out.println(Methode.Abrunden(value));
        System.out.println(Methode.Restlosteilbar(2,2));
        System.out.println(Methode.Abstand(1,2,1,3));
        System.out.println(Methode.kleinsteZahl(1, 2, 3));
    }
    
}
