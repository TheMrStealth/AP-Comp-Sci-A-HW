package Collegeboard;

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
            i = (int)(Math.random() * 3);
            j = (int)(Math.random() * 3);
        } while (gameBoard[i][j] != 0);
        gameBoard[i][j] = 2;
    }
    public void moveLeft() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length - 1; j++) {
                if (gameBoard[i][j] == 0){
                    gameBoard[i][j] = gameBoard[i][j+1];
                    gameBoard[i][j+1] = 0;
                }
            }
        }
    }
    public void moveRight() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = gameBoard[0].length - 1; j > 0; j--) {
                System.out.println(i+":"+j);
                if (gameBoard[i][j] == 0) {
                    gameBoard[i][j] = gameBoard[i][j-1];
                    gameBoard[i][j-1] = 0;
                }
            }
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
