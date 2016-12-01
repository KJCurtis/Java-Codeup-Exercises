/**
 * Created by KJCurtis on 12/1/16.
 */

package roshambo;
import java.util.ArrayList;
import java.util.Scanner;

public class RoshamboApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Roshambo!");
        Scanner sc = new Scanner(System.in);
        Player player = new Player(0);

        do {

            player.setName();
            System.out.println("player 1: " + player.playerName);
            System.out.print("Play again? (Y/N): ");
        } while ("Y".equalsIgnoreCase(sc.next()));
        sc.close();
    }
}
