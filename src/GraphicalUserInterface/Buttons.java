
package GraphicalUserInterface;

import javafx.scene.control.Button;

public class Buttons
{
    /*public Button startButton ()
    {
        Button start = new Button("Start");
        HandleButtonsEvents handleButtonsEvents = new HandleButtonsEvents();
        start.setOnAction(handleButtonsEvents);
        
        return start;
    }*/

    public Button pauseButton ()
    {
        Button pause = new Button("Pause");
        HandleButtonsEvents handleButtonsEvents = new HandleButtonsEvents();
        pause.setOnAction(handleButtonsEvents);
        
        return pause;
    }

    public Button resetButton ()
    {
        Button stop = new Button("Reset");
        HandleButtonsEvents handleButtonsEvents = new HandleButtonsEvents();
        stop.setOnAction(handleButtonsEvents);
        
        return stop;
    }
}
