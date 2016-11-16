/**
 * Created by KJCurtis on 11/16/16.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExeptErrorHandlingExerciseThree {
    public static void main(String[] args) {
        mainGame();
    }
    public static int mainGame() {
        int ranInt = (int) Math.floor(Math.random() * 100);
        return isRanFound(ranInt);
    }
    public static int getInput(Scanner input) {
        try {
            System.out.print("Try and guess an integer between 0 and 100: ");
            int userInput = input.nextInt();
            if (userInput < 0 || userInput > 100) {
                throw new IllegalArgumentException("Your guess must be between 0 and 100");
            }
            return userInput;
        } catch (InputMismatchException e) {
            input.next();
            System.out.println("Your Guess must be a whole number between 0 and 100");
            return getInput(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getInput(input);
        }
    }
    public static int isRanFound(int ranInt) {
        Scanner input = new Scanner(System.in);
        int userInput = getInput(input);
            if (userInput == ranInt) {
                System.out.println("congratulations you guessed the random number!");
                return toPlayAgain(input);
            } else if (userInput < ranInt) {
                System.out.println("Your Guess was Low");
                return isRanFound(ranInt);
            } else if (userInput > ranInt) {
                System.out.println("Your Guess was High");
                return isRanFound(ranInt);
            }
        return isRanFound(ranInt);
    }

    public static int toPlayAgain(Scanner input) {
        try {
            System.out.print("would you like to play again? (Y/N): ");
            char playAgain = input.next().trim().toLowerCase().charAt(0);
            if (playAgain == 'y') {
                return mainGame();
            } else if (playAgain == 'n') {
                System.out.println("have a good day!");
                input.close();
                System.exit(0);
            } else {
                System.out.println(playAgain);
                throw new InputMismatchException("Input must either be 'y' or 'n'");
            }

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            return toPlayAgain(input);
        }
        return mainGame();
    }



}
