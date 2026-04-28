package org.APCSLowell;

// FRQ: https://secure-media.collegeboard.org/digitalServices/pdf/ap/ap16_frq_computer_science_a.pdf
public class RandomLetterChooser extends RandomStringChooser {
    public RandomLetterChooser(String letters) {
        super(toStringArray(letters));
    }

    private static String[] toStringArray(String letters) {
        String[] chars = new String[letters.length()];
        for (int i = 0; i < letters.length(); i++) {
            chars[i] = letters.substring(i, i + 1);
        }
        return chars;
    }
}
