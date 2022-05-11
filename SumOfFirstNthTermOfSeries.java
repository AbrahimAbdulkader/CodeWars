package FundamentalQuestions;

public class SumOfFirstNthTermOfSeries {
    public static String seriesSum(int n) {

        double sum = 1; //Sum variable
        double divisor = 1; //My Divisor


        for (int i = 1; i < n; i++) { //We are looping from 1 up to n - 1
            if (i == 0) { //If the index at i is equal to 0, we simply return 1
                return "1";
            } else { //else we increment our divisor by 3, calculate our series and add it to the sum
                divisor += 3;
                sum += 1.0 / divisor;
            }
        }
        String result = Double.toString(sum); //We return the result in a string format using the toString method
        return String.format("%.2f", sum); //Return the string formatted to 2 decimal places

    }
//		double roundOff = Math.round(sum * 100.0) / 100.0;

    // 5   1 + (1 / 4) + 1(1 / 7) + 1(1/10) + 1(1/13)


    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }
}
