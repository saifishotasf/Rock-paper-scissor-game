import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors!");

        String[] options = { "Rock", "Paper", "Scissors" };
        
        while (true) {
            System.out.println("Enter your choice (Rock, Paper, Scissors, or Quit):");
            String userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("Quit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            int computerChoiceIndex = random.nextInt(3);
            String computerChoice = options[computerChoiceIndex];

            System.out.println("Computer chose: " + computerChoice);

            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                       (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
                       (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close();
    }
}
