package ProgrammierenUebung.Blatt05.Aufgabenteil01;

public class DreiChinesen {
    static final String Liedtext = "Drei Chinesen mit dem Kontrabass\n"
            + "saßen auf der Straße und erzählten sich was.\n"
            + "Da kam die Polizei: Ja was ist denn das?\n"
            + "Drei Chinesen mit dem Kontrabass.\n\n";
    static final char Vowel = 'i';

    public DreiChinesen() {
        System.out.println(Liedtext);
    }

    public static void main(String[] args) {
        new printcentered(Liedtext);
        new printVowels(Liedtext, Vowel);
    }

}
