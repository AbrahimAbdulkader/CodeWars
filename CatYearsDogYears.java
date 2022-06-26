package FundamentalQuestions;

import java.util.Arrays;

public class CatYearsDogYears {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        int catYears = 0;
        int dogYears = 0;

        if(humanYears == 1) {
            catYears += 15;
            dogYears += 15;
        }

        else if(humanYears == 2) {
            catYears = 15 + 9;
            dogYears = 15 + 9;
        }

        else if(humanYears > 2) {
            catYears = 24 + (humanYears * 4);
            dogYears = 24 + (humanYears * 5);
        }

        return new int[]{humanYears, catYears, dogYears};
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(3)));
    }
}
