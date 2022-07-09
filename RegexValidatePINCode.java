package FundamentalQuestions;

public class RegexValidatePINCode {

    /*
    TM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
    If the function is passed a valid PIN string, return true, else return false.

    Ex: "3454" true
    Ex: "394859" true
    Ex: "454" false
    Ex: 845H" false
     */

    public static boolean validatePin(String pin) {
        if(pin.length() != 4 && pin.length() != 6) {
            return false;
        }
        boolean pinValid = true;
        for (char ch : pin.toCharArray()) { // Convert a string to an array of chars
                if (Character.isLetter(ch)) { //
                    pinValid = false;
                    break;
                }
            }
        return pinValid;
    }

    public static void main(String[] args) {
        System.out.println(validatePin("9003"));
    }
}
