




import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;



public class PlayingCardsController implements Initializable{

	static String rand = "";

	@FXML
	private Button solveTxt,clrTxt,chkTxt; //ayush
	@FXML
	private TextField ansField, entryField;
	@FXML
	private Label enterLbl;
	@FXML 
	private VBox vbox1,vbox2,vbox3,vbox4;

	@FXML
	protected ImageView card1;
	@FXML
	protected ImageView card2;
	@FXML
	protected ImageView card3;
	@FXML
	protected ImageView card4;
	

	@FXML
	public String imgFields()
	{
		String[] cardTypes = {"_of_clubs.png", "_of_diamonds.png", "_of_hearts.png", "_of_spades.png"};
		Random r = new Random();
		rand = cardTypes[r.nextInt(cardTypes.length)];
		return rand;
	}

	


	@FXML
	public void loadImages(ActionEvent event) {
		ImageView fourCardStack[] = {card1,card2,card3,card4};
		int[] cardRand = new int[4];
			for(int counter = 0; counter < 4; counter ++)
				{
				cardRand[counter] = (int) (Math.floor(Math.random() * 13) + 1);
				fourCardStack[counter].setImage(new ImageView("cards/"+cardRand[counter]+imgFields()).getImage());
				}
		
	}
	/*on key pressed input
	action input



		// gather input from text field 
		void input(KeyEvent event) {		
			// to hold user input
			String input;
			// array for user input
			char[] array;
			int letter = 0;
			int digit = 0;
			int whitespace = 0;
			// scanner to gather keyboard input
			Scanner keyboard = new Scanner(System.in);
			// set input equal to value gathered from scanner
			input = keyboard.nextLine();

			// convert string to char array
			array = input.toCharArray();
			// verify input is a valid digit
			for (int i = 0; i < array.length; i++) {
				if (Character.isLetter(array[i]))
					letter--;
				else if (Character.isWhitespace(array[i]))
					whitespace--;	
				else if (Character.isDigit(array[i]))
					digit++;
					entryField.setText(input);
			}
		
			// close scanner
			keyboard.close();
		}*/


/*
	// determine if operators entered are valid
	public static boolean isOperator(char operator) {
		return (operator == '(' ||
				operator == ')' ||
				isArithmeticOperator(operator));
	}
	public static boolean isArithmeticOperator(char operator) {
		return (operator == '/' ||
				operator == '+' ||
				operator == '-' ||
				operator == '*');
	}

*/



	public void clear (ActionEvent clr) {

		clrTxt.setText(null);



	}




@Override
public void initialize(URL location, ResourceBundle resources) {
	ImageView fourCardStack[] = {card1,card2,card3,card4};
	int[] cardRand = new int[4];
		for(int counter = 0; counter < 4; counter ++)
			{
			cardRand[counter] = (int) (Math.floor(Math.random() * 13) + 1);
			fourCardStack[counter].setImage(new ImageView("cards/"+cardRand[counter]+imgFields()).getImage());
			}
	}
	
}

