package FundamentalQuestions;

import java.util.HashMap;
import java.util.Locale;

public class Isogram {

    /*
    An isogram is a word that has no repeating letters, consecutive or non-consecutive.
    Implement a function that determines whether a string that contains only letters is an isogram.
    Assume the empty string is an isogram. Ignore letter case.
    Example: (Input --> Output)
    "Dermatoglyphics" --> true
    "aba" --> false
    "moOse" --> false (ignore letter case)
     */


    public static boolean  isIsogram(String str) {

        HashMap<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsValue(str.toLowerCase().charAt(i))) {
                    return false;
                }

            map.put(i, str.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("mose"));

    }
}



