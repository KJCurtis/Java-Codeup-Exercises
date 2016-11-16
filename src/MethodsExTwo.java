/**
 * Created by KJCurtis on 11/14/16.
 */
import java.util.Scanner;
public class MethodsExTwo {
    public static void main(String[] args) {
        /*
        Prompt the user to enter an integer from 1 to 10.
        Display the factorial of the number entered by the user.
        Ask if the user wants to continue.
        Use a for loop to calculate the factorial.
        Assume that the user will enter an integer, but verify it’s between 1 and 10.
        Use the long type to store the factorial.
        Continue only if the user agrees to.
        A factorial is a number multiplied by each of the numbers before it.
        Factorials are denoted by the exclamation point (n!). Ex:

          1! = 1               = 1
          2! = 1 x 2           = 2
          3! = 1 x 2 x 3       = 6
          4! = 1 x 2 x 3 x 4   = 24
        Bonus

        Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number “from 1 to {the highest integer that returns accurate factorial calculation}”. Don’t forget to change your verification too!

        Use Recursion to implement the factorial.
        */
        int userInput;
        Scanner sc = new Scanner(System.in);
        System.out.println("This will find the factorial of an input integer");
        System.out.print("Enter an integer between 0 and 10");
        userInput = sc.nextInt();

    }

}
