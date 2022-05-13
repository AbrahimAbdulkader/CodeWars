package FundamentalQuestions;

import java.util.Arrays;

public class ReversedSequence {

    public static int[] reverse(int n){
        int[] res = new int[n]; //Created an array of size n
        for (int i = 0; i < n; i++)
            res[i] = n - i;
        return res;
    }


    public static void main(String[] args) {
        int num = 5;
        System.out.println(Arrays.toString(reverse(5)));
    }
}
