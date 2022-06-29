package Blatt08;

public class xxxMethod {
    void xxx(long n) {
        if(n > 0L) {
        System.out.println(n);                                     //prints out the value
        xxx(n-1);                                                   // calls itself again -1
        }   
        else {}                                                    //stops the loop
        }
    void xxx2(long n) {
        for(;n > 0;n--){
            System.out.println(n);
        }
    }
}
