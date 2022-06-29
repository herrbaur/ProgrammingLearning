package Blatt08;

import java.lang.Math;

public class RecursiveSimplerTasks {
    int count = 1;
    public Integer prt1234(long n){
        System.out.println(count);
        count ++;
        n--;
        if (n<0){
            return 0;
        }
        else{
            return prt1234(n);
        }
        
    }
    public Integer prtsqr1234(long n){
        System.out.println(Math.pow(count,2));
        count ++;
        n--;
        if (n<0){
            return 0;
        }
        else{
            return prtsqr1234(n);
        }
        
    }
    public Integer prt2468(long n){
        if(count%2 == 0){
            System.out.println(count);
        }
        count ++;
        n--;
        if (n <= 0){
            return 0;
        }
        else{
            return prt2468(n);
        }
    }

    public static void main(String[]args){
        int a = 3;
        RecursiveSimplerTasks Methode = new RecursiveSimplerTasks();
        switch(a){
            case 1:
                Methode.prt1234(5);
                break;
            case 2:
                Methode.prtsqr1234(5);
                break;
            case 3:
                Methode.prt2468(5);
        }
    }
}
