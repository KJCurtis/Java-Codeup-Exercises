/**
 * Created by KJCurtis on 11/17/16.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("welcome to FizzBuzz");
        System.out.println("prints Fizz for every multiple of 3 and Buzz for every multiple of 5");
        System.out.println("Prints FizzBuzz for multiple of both 3 and 5");
        System.out.println("Start Count:");
        startCounter();
    }

    public static void startCounter() {
        int counter = 0;
        while (counter <= 100) {
            if (counter % 3 == 0 && counter % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (counter % 3 == 0) {
                System.out.println("Fizz");
            } else if (counter % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(counter);
            }
            counter++;
        }
    }
}

