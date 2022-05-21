package FundamentalQuestions;

import java.util.Arrays;

public class CountOfPositiveNegativeNums {
    /*
    Given an array of integers.

    Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.

    If the input is an empty array or is null, return an empty array.

    Example
    For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
     */

    public static int[] countPositivesSumNegatives(int[] input) {
        int totalPositiveCount = 0;
        int totalNegativeSum = 0;

        if(input == null || input.length < 2) {
            return new int[]{};
        }

        for(int i = 0; i < input.length; i++) {
            if(input[i] > 0) {
                totalPositiveCount++;
            }
            else if(input[i] < 0) {
                totalNegativeSum += input[i];
            }
        }
        return new int[]{totalPositiveCount, totalNegativeSum};
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        System.out.println(Arrays.toString(countPositivesSumNegatives(arr)));
    }
}
