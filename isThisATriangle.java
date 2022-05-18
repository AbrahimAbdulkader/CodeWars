package FundamentalQuestions;

public class isThisATriangle {
    public static boolean isTriangle(int a, int b, int c){
        // A triangle is valid if two sides is greater than the third side
        return a + b > c && a + c > b && c + b > a;
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(1, 2, 2)); //true
        System.out.println(isTriangle(7, 2, 2)); //false
    }
}
