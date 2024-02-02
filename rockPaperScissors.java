import java.util.*;
import java.util.Random;

public class rockPaperScissors {
    Scanner sc = new Scanner(System.in);

    public String computerChoice() {
        String[] choices = { "rock", "paper", "scissors" };
        Random random = new Random();
        int randomindex = random.nextInt(choices.length);
        return choices[randomindex];
    }

    public void choice(String playerChoice) {
        String computerChoice = computerChoice();
        String lowerCaseChoice = playerChoice.toLowerCase();
        switch (lowerCaseChoice) {
            case "rock":

                break;
            case "paper":
                break;
            case "scissors":
                break;
            default:
                System.out.println("invalid");
                break;
        }
        switch (playerChoice) {
            case "rock":
                if (computerChoice.equals("scissors")) {
                    System.out.println("player wins");
                } else if (computerChoice.equals("paper")) {
                    System.out.println("Computer wins");
                } else if (computerChoice.equals("rock")) {
                    System.out.println("tie");
                } else {
                    System.out.println("retry");
                }
                break;
            case "scissors":
                if (computerChoice.equals("rock")) {
                    System.out.println("Computer wins");
                } else if (computerChoice.equals("paper")) {
                    System.out.println("Player wins");
                } else if (computerChoice.equals("scissors")) {
                    System.out.println("tie");
                } else {
                    System.out.println("retry");
                }
                break;
            case "paper":
                if (computerChoice.equals("scissors")) {
                    System.out.println("Computer wins");
                } else if (computerChoice.equals("rock")) {
                    System.out.println("player wins");
                } else if (computerChoice.equals("paper")) {
                    System.out.println("tie");
                } else {
                    System.out.println("retry");
                }
                break;
            default:
                System.out.println("invalid");
                break;
        }

        System.out.println("player:" + playerChoice);
        System.out.println("computer:" + computerChoice);

    }
}
