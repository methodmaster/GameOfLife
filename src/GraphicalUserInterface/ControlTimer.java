package GraphicalUserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javafx.application.Platform;


public class ControlTimer implements ActionListener
{
	static Timer timer;
	private static int timerSpeed = 200;
	
	
    	
    public void startTimer()
    {
    	System.out.println("Timer is started.");
    	timer = new Timer(timerSpeed, this);
    	timer.setActionCommand("Timer");
    	timer.setInitialDelay(0);
    	timer.setRepeats(true);
    	timer.start();
    }
    
    public void stopTimer()
    {
    	System.out.println("Timer is stoped.");	
    	
    	timer.stop();
    }
    
    public void setTimerSpeed(int timerSpeed)
    {
    	timerSpeed = 1000;
    	timerSpeed = ControlTimer.timerSpeed;
    }
    
	public void actionPerformed(ActionEvent action) 
	{
		if (action.getActionCommand() == "Timer")
		{
			System.out.println("Timer running..." + timer.getDelay());
			render ();
		}
	}
	
	public void render ()
	{
		/* This is the code that renders the cells;
		 * Every time the timer is created.
		 */
    	Platform.runLater(new Runnable() 
    	{
            public void run() 
            {
              ApplyRules applyRules = new ApplyRules();
              Window.gridArray = applyRules.Rules(Window.gridArray);
              DrawGrid.DrawThisArray(Window.gridArray);
              Window.scrollPane.setContent(DrawGrid.Draw());
            }
       });
	}
}
