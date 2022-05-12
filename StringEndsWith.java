package FundamentalQuestions;

import java.sql.SQLOutput;

public class StringEndsWith {

    public static boolean solution(String str, String ending) {

        if(str.charAt(str.length() - 1) == ending.charAt(ending.length() - 1)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "abcd";
        String ending = "acde";
        System.out.println(solution(str, ending));

    }
}
