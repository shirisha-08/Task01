import java.util.Random;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 5;
        int score = 0;

        System.out.println("Guess The Number!");

        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("Guess The Number Between 1 to 100 !");

            boolean guessedCorrectly = false;
            while (!guessedCorrectly && attempts > 0) {
                System.out.print("Enter The Number: ");
                int guess = scanner.nextInt();

                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number!");
                    guessedCorrectly = true;
                    score++;
                } else if (guess < targetNumber) {
                    System.out.println("Too low! ");
                    attempts--;
                } else {
                    System.out.println("Too high! ");
                    attempts--;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Oops! You ran out of attempts. The correct number was " + targetNumber);
            }

            System.out.println("Your current score is: " + score);
            System.out.print("Do you want to play again? (Y/N): ");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("Y");
            attempts = 5;
        }

        System.out.println("Thanks for playing ! Your final score is: " + score);
    }
}



        
        