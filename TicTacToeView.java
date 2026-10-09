import javax.swing.*;
import java.awt.*;

public class TicTacToeView {

    JFrame frame;
    public JButton[][] buttons = new JButton[3][3];;

    public TicTacToeView() {

        frame = new JFrame("Tic Tac Toe");
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(3, 3));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("-");
                frame.add(buttons[i][j]);
            }
        }

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TicTacToeView();
    }
}
