package FundamentalQuestions;

public class DoubleChar {
    /*
    Given a string, you have to return a string in which each character (case-sensitive) is repeated once.

    Examples (Input -> Output):
            * "String"      -> "SSttrriinngg"
            * "Hello World" -> "HHeelllloo  WWoorrlldd"
            * "1234!_ "     -> "11223344!!__  "

     */

    public static String doubleChar(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i));
            stringBuilder.append(s.charAt(i));
        }
        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("Hello"));
    }

    }
