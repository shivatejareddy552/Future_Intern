
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Set the range for the random number
        int lowerBound = 1;
        int upperBound = 100;
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        // Maximum number of attempts
        int maxAttempts = 5;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess the number.");

        // Game loop
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            int playerGuess = scanner.nextInt();

            if (playerGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the number correctly in " + attempt + " attempts.");
                break;
            } else if (playerGuess < targetNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }

            if (attempt == maxAttempts) {
                System.out.println("Sorry! You've used all " + maxAttempts + " attempts.");
                System.out.println("The correct number was: " + targetNumber);
            }
        }

        // Close scanner to prevent resource leak
        scanner.close();
    }
}
