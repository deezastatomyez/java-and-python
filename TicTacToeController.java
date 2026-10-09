import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class TicTacToeController {

    private TicTacToeModel model;
    private TicTacToeView view;

    public TicTacToeController(TicTacToeModel model, TicTacToeView view) {
        this.model = model;
        this.view = view;

        initController();
    }

    private void initController() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                int row = i;
                int col = j;

                view.buttons[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        if (view.buttons[row][col].getText().equals("-")) {

                            view.buttons[row][col].setText(
                                    String.valueOf(model.getCurrentPlayer())
                            );

                            model.placeMarker(row, col);

                            if (model.checkForWin()) {
                                System.out.println("Player " +
                                        model.getCurrentPlayer() + " wins!");
                                disableButtons();
                                return;
                            }

                            model.switchPlayer();
                        }
                    }
                });
            }
        }
    }

    private void disableButtons() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                view.buttons[i][j].setEnabled(false);
            }
        }
    }
}
