
public class Main
{
    public static void main(String[] args)
    {
         /* There has to be separate main class for starting the Application
          * because the current version of java checks for things but it can't find it.
          * This is for exporting this program to JAR.
          */

        GraphicalInterface graphicalInterface = new GraphicalInterface();
        graphicalInterface.loadGraphics();
    }
}