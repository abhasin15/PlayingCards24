

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;



public class PlayingCardsController extends SwapLoadImgs implements Initializable {

	//static String rand = "";

	@FXML
	private Button solveTxt,clrTxt,chkTxt; //ayush
	@FXML
	private TextField ansField, entryField;
	@FXML
	private Label enterLbl;
	@FXML 
	private VBox vbox1,vbox2,vbox3,vbox4;

	@FXML
	private ImageView card1;
	@FXML
	private ImageView card2;
	@FXML
	private ImageView card3;
	@FXML
	private ImageView card4;
	
	@FXML
	public void loadImages(ActionEvent event) throws Exception
	{   //method call to SwapLoadImgs.java
		ImageView fourCardStack[] = {card1,card2,card3,card4};
		randomCardSelector(fourCardStack);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) { //method call to SwapLoadImgs.java 
	ImageView fourCardStack[] = {card1,card2,card3,card4};
	initialImgsSelector(fourCardStack);
	}
	
	@FXML
	public void validateUserEntry(ActionEvent event) throws Exception
	{
		isExpression(entryField.getText());
	}
	
	public boolean isExpression(String input){
		try {
			//StringTokenizer expBuilder = new StringTokenizer(input, "()+-/*" );
			Pattern p = Pattern.compile("[a-zA-Z]+");
			Matcher m = p.matcher(input);
			if(m.find()){
					JOptionPane.showMessageDialog(null, "Invalid: " + input + " is not an expression in numeric form");
					entryField.clear();
					m.reset();
			}
			p = Pattern.compile("[\\~\\!\\@\\#\\$\\%\\^\\&\\{\\}\\]\\[\\:\\;'\\'\\?\\>\\<\\,\\s]"); //\#\\.\\%&]{0,13}
			m = p.matcher(input);
			if(m.find()){
					JOptionPane.showMessageDialog(null, "Please enter a valid numeric expression!");
					entryField.clear();
					m.reset();
			}
			
			return false;
		} catch (NumberFormatException e) {
			
			
		}
		return true;
		
	}
		 
		
		
	
	
		
			// TODO: handle exception
		
		
	
	/*void input(KeyEvent event) {		
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
		*/
	


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



	public void clear (ActionEvent clr) {

		clrTxt.setText(null);



	}



}

