package FundamentalQuestions;

public class SentenceSmash {

        public static String smash(String [] words) {
            return String.join(" ", words);
        }


    /*
    1. StringBuilder
    2. Loop through the String array words and appended each word to the result
    3. Returned the result

     */

    public static void main(String[] args) {
        String [] arr = {"Hello", "My", "Name"};
        System.out.println(smash(arr));
    }
}
