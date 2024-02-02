import java.util.Scanner;

public class Rock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean playAgain = true;
        while (playAgain) {
            System.out.println("Enter your choice (Rock, Paper, Scissors)");
            String playerchoice = sc.nextLine();
            rockPaperScissors game = new rockPaperScissors();
            game.choice(playerchoice);

            System.out.println("want to play again yes/no");
            String answer = sc.nextLine().toLowerCase();
            playAgain = answer.equals("yes");

        }

        sc.close();

    }
}
