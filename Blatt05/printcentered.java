package Blatt05;

public class printcentered {
    public printcentered(String Liedtext) {
        int maxCount = 0;
        String[] Liedformatiert;
        String[] Liedteil = Liedtext.split("\n");
        int[] anzahl = new int[3];

        for (int i = 0; i < 4; i++) {
            anzahl[i] = Liedteil[i].length();
            if (anzahl[i] > maxCount) {
                maxCount = anzahl[i];
                }  
            if (i==3){
                for (int j = 0; j < 4; j++) {
                    if (Liedteil[j].length() < maxCount){
                        String Einrückung ="/t";
                        int blanks = (maxCount-Liedteil[j].length())/2;
                            for (;blanks > 0; blanks--) {
                                Liedteil[j] = Einrückung + Liedteil[j];
                            }  
                    }
                    System.out.println(Liedteil[j]);
                    System.out.println("hallo");
                }  
            }
        }

        
    }
}