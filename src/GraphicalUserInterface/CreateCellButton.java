
package GraphicalUserInterface;

import javafx.scene.control.Button;

public class CreateCellButton
{
	double buttonSize;
    
    public Button cellButton()
    {
        buttonSize = Window.zoomSlider.getValue();
        Button cell = new Button();
        cell.setMinSize(buttonSize, buttonSize);
        cell.setMaxSize(buttonSize, buttonSize);
        return cell;
    }
}
