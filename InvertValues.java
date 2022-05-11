package FundamentalQuestions;

import java.util.Arrays;

public class InvertValues {
    public static int[] invert(int[] array) {

        if(array.length < 1 || array == null) { //If the array is empty or null, return an empty array
            return new int[0];
        }

        for(int i = 0; i < array.length; i++) { //We are looping through the array and inverting positive and negative numbers using -1
                array[i] *= -1; //( positive * negative = negative)   and     (negative * negative = negative)
        }

        return array;
    }

    public static void main(String[] args) {
        int [] arr = {-2, 3, 65, -10, 5};
        System.out.println(Arrays.toString(invert(arr)));
    }

}
