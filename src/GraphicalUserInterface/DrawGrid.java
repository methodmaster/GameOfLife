
package GraphicalUserInterface;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class DrawGrid
{
    public GridPane fillGridPaneWithCellsForThisArray(int gridArray[][])
    {
        GridPane gridPane = CreateGrid.Grid();
        for (int row = 0; row < gridArray.length; ++row)
        {
            for (int column = 0; column < gridArray[row].length;  ++column)
            {
                CreateCellButton cellDead = new CreateCellButton();
                Button cell = cellDead.cellButton();
                cell.setId("DeadCellButton");
                gridPane.add(cell, column, row);
            }
        }

        return gridPane;
    }

    public GridPane readGridArrayAndDrawCells(int gridArray[][])
    {
        GridPane gridPane = CreateGrid.Grid();
        Button cell;
        for (int row = 0; row < gridArray.length; ++row)
        {
            for (int column = 0; column < gridArray[row].length;  ++column)
            {
                if (gridArray[row][column] == 1)
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
}
