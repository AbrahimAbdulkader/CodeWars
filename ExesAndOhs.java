package FundamentalQuestions;

public class ExesAndOhs {

    /*
    Check to see if a string has the same amount of 'x's and 'o's.
    The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
     */

    public static boolean getXO (String str) {
        int numOfXs = 0;
        int numOfOs = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'x' || c == 'X') {
                numOfXs++;
            } else if (c == 'o' || c == 'O') {
                 numOfOs++;
            }
        }
        return numOfXs == numOfOs;
    }

    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
    }
}
