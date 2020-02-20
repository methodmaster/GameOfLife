package GraphicalUserInterface;

import javafx.event.EventHandler;
import javafx.stage.WindowEvent;

public class HandleWindowsEvents implements EventHandler<WindowEvent> 
{
	public void handle(WindowEvent event) 
	{
		if(event.equals(event.WINDOW_CLOSE_REQUEST) == true)
		{
			ControlTimer.timer.stop();
		}
	}
}
