/**
 * Created by KJCurtis on 11/11/16.
 * First HelloWorld for JAVA
 */
import java.util.Scanner;
public class HelloWorld {  //psvm + enter will autotype:
    public static void main(String[] args) {
        //you have to declare the data type when you declare a variable in JAVA
        int dayNumber = 5; // declaring an integer
        long myAge = 21; // long is for bigger values


        float price;


        price = (float) 2.3; // price = (<type>) 2.3;  //type casting

        double anotherPrice = 6.5; //a decimal is read by default as a double you will have to declare it as a float first


        char vowel;
        vowel = 'e';  //single quotes are reserved for single characters that is why you cannot use double quotes for strings

        boolean isFriday = true; //declaring a boolean


        System.out.printf("Hello World!"); // JS: window.console.log('Hello World!');
        // type: sout to autotype System.out.printf("");
        System.out.printf("\nHello %s, today is %s, amd it's the %dth day of the week ",
                "Codeup",
                "Friday",
                5
        );

        int result = multiply(2, 3);
        System.out.println("2 multiplied by 3 is " + result);
        int printConsole = 87;
        System.out.println(printConsole);



        String userInput;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        userInput = sc.nextLine();
        System.out.println("You Entered: " + userInput);

    }
    public static int multiply(int a, int b) {
        return a * b;
    }



}
