//the question is in 11.Random.pdf file

import java.security.SecureRandom;

public class Craps {
    // create a secure random number generator for dice rolls
    private static final SecureRandom randomNumbers = new SecureRandom();

    // enum to represent the status of the game
    private enum Status { CONTINUE, WON, LOST }

    // constants representing specific dice roll results
    // we call each sum a specific name in this game
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0; // variable to store the player's point if no win/loss on first roll
        Status gameStatus; // current status of the game (refering to the enum)

        int sumOfDice = rollDice(); // first roll

        switch (sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON; // player wins immediately
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST; // player loses immediately
                break;
            default:
                gameStatus = Status.CONTINUE; // game continues
                myPoint = sumOfDice; // save the point value
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

        // continue rolling dice until player wins or loses
        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();

            if (sumOfDice == myPoint) 
                gameStatus = Status.WON; // player matched point
            else if (sumOfDice == SEVEN) 
                gameStatus = Status.LOST; // player rolled 7 before matching point
        }

        // print game result
        if (gameStatus == Status.WON)
            System.out.println("Player wins");
        else
            System.out.println("Player loses");
    }

    // method to roll two dice, calculate and return their sum
    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6); // roll first die
        int die2 = 1 + randomNumbers.nextInt(6); // roll second die
        int sum = die1 + die2; // calculate sum

        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum); // show result

        return sum;
    }
}
