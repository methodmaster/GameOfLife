package GraphicalUserInterface;

import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.input.KeyEvent;
import static javafx.scene.input.KeyCode.UP;
import static javafx.scene.input.KeyCode.DOWN;
import static javafx.scene.input.KeyCode.RIGHT;
import static javafx.scene.input.KeyCode.LEFT;

public class HandleKeyEvents implements EventHandler<KeyEvent>
{
    public void handle(KeyEvent keyEvent)
    {
        if((keyEvent.getSource().equals(Window.zoomSlider)) &&
                (keyEvent.getCode().equals(UP)))
        {
            HandleMouseEvents.cellButtonSize = Window.zoomSlider.getValue();
            Window.reDrawGrid();
            System.out.println("ZOOM IN (UP) arrow key pressed.");
        }

        if ((keyEvent.getSource().equals(Window.zoomSlider)) &&
                keyEvent.getCode().equals(DOWN))
        {
            HandleMouseEvents.cellButtonSize = Window.zoomSlider.getValue();
            Window.reDrawGrid();
            System.out.println("ZOOM OUT (DOWN) arrow key pressed.");
        }

        if((keyEvent.getSource().equals(Window.timerSpeedSlider)) &&
                (keyEvent.getCode().equals(RIGHT)))
        {
            // Timer speeds up
            System.out.println("TIMER SPEED INCREASED (RIGHT) arrow key pressed.");
        }

        if ((keyEvent.getSource().equals(Window.timerSpeedSlider)) &&
                (keyEvent.getCode().equals(LEFT)))
        {
            // Timer speeds down
            System.out.println("TIMER SPEED DECREASED (LEFT) arrow key pressed.");
        }
    }
}
