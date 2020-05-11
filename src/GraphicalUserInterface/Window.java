
package GraphicalUserInterface;

import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Window
{
	public static Slider zoomSlider = CreateSlider.zoomSlider();
	public static Slider timerSpeedSlider = CreateSlider.timerSpeedSlider();
	public static ScrollPane scrollPane = CreateScrollPane.ScrollPane();
	public static GridPane gridPane;
	static int gridArray[][] = {
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			
			{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
			
			{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
			
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	};

	public static BorderPane borderPane()
	{
		Create create = new Create();
		//gridArray = create.randomlyPopulatedArray(50, 50);

		DrawGrid drawGrid = new DrawGrid();
		gridPane =
				drawGrid.readGridArrayAndDrawCells(gridArray);

		scrollPane.setContent(gridPane);
		
		BorderPane borderPaneLayout = new BorderPane();
		borderPaneLayout.setTop(TopButtonBar.Buttons());
		borderPaneLayout.setRight(zoomSlider);
		borderPaneLayout.setCenter(scrollPane);
		borderPaneLayout.setId("BorderPane");
		
		return borderPaneLayout;
	}

	public static void reDrawGrid()
	{
		DrawGrid drawGrid = new DrawGrid();
		gridPane =
				drawGrid.readGridArrayAndDrawCells(gridArray);
		scrollPane.setContent(gridPane);

		ApplyRules applyRules = new ApplyRules();
		Window.gridArray = applyRules.Rules(Window.gridArray);
	}
	
    public static Scene WelcomeWindowScene() throws Exception
    {
        Scene welcomeWindow;
        welcomeWindow = new Scene(borderPane(), 800, 600);
        welcomeWindow.getStylesheets().
                    add("GraphicalUserInterface/StyleSheet.css");

        return welcomeWindow;
    }
    
    public static void mainWindow() throws Exception
    {
    	Stage welcomeWindow = new Stage();
    	HandleWindowsEvents handleWindowsEvents = new HandleWindowsEvents();
    	
    	welcomeWindow.setTitle("Welcome to Game Of Life");
    	welcomeWindow.setOnCloseRequest(handleWindowsEvents);
    	welcomeWindow.setScene(WelcomeWindowScene());
    	welcomeWindow.show();
    }
}
