
package GraphicalUserInterface;

import javafx.scene.control.ScrollPane;

public class CreateScrollPane
{
    public static ScrollPane ScrollPane()
    {
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setPannable(true);
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);
        scrollPane.setId("ScrollPane");

        return scrollPane;
    }
}
