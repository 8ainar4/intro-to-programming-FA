import java.security.SecureRandom;

public class Craps {
    // create a secure random number generator for dice rolls
    private static final SecureRandom randomNumbers = new SecureRandom();

    // enum to represent the status of the game
    private enum Status { CONTINUE, WON, LOST }

    // constants representing specific dice roll results
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0; // Variable to store the player's point if no win/loss on first roll
        Status gameStatus; // Current status of the game (refering to the enum)

        int sumOfDice = rollDice(); // First roll

        switch (sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON; // Player wins immediately
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST; // Player loses immediately
                break;
            default:
                gameStatus = Status.CONTINUE; // Game continues
                myPoint = sumOfDice; // Save the point value
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

        // Continue rolling dice until player wins or loses
        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();

            if (sumOfDice == myPoint) 
                gameStatus = Status.WON; // Player matched point
            else if (sumOfDice == SEVEN) 
                gameStatus = Status.LOST; // Player rolled 7 before matching point
        }

        // Print game result
        if (gameStatus == Status.WON)
            System.out.println("Player wins");
        else
            System.out.println("Player loses");
    }

    // Method to roll two dice, calculate and return their sum
    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6); // Roll first die
        int die2 = 1 + randomNumbers.nextInt(6); // Roll second die
        int sum = die1 + die2; // Calculate sum

        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum); // Show result

        return sum;
    }
}
