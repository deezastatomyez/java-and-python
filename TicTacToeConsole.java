
import java.util.Scanner;

public class TicTacToeConsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToeModel model = new TicTacToeModel();

        while (true) {
            displayBoard(model.getBoard());

            System.out.println("Player " + model.getCurrentPlayer() + "'s turn");

            System.out.print("Row: ");
            int row = scanner.nextInt();

            System.out.print("Col: ");
            int col = scanner.nextInt();

            if (!model.placeMarker(row, col)) {
                System.out.println("Invalid move, try again.");
                continue;
            }

            if (model.checkForWin()) {
                displayBoard(model.getBoard());
                System.out.println("Player " + model.getCurrentPlayer() + " wins!");
                break;
            }

            model.switchPlayer();
        }

        scanner.close();
    }

    public static void displayBoard(char[][] board) {
        System.out.println("Board:");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + board[i][j] + "] ");
            }
            System.out.println();
        }
    }
}