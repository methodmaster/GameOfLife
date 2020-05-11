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
}
