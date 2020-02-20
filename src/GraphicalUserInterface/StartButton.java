package GraphicalUserInterface;

import javafx.scene.control.Button;

public class StartButton 
{
	public Button startButton()
	{
		Button start = new Button("Start");
	    HandleButtonsEvents handleButtonsEvents = new HandleButtonsEvents();
	    start.setOnAction(handleButtonsEvents);
	    
	    return start;
	}
}
