import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        int maxAttempts = 5; // Change this to adjust the maximum number of attempts
        int score = 100; // Initial score
        
        System.out.println("Welcome to Guess the Number!");
        System.out.println("I have picked a number between " + lowerBound + " and " + upperBound + ". Guess it!");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                System.out.println("Your score is: " + score);
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            score -= 20; // Deduct some points for each incorrect attempt
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've used all your attempts. The number was: " + randomNumber);
            System.out.println("Better luck next time!");
        }

        scanner.close();
    }
}
