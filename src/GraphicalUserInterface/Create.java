package GraphicalUserInterface;
import java.util.Random;

public class Create
{

    private static int rowNumber;
    private static int columnNumber;
    public int[][] randomlyPopulatedArray(int numberOfRows, int numberOfColumns)
    {
        rowNumber = numberOfRows;
        columnNumber = numberOfColumns;

        int gridArray[][] = new int[numberOfRows][numberOfColumns];
        
        Create create = new Create();
        
        gridArray = create.randomlyPopulateArray(gridArray);
        
        return gridArray;
    }
    
    private int [][] randomlyPopulateArray(int gridArray[][])
    {
        Random generateRandomNumber = new Random();
        int cellNumber;

        for (int row = 0; row < gridArray.length; row++)
        {
            for (int column = 0; column < gridArray[row].length; column++)
            {
                cellNumber = generateRandomNumber.nextInt(2);
                gridArray[row][column] = cellNumber;
            }
        }
        return gridArray;
    }
}
