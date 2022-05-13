package FundamentalQuestions;

public class BeginnerSeriesSumOfNumbers {

    /*
    Given two integers a and b, which can be positive or negative,
    find the sum of all the integers between and including them and return it.
    If the two numbers are equal return a or b.

Note: a and b are not ordered!

Examples (a, b) --> output (explanation)
(1, 0) --> 1 (1 + 0 = 1)
(1, 2) --> 3 (1 + 2 = 3)
(0, 1) --> 1 (0 + 1 = 1)
(1, 1) --> 1 (1 since both are same)
(-1, 0) --> -1 (-1 + 0 = -1)
(-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)

     */

    public static int getSum(int a, int b) {

        int sum = 0;
        while(a <= b) { //While a is less than or equal to b
            sum += a; //Add a to the sum and increment a by 1
            a++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSum(-1, 2));
    }

}
