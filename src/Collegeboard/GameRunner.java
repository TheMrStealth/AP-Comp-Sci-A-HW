package Collegeboard;

import java.util.Scanner;

/**
 *
 * @author robert.gillette
 */

public class GameRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Game2048 game = new Game2048();
        game.displayBoard();
        game.moveRight();
        game.displayBoard();
    }
}
