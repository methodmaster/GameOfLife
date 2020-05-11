package GraphicalUserInterface;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandleButtonsEvents implements EventHandler<ActionEvent> 
{	

	public void handle(ActionEvent event) 
	{
		ControlTimer controlTimer = new ControlTimer();;
		
		if (event.getSource().equals(TopButtonBar.startButtonLocal) == true)
        {
            System.out.println("Start pressed.");
            controlTimer.setTimerSpeed(100);
            controlTimer.startTimer();
            Window.reDrawGrid();
            
            TopButtonBar.startButtonLocal.setDisable(true);
            TopButtonBar.pauseButton.setDisable(false);
            TopButtonBar.resetButton.setDisable(false);

        } else if(event.getSource() == TopButtonBar.pauseButton) 
        {
            System.out.println("Pause pressed.");
            controlTimer.stopTimer();
            
            TopButtonBar.startButtonLocal.setDisable(false);
            TopButtonBar.pauseButton.setDisable(true);
            TopButtonBar.resetButton.setDisable(false);

        } else if(event.getSource() == TopButtonBar.resetButton) 
        {
            System.out.println("Stop pressed.");
            controlTimer.stopTimer();
            
            TopButtonBar.startButtonLocal.setDisable(false);
            TopButtonBar.pauseButton.setDisable(true);
            TopButtonBar.resetButton.setDisable(true);
        }
	}
}
