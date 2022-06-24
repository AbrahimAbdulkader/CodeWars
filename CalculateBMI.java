package FundamentalQuestions;

public class CalculateBMI {
    public static String bmi(double weight, double height) {

        double BMI = weight / (Math.pow(height, 2));

        if(BMI <= 18.5) {
            return "Underweight";
        }

        else if(BMI <= 25.0) {
            return "Normal";
        }
        else if(BMI <= 30.0) {
            return "Overweight";
        }
        return "Obese";


    }
    public static void main(String[] args) {
        System.out.println(bmi(80, 1.8));
    }
}
