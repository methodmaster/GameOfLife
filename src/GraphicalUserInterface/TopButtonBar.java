
package GraphicalUserInterface;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class TopButtonBar
{
	static Button startButtonLocal;
	static Button pauseButton;
	static Button resetButton;
	
	static Label rowLabel;
	static Label columnLabel;
	
	static TextField rowTextField;
	static TextField columnTextField;
	
    public static HBox Buttons()
    {
    	HBox topButtonBar = new HBox();

        Slider timerSpeedSlider = CreateSlider.timerSpeedSlider();

        StartButton startButton = new StartButton();
        startButtonLocal = startButton.startButton();

        Buttons buttons = new Buttons();
        
        pauseButton = buttons.pauseButton();
        pauseButton.setDisable(true);
        
        resetButton = buttons.resetButton();
        resetButton.setDisable(true);
        
        TextFields textFields = new TextFields();
        rowTextField = textFields.rowTextField();
        columnTextField = textFields.columnTextField();
        
        rowLabel = textFields.rowLabel();
        columnLabel = textFields.columnLabel();
        
        topButtonBar.getChildren().add(startButtonLocal);
        topButtonBar.getChildren().add(pauseButton);
        topButtonBar.getChildren().add(resetButton);
        
        topButtonBar.getChildren().add(rowLabel);
        topButtonBar.getChildren().add(rowTextField);
        
        topButtonBar.getChildren().add(columnLabel);
        topButtonBar.getChildren().add(columnTextField);
        
        topButtonBar.getChildren().add(timerSpeedSlider);

        topButtonBar.setSpacing(10);
        topButtonBar.setHgrow(timerSpeedSlider, Priority.ALWAYS);
        topButtonBar.setAlignment(Pos.TOP_LEFT);
        topButtonBar.setId("TopBarButtons");

        return topButtonBar;
    }
}
