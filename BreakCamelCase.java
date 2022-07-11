package FundamentalQuestions;

public class BreakCamelCase {

    /*
    Complete the solution so that the function will break up camel casing, using a space between words.

    Example
    "camelCasing"  =>  "camel Casing"
    "identifier"   =>  "identifier"
    ""             =>  ""
     */

    public static String camelCase(String input) {

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            if(Character.isUpperCase(input.charAt(i))) {
                stringBuilder.append(" ");
                stringBuilder.append(input.charAt(i));
            }
            else {
                stringBuilder.append(input.charAt(i));
            }
        }
        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        System.out.println(camelCase("camelCase"));
    }
}
