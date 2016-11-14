import java.util.Scanner;

/**
 * Created by KJCurtis on 11/11/16.
 */
public class javaExercise {
    public static void main(String[] args) {
        int width;
        int length;
        String userInput = "n";

        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Welcome tot he room calculator");
            System.out.print("Enter width: ");
            width = sc.nextInt();
            System.out.print("Enter width: ");
            length = sc.nextInt();

            System.out.println("The room has a perimeter of: " + perimeter(width, length));
            System.out.print("The area of the Room is: " + area(width, length));
            System.out.print("do you want to calculate another room?");
            userInput = sc.next();
        } while(userInput.equals("y"));

    }
    public static int perimeter(int width, int length) {
        return 2 * width + length * 2;
    }
    public static int area(int width, int length) {
        return width * length;
    }
}
