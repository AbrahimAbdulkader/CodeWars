package FundamentalQuestions;

public class SquarenSum {

    /*
    Complete the square sum function so that it squares each number passed into it and then sums the results together.
    For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
     */

    public static int squareSum(int[] n) {
        int sum = 0;
        for(int i = 0; i < n.length; i++) {
            n[i] = (int) Math.pow(n[i], 2); //Loop through each element and square it
            sum += n[i]; //We add the squared value to the sum
        }
        return sum; //return the sum
    }

    public static void main(String[] args) {
        int [] arr = {5, 2, 2};
        System.out.println(squareSum(arr));
    }
}
