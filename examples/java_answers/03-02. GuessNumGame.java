import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();

        int num = rand.nextInt(100) + 1; 
        int tries = 0;
        int guess = 0;

        System.out.println("Guess a num between 1 - 100: ");

        while (true) {
            System.out.print("your guess: ");
            guess = input.nextInt();
            tries++;

            if (guess == num) {
                System.out.println("you did it! ");
                break;
            } else if (guess < num) {
                System.out.println("guess a bigger num.");
            } else {
                System.out.println("guess a smaller num.");
            }
        }

        System.out.printf("number of guesses: %d", tries);
    }
}
