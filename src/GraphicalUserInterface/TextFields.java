package GraphicalUserInterface;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TextFields {
	
	private TextField row;
	private TextField column;

	private int textFieldWidthSize = 40;

	public Label rowLabel ()
	{
		Label row = new Label("Row Number: ");

		return row;
	}
	
	public TextField rowTextField()
	{
		HandleMouseEvents handleMouseEvents = new HandleMouseEvents();
		row = new TextField();
		row.setMaxWidth(textFieldWidthSize);
		row.setText("123");
		row.setOnMouseExited(handleMouseEvents);
		row.setOnMouseMoved(handleMouseEvents);

		return row;
	}

	public Label columnLabel ()
	{
		Label column = new Label("Column Number: ");

		return column;
	}

	public TextField columnTextField()
	{
		HandleMouseEvents handleMouseEvents = new HandleMouseEvents();
		column = new TextField();
		column.setMaxWidth(textFieldWidthSize);
		column.setText("123");
		column.setOnMouseExited(handleMouseEvents);
		column.setOnMouseMoved(handleMouseEvents);

		return column;
	}

	public boolean isRowInputCorrect()
	{
		boolean isInputCorrect = false;
		String rowInput = TopButtonBar.rowTextField.getText();
		// Prevent checking empty text field.
		
		// Check to make sure it is numbers and NOT letters.

		// Check the number range is in between 8 and 999.
		int rowNumber = Integer.parseInt(rowInput);

		if (rowNumber > 8 && rowNumber < 1000)
		{
			isInputCorrect = true;
		}else
		{
			isInputCorrect = false;
		}

		return isInputCorrect;
	}

	public boolean isColumnInputCorrect()
	{
		boolean isInputCorrect = false;
		String columnInput = TopButtonBar.columnTextField.getText();

		// Prevent checking empty text field.

		// Check to make sure it is numbers and NOT letters.

		// Check the number range is in between 8 and 999.
		int columnNumber = Integer.parseInt(columnInput);

		if (columnNumber > 8 && columnNumber < 1000)
		{
			isInputCorrect = true;
		}else
		{
			isInputCorrect = false;
		}

		return isInputCorrect;
	}
}
