import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X'; // Player X always goes first

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        // Main game loop
        while (playAgain) {
            initializeBoard();
            boolean gameWon = false;
            int totalMoves = 0;

            while (!gameWon && totalMoves < 9) {
                printBoard();
                playerMove(scanner);
                gameWon = checkWin();
                if (!gameWon) {
                    switchPlayer();
                    totalMoves++;
                }
            }

            printBoard();
            if (gameWon) {
                System.out.println("Player " + currentPlayer + " wins!");
            } else {
                System.out.println("It's a draw!");
            }

            // Ask if players want to play again
            System.out.println("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
    }

    // Initialize the 3x3 board with empty spaces
    private static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    // Print the current state of the board
    private static void printBoard() {
        System.out.println("Current board:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Handle player moves
    private static void playerMove(Scanner scanner) {
        int row, col;
        boolean validMove = false;

        while (!validMove) {
            System.out.println("Player " + currentPlayer + ", enter your move (row and column from 1 to 3): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                board[row][col] = currentPlayer;
                validMove = true;
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
    }

    // Switch the current player between 'X' and 'O'
    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Check if there is a win
    private static boolean checkWin() {
        return checkRows() || checkColumns() || checkDiagonals();
    }

    // Check rows for a win
    private static boolean checkRows() {
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    // Check columns for a win
    private static boolean checkColumns() {
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    // Check diagonals for a win
    private static boolean checkDiagonals() {
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }
}