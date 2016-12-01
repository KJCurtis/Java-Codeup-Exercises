package CircleEx;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by KJCurtis on 11/30/16.
 *                  //uncommented here
public class Validator {
    public static double getDouoble(String prompt) {
        Scanner sc = new Scanner(System.in);
        double userDouble;

        System.out.println(prompt);
        try {
            userDouble = sc.nextDouble();
            sc.close();
            return userDouble;
        } catch (InputMismatchException e){
            sc.close();
            return getDouoble(prompt);
        }
    }
    public static String getString(String prompt) {
        Scanner sc = new Scanner(System.in);
        String userInput;
        System.out.println(prompt);

        try {
            userInput = sc.nextLine();
            sc.close();
            return userInput;
        } catch ( e) {

        }
    }
} */
