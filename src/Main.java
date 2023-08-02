import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Game game = new Game();


        System.out.println("+++++++++++++++++++++++++");
        System.out.println("ROCK PAPER SCISSORS GAME");
        System.out.println("+++++++++++++++++++++++++");

        String playerMove = getPlayerMove();
        String computerMove = getComputerMove();

        if (playerMove.equals(computerMove)){
            System.out.println("It's a tie!");
        }
        else if (playerMove.equals(Game.rock)) {
            System.out.println(computerMove.equals(Game.paper) ? "Computer wins!" : "Player wins!");
        }
        else if (playerMove.equals(Game.paper)) {
            System.out.println(computerMove.equals(Game.scissors) ? "Computer wins!" : "Player wins!");
        }
        else if (playerMove.equals(Game.scissors)) {
            System.out.println(computerMove.equals(Game.rock) ? "Computer wins!" : "Player wins!");
        }
    }

    public static String getPlayerMove() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nChoose your option (ROCK / PAPER/ SCISSORS): ");
        String playerMove = scan.next().toUpperCase();
        System.out.println("Player's move: " + playerMove);
        return playerMove;
    }
    public static String getComputerMove() {
        Random random = new Random();
        Game game = new Game();
        int choice = random.nextInt(3)+1;
        String computerMove;
        if( choice == 1 ) {
            computerMove = Game.rock;
        }
        else if ( choice == 2 ) {
            computerMove = Game.paper;
        }
        else {
            computerMove = Game.scissors;
        }
        System.out.println("Computer's move: " + computerMove);
        return computerMove;
    }
}
