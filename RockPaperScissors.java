package FundamentalQuestions;

public class RockPaperScissors {

    // scissors beats paper
    // rock beats scissors
    // paper beats rock
    public static String rps(String p1, String p2) {
        if(p1.equalsIgnoreCase("Scissors") && p2.equalsIgnoreCase("Paper")) {
            return "Player 1 won!";
        }
        else if(p1.equalsIgnoreCase("Rock") && p2.equalsIgnoreCase("Scissors")) {
            return "Player 1 won!";
        }
        else if(p1.equalsIgnoreCase("Paper") && p2.equalsIgnoreCase("Rock")) {
            return "Player 1 won!";
        }

        else if(p1.equals(p2)) {
            return "Draw!";
        }
        else return "Player 2 won!";
    }

    public static void main(String[] args) {
        System.out.println(rps("paper", "paper"));
    }
}
