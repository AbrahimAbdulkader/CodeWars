package FundamentalQuestions;

import java.util.Arrays;

public class SumWithoutHighestAndLowestNum {

    public static int sum(int[] numbers) {

        // 1. Loop through the array and add all the elements to a sum variable
        // 2. Find the max and min element
        // 3. Subtract both the max and min from the sum

        if(numbers == null || numbers.length < 2) {
            return 0;
        }

        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;
        int maxMin = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if(numbers[i] < min) { //Looking for the minimum element and storing it in a min variable
                min = numbers[i];
            }
            if(numbers[i] > max) { //Looking for the maximum element and storing it in a max variable
                max = numbers[i];
            }
        }
        maxMin = max + min; // Adding the min and max together to then subtract it from the sum
        return sum -= maxMin;
    }

    public static void main(String[] args) {
        int [] arr = {6, 2, 1, 8, 10};
        int [] arr2 = {1, 1, 11, 2, 3};
        System.out.println(sum(arr));
    }
}
