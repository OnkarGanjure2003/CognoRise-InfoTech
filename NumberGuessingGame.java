import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
       
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        
        int minNumber = 1;
        int maxNumber = 100;

        
        int targetNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;

        
        int maxAttempts = 5;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + minNumber + " and " + maxNumber + ". Try to guess it!");

        
        while (attempts < maxAttempts && !hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            
            if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number correctly.");
                hasGuessedCorrectly = true;
            }
        }

        
        if (!hasGuessedCorrectly) {
            System.out.println("Sorry, you've used all your attempts. The number was " + targetNumber + ".");
        }

        
        scanner.close();
    }
}