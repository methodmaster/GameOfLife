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
                if ((row > 0 && column > 0)
                        && 
                        (row < edgeNumber && column < edgeNumber ))
                {
                    if (gridArray[row-1][column] == ALIVE)
                    {
                        aliveNumber++;
                    }
                    else
                    {
                        deadNumber++;
                    }

                    if (gridArray[row-1][column+1] == ALIVE)
                    {
                        aliveNumber++;
                    }
                    else
                    {
                        deadNumber++;
                    }

                    if (gridArray[row][column+1] == ALIVE)
                    {
                        aliveNumber++;
                    }
                    else
                    {
                        deadNumber++;
                    }

                    if (gridArray[row+1][column+1] == ALIVE)
                    {
                        aliveNumber++;
                    }
                    else
                    {
                        deadNumber++;
                    }

                    if (gridArray[row+1][column] == ALIVE)
                    {
                        aliveNumber++;
                    }
                    else
                    {
                        deadNumber++;
                    }

                    if (gridArray[row+1][column-1] == ALIVE)
                    {
                        aliveNumber++;
                    }
                    else
                    {
                        deadNumber++;
                    }

                    if (gridArray[row][column-1] == ALIVE)
                    {
                        aliveNumber++;
                    }
                    else
                    {
                        deadNumber++;
                    }

                    if (gridArray[row-1][column-1] == ALIVE)
                    {
                        aliveNumber++;
                    }
                    else
                    {
                        deadNumber++;
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
        }

       return nextGenerationArray;
    }
}
