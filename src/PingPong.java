/**
 * Created by KJCurtis on 11/18/16.
 *
 * instructor example from luis
 */

import java.util.Scanner;
public class PingPong {
    public static void main(String[] args) {
        //two players
        //ask player for name
        System.out.println("Welcome to ping pong");
        System.out.println("Two players CPU vs USER");
        System.out.println("Two sides to swing on per player side. Left or Right");
        System.out.println("First player will be chosen at random");
        System.out.println("CPU will randomly hit the ball to a side");
        System.out.println("You have to guess which side");
        System.out.println("First player to score 7 wins!");
        toStartGame();
    }
    public static String toStartGame() {
        Scanner scan = new Scanner(System.in);
        char toStart;
        do {
            try {
                System.out.print("Start Game? (Y/N): ");
                toStart = scan.next().trim().toLowerCase().charAt(0);
                if (toStart == 'y' || toStart == 'n') {
                    break;
                } else {
                    throw new IllegalArgumentException("entry must either be \"Y\" or \"N\"!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        if (toStart == 'n') {
            System.exit(0);
        }
        return startGame(findRandom()); //test
    }
    public static String startGame(int playerTurn) {
        if (playerTurn == 1) {
            return playerServe();
        } else {
            System.out.println("it is the CPU's Serve!");
            return playerHit(computerServe());
        }
    }

    public static int findRandom() {
        return (int) Math.floor(Math.random() * 2);
    }
    public static String playerServe() {
        Scanner scan = new Scanner(System.in);
        String playerServe;
        do {
            System.out.print("Your Serve. Choose a side to serve to (Left/Right): ");
            playerServe = scan.next().toLowerCase();
            System.out.println(playerServe);
            if (playerServe.compareTo("right") == 0 || playerServe.compareTo("left") == 0) {
                break;
            } else {
                System.out.println("Your entry must either be \"Left\" or \"Right\"!");
            }
        } while (true);
        return cpuHit(playerServe);
    }
    public static String playerHit(String cpuHit) {
        Scanner scan = new Scanner(System.in);
        String playerSwing;
        do {
            try {
                System.out.print("Your Swing! Choose a side to swing! (Left/Right): ");
                playerSwing = scan.next().trim().toLowerCase();
                if (playerSwing.compareTo("left") == 0 || playerSwing.compareTo("right") == 0) {
                    break;
                } else {
                    throw new IllegalArgumentException("Your entry muse either be \"Left\" or \"Right\"!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e .getMessage());
            }
        } while (true);
        if (playerSwing.compareTo(cpuHit) ==0) {
            System.out.println("The ball came down the " + cpuHit + " side!");
            System.out.println("Your swung to the " + playerSwing);
            System.out.println("Good Hit!");
            return cpuHit(computerServe());
        } else {
            System.out.println("the ball came from the the " + cpuHit);
            System.out.println("but you swung to the " + playerSwing + "!");
            System.out.println("Missed!");
            System.out.println("CPU served!");
            return playerHit(computerServe());
        }



    }
    public static String computerServe() {
        int ran = findRandom();
        if (ran == 0) {
            return "left";
        } else {
            return "right";
        }
    }
    public static String cpuHit(String playerHit) {
        String cpuSwing = computerServe();
        System.out.println("the ball went to the " + playerHit + " side!");
        System.out.println("the CPU swung to the " + cpuSwing);
        if (cpuSwing.compareTo(playerHit) != 0) {
            System.out.println("CPU Missed!");
            playerServe();
        }
        System.out.println("CPU hit it back!");
        return playerHit(computerServe());

    }


}
