import GraphicalUserInterface.Window;
import javafx.application.Application;
import javafx.stage.Stage;

public class GraphicalInterface extends Application
{
    void loadGraphics()
    {
        Application.launch(GraphicalInterface.class);
    }

    public void start(Stage stage) throws Exception {
        Window.mainWindow();
    }
}
