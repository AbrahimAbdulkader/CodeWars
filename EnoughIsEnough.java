package FundamentalQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class EnoughIsEnough {

    /*
    Alice and Bob were on a holiday. Both of them took many pictures of the places they've been,
    and now they want to show Charlie their entire collection. However, Charlie doesn't like these sessions,
    since the motif usually repeats. He isn't fond of seeing the Eiffel tower 40 times.
    He tells them that he will only sit for the session if they show the same motif at most N times.
    Luckily, Alice and Bob are able to encode the motif as a number.
    Can you help them to remove numbers such that their list contains each number only up to N times,
    without changing the order?

Task
Given a list and a number, create a new list that contains each number of list at most N times, without reordering.
For example if the input number is 2, and the input list is [1,2,3,1,2,1,2,3],
you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3,
which leads to [1,2,3,1,2,3].
With list [20,37,20,21] and number 1, the result would be [20,37,21].
     */

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        //array = [20, 37, ]
        //elements = [20, 37, 20, 21]
        //map = [20, 37, ]


        HashMap<Integer, Integer> map = new HashMap<>();
        int [] array = new int[maxOccurrences * 3];
        for(int i = 0; i < elements.length; i++) {
            if(map.containsValue(array[i])) {
                continue;
            }
            else  {
                array[i] = elements[i];
            }
            map.put(i, array[i]);
        }

        return array;
    }

    public static void main(String[] args) {
        int [] arr = {21, 23, 23, 45, 46};
        System.out.println(Arrays.toString(deleteNth(arr, 2)));
    }

}
