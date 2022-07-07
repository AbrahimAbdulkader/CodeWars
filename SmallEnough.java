package FundamentalQuestions;

public class SmallEnough {

    public static boolean smallEnough(int[] a, int limit) {

        //Take the array values and add them in a sum variable
        //once added, check if they are smaller than the "limit"
        //If the sum is less than limit, return true, else false

        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        if(sum <= limit) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {23, 35, 54};
        System.out.println(smallEnough(arr, 111));
    }
}
