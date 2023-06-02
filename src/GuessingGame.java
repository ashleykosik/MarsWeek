import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

//The computer will choose a random number between 1–100 and ask the user to guess the number
//
//Once the user guesses, the computer will tell the user if their guess was too high or too low
//
//The game is over once the user guesses the computer’s number. When the game is over, the computer prints the total number of guesses the user made before getting the right answer.

public class GuessingGame {
    public GuessingGame() throws InterruptedException {
        //greet player
        System.out.println("Hello there! What is your name?");
        // get player name
        System.out.println("(type in your name)");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println(name + " I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what the number is?");

        Random rand = new Random();
        int number = rand.nextInt(100);
        int tries = 0;

        while (true) {

            int guess;
            try {
                guess = input.nextInt();
            } catch (InputMismatchException e) {
                String bad_input = input.next(); // need to skip bad input
                System.out.println("That's not an integer, try again");
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println(guess + " is not a valid number, try again");
                continue;
            }

            tries = tries + 1;

            if (guess < number) {
                System.out.println("Your guess is too low, try again.");
            } else if (guess > number) {
                System.out.println("Your guess is too high, try again.");
            } else {
                System.out.println("Well done " + name);
                System.out.println("You found my number in " + tries + " tries!");
                break;
            }
        }


    }
}