package circumference;
import java.util.Scanner;
/**
 * Created by KJCurtis on 11/30/16.
 */
public class CircumferenceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome. we are going to be find the circumference of multiple circles based of a radius input by the user.");

        do {








            System.out.println("would you like to find the circumference of another circle? (Y/N): ");
        } while ("y".equalsIgnoreCase(scanner.next()));
    }
}
