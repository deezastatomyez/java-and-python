import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TicTacToeModelTest {

    @Test
    public void testRowWin() {
        TicTacToeModel model = new TicTacToeModel();

        model.placeMarker(0, 0);
        model.placeMarker(1, 0);

        model.placeMarker(0, 1);
        model.placeMarker(1, 1);

        model.placeMarker(0, 2);

        assertTrue(model.checkForWin());
    }
}