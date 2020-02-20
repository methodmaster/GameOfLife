package GraphicalUserInterface;

import javafx.geometry.Orientation;
import javafx.scene.control.Slider;

public class CreateSlider
{
    public static Slider zoomSlider()
    {
    	Slider slider = new Slider();
        slider.setMin(0.5);
        slider.setMax(20.0);
        slider.setValue(10);
        slider.setMajorTickUnit(10);
        slider.setMinorTickCount(2);
        slider.setBlockIncrement(2);
        slider.setOrientation(Orientation.VERTICAL);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);

        HandleMouseEvents handleMouseEvents = new HandleMouseEvents();
        slider.setOnMouseClicked(handleMouseEvents);
        slider.setOnMousePressed(handleMouseEvents);
        slider.setOnDragDetected(handleMouseEvents);
        slider.setOnMouseDragEntered(handleMouseEvents);
        slider.setOnMouseDragged(handleMouseEvents);
        slider.setOnMouseDragOver(handleMouseEvents);

        HandleKeyEvents handleKeyEvents = new HandleKeyEvents();
        slider.setOnKeyPressed(handleKeyEvents);

        slider.setCache(true);
        slider.setFocusTraversable(true);
        slider.setId("ZoomSlider");

        return slider;
    }
    
    public static Slider timerSpeedSlider()
    {
    	Slider slider = new Slider();
        slider.setMin(0);
        slider.setMax(5000);
        slider.setValue(2500);
        slider.setMajorTickUnit(2500);
        slider.setMinorTickCount(250);
        slider.setBlockIncrement(500);
        slider.setOrientation(Orientation.HORIZONTAL);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);

        HandleMouseEvents handleMouseEvents = new HandleMouseEvents();
        slider.setOnMouseClicked(handleMouseEvents);
        slider.setOnMousePressed(handleMouseEvents);
        slider.setOnDragDetected(handleMouseEvents);
        slider.setOnMouseDragEntered(handleMouseEvents);
        slider.setOnMouseDragged(handleMouseEvents);
        slider.setOnMouseDragOver(handleMouseEvents);

        HandleKeyEvents handleKeyEvents = new HandleKeyEvents();
        slider.setOnKeyPressed(handleKeyEvents);

        slider.setCache(true);
        slider.setFocusTraversable(true);
        slider.setId("TimerSpeedSlider");

        return slider;
    }
}
