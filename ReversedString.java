package FundamentalQuestions;

public class ReversedString {

    /*
    Complete the solution so that it reverses the string passed into it.

    'world'  =>  'dlrow'
    'word'   =>  'drow'
     */

    public static String solution(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        System.out.println(solution("Hello"));
    }

}
