package Blatt05.Aufgabenteil01;

public class printVowels {

    public printVowels(String Liedtext, String vowel) {
        String new_liedtext = Liedtext.replace("a", vowel);
        new_liedtext = new_liedtext.replace("e", vowel);
        new_liedtext = new_liedtext.replace("i", vowel);
        new_liedtext = new_liedtext.replace("o", vowel);
        new_liedtext = new_liedtext.replace("u", vowel);
        new_liedtext = new_liedtext.replace("ä", vowel);
        new_liedtext = new_liedtext.replace("ö", vowel);
        new_liedtext = new_liedtext.replace("ü", vowel);
        new printcentered(new_liedtext);
    }


}
    

