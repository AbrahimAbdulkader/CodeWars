package FundamentalQuestions;

public class GetMiddle {

    public static String getMiddle(String word) {

        /*
        You are going to be given a word.
        Your job is to return the middle character of the word.
        If the word's length is odd, return the middle character.
        If the word's length is even, return the middle 2 characters.
         */

        String result = "";
        for(int i = word.length() / 2; i < word.length(); i++) {
            if(word.length() % 2 == 0) {
                result += word.charAt(i - 1);
                result += word.charAt(i);
                return result;
            }
        }
        return result += word.charAt(word.length() / 2);
    }

    public static void main(String[] args) {
        String str = "testing";
        System.out.println(getMiddle(str));
    }

}
