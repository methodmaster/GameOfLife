
package GraphicalUserInterface;

import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;

public class HandleMouseEvents implements EventHandler<MouseEvent>
{
    public static double cellButtonSize = 0.5;
    public void handle(MouseEvent mouseEvent)
    {
    	if(mouseEvent.getSource().equals(Window.zoomSlider))
    	{
    		Window.scrollPane.setContent(DrawGrid.Draw());
    	}
    	
    	if(mouseEvent.getSource().equals(Window.timerSpeedSlider) == true)
    	{
    		ControlTimer controlTimer =new ControlTimer();
    		controlTimer.stopTimer();
    		
    		int timerSpeed = (int) Window.timerSpeedSlider.getValue();
    		controlTimer.setTimerSpeed(timerSpeed);
    		
    		controlTimer.startTimer();
    		System.out.println("Current Timer Speed: " + timerSpeed);
    	}

		/*========================================================================================*/

		TextFields textFields = new TextFields();

		if(mouseEvent.getSource().equals(TopButtonBar.rowTextField) &&
				textFields.isRowInputCorrect() == true)
		{
			System.out.println("Row Text Field Event Is triggered");

			TopButtonBar.rowTextField.setText(null);
			System.out.println("Text: " + TopButtonBar.rowTextField.getText());

			Alert errorAlert = new Alert(Alert.AlertType.ERROR);
			errorAlert.setHeaderText(null);
			errorAlert.setContentText("The size is too BIG. Use number < 1000");
			errorAlert.showAndWait();
		}

		if(mouseEvent.getSource().equals(TopButtonBar.columnTextField) &&
				textFields.isColumnInputCorrect() == true)
		{
			System.out.println("Row Text Field Event Is triggered");

			TopButtonBar.columnTextField.setText(null);
			System.out.println("Text: " + TopButtonBar.columnTextField.getText());

			Alert errorAlert = new Alert(Alert.AlertType.ERROR);
			errorAlert.setHeaderText(null);
			errorAlert.setContentText("The size is too BIG. Use number < 1000");
			errorAlert.showAndWait();
		}
    }
}
