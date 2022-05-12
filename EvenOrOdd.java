package FundamentalQuestions;

public class EvenOrOdd {

    public static String even_or_odd(int number) {
        return number % 2 == 0 ? "Even for even numbers" : "Odd for odd numbers";
    }

    public static void main(String[] args) {
        System.out.println(even_or_odd(7));
    }
}
