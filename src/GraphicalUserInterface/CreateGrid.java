package GraphicalUserInterface;

import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;


public class CreateGrid
{
    public static GridPane Grid()
    {
        GridPane grid = new GridPane();
        grid.setHgap(1.0);
        grid.setVgap(2.0);
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setId("GridPane");

        return grid;
    }
}
