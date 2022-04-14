package Blatt05.Aufgabenteil02;

public class Huhn {
    private String name;
    private boolean hungrig = true;

    public Huhn(String huhnName){
        name = huhnName;
        hungrig = true;
    }
    public boolean setHungrig(boolean Futter){
        if(Futter = true){
            hungrig = false;
        }else{
            hungrig = true;
        }
        return hungrig;
    }
    public String getName(){
        return name;
    }
    
}
