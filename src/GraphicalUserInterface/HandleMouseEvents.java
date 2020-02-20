
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
				TopButtonBar.rowTextField.getText().isEmpty() == false &&
				textFields.isRowInputCorrect() == false)
		{
			System.out.println("Row Text Field Event Is triggered");

			TopButtonBar.rowTextField.setText("");
			System.out.println("Text: " + TopButtonBar.rowTextField.getText());

			Alert errorAlert = new Alert(Alert.AlertType.ERROR);
			errorAlert.setHeaderText(null);
			errorAlert.setContentText("The size is too BIG. Use number > 8 and < 1000");
			errorAlert.showAndWait();
		}

		if(mouseEvent.getSource().equals(TopButtonBar.columnTextField) && // Select the correct Textfield
				TopButtonBar.columnTextField.getText().isEmpty() == false && // Make sure it is not empty
				textFields.isColumnInputCorrect() == false) // Validate the input, if it returns false then clear Textfield
		{
			System.out.println("Column Text Field Event Is triggered");

			TopButtonBar.columnTextField.setText("");

			Alert errorAlert = new Alert(Alert.AlertType.ERROR);
			errorAlert.setHeaderText(null);
			errorAlert.setContentText("The size is too BIG. Use number > 8 and < 1000");
			errorAlert.showAndWait();
		}
    }
}
