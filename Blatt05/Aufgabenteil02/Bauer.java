package Blatt05.Aufgabenteil02;

public class Bauer {
    private String name;

    Huhn huhn = new Huhn("Hilde");

    public Bauer(String bauerName){
       name = bauerName;
       rufeHuhn();
       fuettern();
    }
    public void fuettern(){
        huhn.setHungrig(true);
    }
    public void rufeHuhn(){
        huhn.getName();
    }
}
