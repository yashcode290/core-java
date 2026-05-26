import java.util.Scanner;

public class gussinggame{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Generate random number between 1 to 100
        int randomNumber = (int)(Math.random() * 100) + 1;

        int attempts = 5;
        int guess;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have 5 attempts\n");

        for (int i = 1; i <= attempts; i++) {

            System.out.print("Attempt " + i + ": Enter your guess: ");
            guess = sc.nextInt();

            if (guess == randomNumber) {
                System.out.println("Correct! You guessed the number.");
                break;
            } 
            else if (guess < randomNumber) {
                System.out.println("Too low!");
            } 
            else {
                System.out.println("Too high!");
            }

            // If all attempts finished
            if (i == attempts) {
                System.out.println("\nGame Over!");
                System.out.println("The correct number was: " + randomNumber);
            }
        }

        sc.close();
    }
}