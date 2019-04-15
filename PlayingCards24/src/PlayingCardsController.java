import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class PlayingCardsController {

	@FXML
	private Button solveTxt,clrTxt,chkTxt; //ayush

	private TextField ansField,entryField;

	private Label enterLbl;

	private VBox vbox1,vbox2,vbox3,vbox4;

	private ImageView card1,card2,card3,card4; //ayush

	// Adam added class to randomly pick cards
		public class Cards extends PlayingCardsController {
			
			// Adam randomly select from 52 cards
			// Adam Math.Random returns random number greater than 0
			// Adam Math.Floor returns largest integer that is less than or equal to
			// Adam the math.random argument
	        int card = (int) (Math.floor(Math.random() * 51) + 1);
			
			// Adam display 4 cards using ImageView. use getImage method to draw cards from folder in project
	        public Image card1 = new ImageView("/PlayingCards24/src/cards" +
			card + ".png").getImage();
	        
	        public Image card2 = new ImageView("/PlayingCards24/src/cards" +
	        		card + ".png").getImage();
	        
	        public Image card3 = new ImageView("/PlayingCards24/src/cards" +
	        		card + ".png").getImage();
	        
	        public Image card4 = new ImageView("/PlayingCards24/src/cards" +
	        		card + ".png").getImage();
			
			
		}
		// Adam ActionEvent method to clear text field when button is pressed
		// Adam id anc clr event defined in scenebuilder 
		public void clear (ActionEvent clr) {
			
			clrTxt.setText(null);
			

		}
}