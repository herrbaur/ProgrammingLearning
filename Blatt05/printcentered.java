package Blatt05;

import java.util.ArrayList;
import java.util.Arrays;

public class printcentered {
    public printcentered(String Text) {
        int maxChar = 0;
        ArrayList<String> parts = new ArrayList<String>(Arrays.asList(Text.split("\n")));
        ArrayList<Integer> charCount = new ArrayList<Integer>();

        for (int i = 0; i < parts.size(); i++) {
            charCount.add(i, parts.get(i).length());
            if (charCount.get(i) > maxChar) {
                maxChar = charCount.get(i);
            }
        }
        for (int j = 0; j < parts.size(); j++) {
            if (parts.get(j).length() < maxChar) {
                int blanks = (maxChar - parts.get(j).length()) / 2;
                for (; blanks > 0; blanks--) {
                    parts.set(j, " " + parts.get(j));
                }
            }
            System.out.println(parts.get(j));
        }
    }
}