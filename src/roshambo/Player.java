package roshambo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by KJCurtis on 12/1/16.
 */
public class Player {
    String playerName;
    int score = 0;

    public Player(int score) {
        this.score = score;
    }
    public void setName() {
        Scanner scan = new Scanner(System.in);
        String inputName;
        try {
            System.out.print("input name of Player 1: ");
            inputName = scan.nextLine().trim();
            this.playerName = inputName;
        } catch (InputMismatchException e) {
            System.out.println("name can only consist of letters!");
            setName();
        }


    }
}
