/**
 * Created by KJCurtis on 11/14/16.
 */
import java.util.Scanner;

public class MethodsExOne {
    public static void main(String[] args) {
        /*
        Basic Arithmetic

Create four separate methods. Each will perform an arithmetic operation:

Addition
Substraction
Multiplication
Division
Each function needs to take two parameters/arguments so that the operation can be performed.

Test your functions and verify the output.

Add a modulus function that finds the modulus of two numbers.

Food for thought: What happens if we try to divide by zero? What should happen?


         */
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first value: ");
        a = sc.nextInt();
        System.out.print("enter the second value:  ");
        b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + toAddInput(a, b));
        System.out.println(a + " - " + b + " = " + toSubInput(a, b));
        System.out.println(a + " * " + b + " = " + toMultInput(a, b));
        System.out.println(a + " / " + b + " = " + toDivInput(a, b));


    }

    public static int toAddInput(int a, int b) {
        return a + b;
    }
    public static int toSubInput(int a, int b) {
        return a - b;
    }
    public static int toMultInput(int a, int b) {
        return a * b;
    }
    public static int toDivInput(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }
}
