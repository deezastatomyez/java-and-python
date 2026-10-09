
public class TicTacToeModel {

    private char[][] board;
    private char currentPlayer;

    public TicTacToeModel() {
        board = new char[3][3];
        currentPlayer = 'X';
        initialiseBoard();
    }

    public void initialiseBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public boolean placeMarker(int row, int col) {
        if (board[row][col] == '-') {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public char[][] getBoard() {
        return board;
    }

    public boolean checkForWin() {
        return checkRows() || checkColumns() || checkDiagonals();
    }

    private boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' &&
                board[i][0] == board[i][1] &&
                board[i][1] == board[i][2]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != '-' &&
                board[0][i] == board[1][i] &&
                board[1][i] == board[2][i]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals() {
        return (board[0][0] != '-' &&
                board[0][0] == board[1][1] &&
                board[1][1] == board[2][2]) ||

               (board[0][2] != '-' &&
                board[0][2] == board[1][1] &&
                board[1][1] == board[2][0]);
    }
}