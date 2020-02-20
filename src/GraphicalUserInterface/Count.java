package GraphicalUserInterface;

public class Count
{
    private static int grid_Array[][];
    public static int CountNumberOfElementsInArray(int gridArray[][])
    {
        grid_Array = gridArray;
        int numberOfElementsInArray = 0;

        for (int rows = 0; rows < grid_Array.length; rows++)
        {
            for (int columns = 0; columns < grid_Array.length; columns++)
            {
                numberOfElementsInArray++;
            }
        }

        return numberOfElementsInArray;
    }

    public static int CountNumberOfRowsInArray(int gridArray[][])
    {
        grid_Array = gridArray;

        int numberOfRowsInArray = 0;

        for (int rows = 0; rows < grid_Array.length; rows++)
        {
            numberOfRowsInArray++;
            for (int columns = 0; columns < grid_Array.length; columns++)
            {

            }
        }

        return numberOfRowsInArray;
    }

    public static int CountNumberOfColumnsInArray(int gridArray[][])
    {
        grid_Array = gridArray;

        int numberOfColumnssInArray = 0;

        for (int rows = 0; rows < grid_Array.length; rows++)
        {
            for (int columns = 0; columns < grid_Array.length; columns++)
            {
                numberOfColumnssInArray++;
            }
        }

        return numberOfColumnssInArray;
    }
}
