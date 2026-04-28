package org.APCSLowell;
import java.util.ArrayList;
// FRQ: https://secure-media.collegeboard.org/digitalServices/pdf/ap/ap16_frq_computer_science_a.pdf
public class RandomStringChooser {
    private ArrayList<String> words;
    private int valuesLeft;

    public RandomStringChooser (String [] wordArray) {
    words= new ArrayList<String> ();
    for (int i = 0; i <wordArray.length; i++)
        words.add(wordArray[i]);
    valuesLeft=words.size();
    }

    public String getNext() {
        if (valuesLeft == 0)
            return "NONE";
        int index = (int)(Math.random() * valuesLeft);
        String selected = words.get(index);
        words.set(index, words.get(valuesLeft - 1));
        valuesLeft--;
        return selected;
    }
}
