package ProgrammierenUebung.Blatt05.Aufgabenteil01;

public class printVowels {

    public printVowels(String Liedtext, char vowel) {
        char[] oldvowels = {'a','e','i','o','u','ä','ö','ü'};
        for(int i = 0; i< oldvowels.length;i++){
            Liedtext = Liedtext.replace(oldvowels[i], vowel);
        }
        new printcentered(Liedtext);
    }
}
    

