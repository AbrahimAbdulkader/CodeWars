package FundamentalQuestions;

public class HighestAndLowest {

    /*
    In this little assignment you are given a string of space separated numbers,
    and have to return the highest and lowest number.

    Examples
    highAndLow("1 2 3 4 5")  // return "5 1"
    highAndLow("1 2 -3 4 5") // return "5 -3"
    highAndLow("1 9 3 4 -5") // return "9 -5"

     */


    public static String highAndLow(String numbers) {
        String[] array = numbers.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0; i< array.length; i++){
            int value = Integer.parseInt(array[i]);
            if (value < min) min = value;
            if (value > max) max = value;
        }
        return String.format("%d %d", max, min);
    }

    public static void main(String[] args) {
        String numbers = "1, 2, 3, 4, 5";
        System.out.println(highAndLow(numbers));
    }
}
