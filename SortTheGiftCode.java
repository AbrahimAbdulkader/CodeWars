import java.util.Arrays;

public class SortTheGiftCode {

    public static String sortGiftCode(String code) {

        char[] convertString = code.toCharArray(); //Create a char array to store the string characters
        Arrays.sort(convertString); //Sort the letters in the char array

        return String.valueOf(convertString); //convert back to a string and return
    }

    public static void main(String[] args) {
        String code = "ksgnos";
        System.out.println(sortGiftCode(code));
    }
}
