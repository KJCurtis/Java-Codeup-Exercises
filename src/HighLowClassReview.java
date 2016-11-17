/**
 * Created by KJCurtis on 11/16/16.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class HighLowClassReview {
    public static void main(String[] args) {
        int random;
        int userGuess;

        random = getRandomNumber();
        userGuess = getUserGuess();
        if (random == userGuess) {
            System.out.println("Good Guess!");
        } else if (random > userGuess) {
            System.out.println("HIGHER");
        } else {
            System.out.println("LOWER");
        }
    }
    public static int getRandomNumber() {
        return (int) Math.ceil(Math.random() * 100);
    }
    public static int getUserGuess() {
        int userInput;
       Scanner sc = new Scanner(System.in);
        System.out.print("PLease guess a number between 1 and 100: ");

        try {
            userInput = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Guess must be an inteer");
            return getUserGuess();
        }

        return userInput;
    }
}
