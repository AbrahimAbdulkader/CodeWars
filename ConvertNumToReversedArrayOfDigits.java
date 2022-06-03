package FundamentalQuestions;

import java.util.Arrays;

public class ConvertNumToReversedArrayOfDigits {
    /*
    Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

            Example(Input => Output):
            348597 => [7,9,5,8,4,3]
            0 => [0]

     */

    public static int[] digitize(long n) {
        String str = Long.toString(n); //Converting the long to a String
        int[] arr = new int[str.length()];
        for(int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
    }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(45431)));
    }
}
