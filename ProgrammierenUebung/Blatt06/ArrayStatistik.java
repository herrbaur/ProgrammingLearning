package ProgrammierenUebung.Blatt06;
import java.util.Arrays;

public class ArrayStatistik {
    static int[] Zahlen = {35, 7, 90, 26, 92, 54, 24, 65, 2, 67, 43, 26, 80, 92, 7, 40, 67, 66, 31, 45, 7, 100, 96, 93, 12, 20, 57, 22, 62, 51};
    static double[] [] KFZ = {{0.0,350.0,1500.0,5000.0},{0.774 , 0.182 , 0.061 , 0.013}};
    public void ArithmetischerMittelwert(int[] Werte){
        int sum = 0;
        int length =  Werte.length;
        for(int i=1; i <= length; i++) {
            sum = sum + Werte[i-1];
        }
        double Mittelwert = (double) sum/length;
        System.out.println("Der Arithmetische Mittelwert ist: " +Mittelwert); 
    }
    public void MinMax(int [] Werte){
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        int length = Werte.length;
        for(int i=0; i < length; i++) {
            if(Max < Werte[i]){
                Max = Werte[i];
            }else if(Min > Werte[i]){
                Min = Werte[i];
            }

        }
        if(length != 0){
            System.out.println("Der Maximalwert des Arrays beträgt: "+Max+" und der Minimalwert beträgt: "+Min);
        }
        else{
            System.out.println("Leeres Array");
        }
    }
    public void Median(int [] Werte){
        Arrays.sort(Werte);
        double Median;
        if(Werte.length % 2 == 0){
            Median = ((double)Werte[Werte.length/2] + (double)Werte[Werte.length/2 - 1])/2;  
        }
        else 
            Median = (double) Werte[Werte.length/2];
        System.out.println("Der Median ist: "+Median);
    }
    public void ErwartungswertSchaden(double [][] KFZ){
        double Schaden = KFZ[0][0]*KFZ[1][0]+KFZ[0][1]*KFZ[1][1]+KFZ[0][2]*KFZ[1][2]+KFZ[0][3]*KFZ[1][3];
        System.out.println("Erwartungswert des Schadens: "+Schaden);
    }
    public static void main (String[]args){
        ArrayStatistik Methode = new ArrayStatistik();
        Methode.ArithmetischerMittelwert(Zahlen);
        Methode.MinMax(Zahlen);
        Methode.Median(Zahlen);
        Methode.ErwartungswertSchaden(KFZ);
    }
    
}
