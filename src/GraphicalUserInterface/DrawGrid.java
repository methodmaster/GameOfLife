
package GraphicalUserInterface;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class DrawGrid
{
    private static int grid_Array[][];
    public static GridPane Draw()
    {
        GridPane gridPane = CreateGrid.Grid();
        Button cell;
        for (int row = 0; row < grid_Array.length; ++row)
        {
            for (int column = 0; column < grid_Array[row].length;  ++column)
            {
                if (grid_Array[row][column] == 1)
                {
                	CreateCellButton cellDead = new CreateCellButton();
                    cell = cellDead.cellButton();
                    cell.setId("DeadCellButton");
                    gridPane.add(cell, column, row);
                }
                else
                {
                	CreateCellButton cellAlive = new CreateCellButton();
                    cell = cellAlive.cellButton();
                    cell.setId("AliveCellButton");
                    gridPane.add(cell, column, row);
                }
            }
        }
        return gridPane;
    }

    public static void DrawThisArray( int gridArray[][])
    {
        grid_Array = gridArray;
    }
}
