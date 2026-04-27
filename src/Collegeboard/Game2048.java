package Collegeboard;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author robert.gillette
 */

public class Game2048 {
    private int[][] gameBoard;
    private int score;
    private int boardSize;

    public Game2048() {
        boardSize = 4;
        gameBoard = new int[boardSize][boardSize];
        score = 0;
        for (int i = 0; i < 6; i++) {
            add2ToBoard();
        }
//        add2ToBoard();
//        add2ToBoard();
    }
    public void add2ToBoard() {
        int i = -1, j = -1;
        do {
            i = (int)(Math.random() * 4);
            j = (int)(Math.random() * 4);
        } while (gameBoard[i][j] != 0);
        gameBoard[i][j] = 2;
    }
    public void moveLeft() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int k = 0; k < gameBoard[0].length; k++) {
                for (int j = 0; j < gameBoard[0].length - 1; j++) {
                    if (gameBoard[i][j] == 0){
                        gameBoard[i][j] = gameBoard[i][j+1];
                        gameBoard[i][j+1] = 0;
                    }
                }
            }
        }
    }
    public void moveRight() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int k = 0; k < gameBoard[0].length; k++) {
                for (int j = gameBoard[0].length - 1; j > 0; j--) {
                    if (gameBoard[i][j] == 0) {
                        gameBoard[i][j] = gameBoard[i][j-1];
                        gameBoard[i][j-1] = 0;
                    }
                }
            }
        }
    }
    public void moveUp() {
        for (int j = 0; j < gameBoard[0].length; j++) {
            for (int k = 0; k < gameBoard.length; k++) {
                for (int i = gameBoard.length - 2; i >= 0; i--) {
                    if (gameBoard[i][j] == 0) {
                        gameBoard[i][j] = gameBoard[i+1][j];
                        gameBoard[i+1][j] = 0;
                    }
                }
            }
        }
    }
    public void moveDown() {
        for (int j = 0; j < gameBoard[0].length; j++) {
            for (int k = 0; k < gameBoard.length; k++) {
                for (int i = 1; i < gameBoard.length; i++) {
                    if (gameBoard[i][j] == 0) {
                        gameBoard[i][j] = gameBoard[i-1][j];
                        gameBoard[i-1][j] = 0;
                    }
                }
            }
        }
    }

    public void mergeLeft() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length-1; j++) {
                if (gameBoard[i][j] == gameBoard[i][j+1]) {
                    gameBoard[i][j] += gameBoard[i][j+1];
                    gameBoard[i][j+1] = 0;
                    score += gameBoard[i][j];
                }
            }
        }
    }
    public void mergeRight() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = gameBoard.length - 1; j > 0; j--) {
                if (gameBoard[i][j] == gameBoard[i][j-1]) {
                    gameBoard[i][j] += gameBoard[i][j-1];
                    gameBoard[i][j-1] = 0;
                    score += gameBoard[i][j];
                }
            }
        }
    }
    public void mergeUp() {
        for (int j = 0; j < gameBoard[0].length; j++) {
            for (int i = 0; i < gameBoard.length-1; i++) {
                if (gameBoard[i][j] == gameBoard[i+1][j]) {
                    gameBoard[i][j] += gameBoard[i+1][j];
                    gameBoard[i+1][j] = 0;
                    score += gameBoard[i][j];
                }
            }
        }
    }
    public void mergeDown() {
        for (int j = 0; j < gameBoard[0].length; j++) {
            for (int i = gameBoard.length-1; i > 0; i--) {
                if (gameBoard[i][j] == gameBoard[i-1][j]) {
                    gameBoard[i][j] += gameBoard[i-1][j];
                    gameBoard[i-1][j] = 0;
                    score += gameBoard[i][j];
                }
            }
        }
    }

    public boolean gameOver() {
        int z = 0;
        for (int[] a : gameBoard) {
            for (int n : a) {
                if (n == 2048) {
                    return true;
                } else if (n == 0) {
                    z++;
                }
            }
        }
        if (z == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void checkHighScore() throws IOException {
        int[] highScores = new int[10];
        File hsFile = new File("C:\\Users\\robert.gillette\\IdeaProjects\\AP-Comp-Sci-A-HW\\src\\Collegeboard\\highscore.txt");
        Scanner fileReader = new Scanner(hsFile);
        int i = 0;
        while (fileReader.hasNextInt() && i < 10) {

        }
    }

    public void displayBoard() {
        System.out.println("Score: "+score);
        System.out.println();
        for (int row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard[0].length; col++) {
                if (gameBoard[row][col] == 0)
                {
                    System.out.print("-\t\t");
                }
                else if (gameBoard[row][col] < 100)
                {
                    System.out.print(gameBoard[row][col] + "\t\t");
                }
                else
                {
                    System.out.print(gameBoard[row][col] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
