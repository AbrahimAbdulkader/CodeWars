package FundamentalQuestions;

public class CorrectTheMistakes {
    public static String correct(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == '5') {
                stringBuilder.append('S');
            }

            else if(string.charAt(i) == '0') {
                stringBuilder.append('O');
            }

            else if(string.charAt(i) == '1') {
                stringBuilder.append('I');
            }
            else {
                stringBuilder.append(string.charAt(i));
            }
        }
        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        System.out.println(correct("Hell0 my name Is Abe"));
    }
}
