package GraphicalUserInterface;
public class ApplyRules
{
    private int [][] gridArray;
    public int[][] Rules(int[][] array)
    {
        gridArray = array;
        int[][] nextGenerationArray = new int [gridArray.length][gridArray.length];
        final int ALIVE = 1;
        final int DEAD = 0;
        
        for (int row = 0; row < gridArray.length; row++)
        {
            for (int column = 0; column < gridArray[row].length; column++)
            {
            	int aliveNumber = 0;
                int deadNumber = 0;
                int edgeNumber = gridArray.length - 1;

                // Normal Cell
                if ((row > 0 && column > 0)
                        && 
                        (row < edgeNumber && column < edgeNumber ))
                {
                    aliveNumber = getAliveNeighborsNumber_Normal(gridArray,
                            row,column);
                }

                // Corner Top Right
                if (row == 0 && column == edgeNumber)
                {
                    aliveNumber = getAliveNeighborsNumber_Corner_TopRight(gridArray,
                            row,column);
                }

                // Corner Bottom Right
                if (row == edgeNumber && column == edgeNumber)
                {
                    aliveNumber = getAliveNeighborsNumber_Corner_BottomRight(gridArray,
                            row,column);
                }

                // Corner Bottom Left
                if (row == edgeNumber && column == 0)
                {
                    aliveNumber = getAliveNeighborsNumber_Corner_BottomLeft(gridArray,
                            row,column);
                }

                // Rules for Conway's Game of Life
                if (gridArray[row][column] == ALIVE
                        && aliveNumber < 2)
                {
                    nextGenerationArray[row][column] = 0;
                }
                else if(gridArray[row][column] == ALIVE
                        && (aliveNumber == 2 || aliveNumber == 3))
                {
                    nextGenerationArray[row][column] = gridArray[row][column];
                }
                else if(gridArray[row][column] == ALIVE
                        && aliveNumber > 3)
                {
                    nextGenerationArray[row][column] = 0;
                }
                else if (gridArray[row][column] == DEAD
                        && aliveNumber == 3)
                {
                    nextGenerationArray[row][column] = 1;
                }
            }
        }

       return nextGenerationArray;
    }

    private static int getAliveNeighborsNumber_Normal(int[][] array,
                                                      int currentCellRowIndex,
                                                      int currentCellColumnIndex)
    {
        int aliveNumber = 0;

        for (int row = -1; row < 2; row++)
        {
            for (int column = -1; column < 2; column++)
            {
                int neighborRowIndex = currentCellRowIndex + row;
                int neighborColumnIndex = currentCellColumnIndex + column;

                /* When row and column == 0, this is the cell which we are
                 * counting the neighbours for. So we don't need to count
                 * this cell as a neighbouring cell. So we ignore this cell
                 * by adding 0 to aliveNumber.
                 */
                if (row == 0 && column == 0)
                {
                    aliveNumber = aliveNumber + 0;
                }else {
                    if(array[neighborRowIndex][neighborColumnIndex] == 1)

                    {
                        aliveNumber = aliveNumber + 1;
                    }
                }
            }
        }
        return aliveNumber;
    }

    private static int getAliveNeighborsNumber_Corner_TopRight(int[][] array,
                                                               int currentRowIndex,
                                                               int currentColumnIndex)
    {
        int aliveNumber = 0;
        int edgeCell = (array.length - 1);

        // Neighbor Cell 1
        if (array[edgeCell][currentColumnIndex - 1] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 2
        if(array[edgeCell][currentColumnIndex] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 3
        if (array[edgeCell][0] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 4
        if (array[currentRowIndex][currentColumnIndex - 1] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 5
        if (array[currentRowIndex][0] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 6
        if (array[currentRowIndex + 1][currentColumnIndex - 1] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 7
        if (array[currentRowIndex + 1][currentColumnIndex] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 8
        if (array[currentRowIndex + 1][0] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        return  aliveNumber;
    }

    private static int getAliveNeighborsNumber_Corner_BottomRight(int[][] array,
                                                                  int currentRowIndex,
                                                                  int currentColumnIndex)
    {
        int aliveNumber = 0;
        int edgeCell = (array.length - 1);

        // Neighbor Cell 1
        if (array[currentRowIndex - 1][currentColumnIndex - 1] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 2
        if(array[currentRowIndex - 1][currentColumnIndex] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 3
        if (array[currentRowIndex - 1][0] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 4
        if (array[currentRowIndex][currentColumnIndex - 1] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 5
        if (array[currentRowIndex][0] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 6
        if (array[0][currentColumnIndex - 1] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 7
        if (array[0][currentColumnIndex] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 8
        if (array[0][0] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        return  aliveNumber;
    }

    private static int getAliveNeighborsNumber_Corner_BottomLeft(int[][] array,
                                                                 int currentRowIndex,
                                                                 int currentColumnIndex)
    {
        int aliveNumber = 0;
        int edgeCell = (array.length - 1);

        // Neighbor Cell 1
        if (array[currentRowIndex - 1][edgeCell] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 2
        if(array[currentRowIndex - 1][0] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 3
        if (array[currentRowIndex - 1][currentColumnIndex + 1] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 4
        if (array[currentRowIndex][edgeCell] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 5
        if (array[edgeCell][currentColumnIndex + 1] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 6
        if (array[0][edgeCell] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 7
        if (array[0][currentColumnIndex] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        // Neighbor Cell 8
        if (array[0][currentColumnIndex + 1] == 1)
        {
            aliveNumber = aliveNumber + 1;
        }

        return  aliveNumber;
    }
}
