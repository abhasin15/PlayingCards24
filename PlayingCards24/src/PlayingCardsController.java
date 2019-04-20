
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    @FXML
    private ImageView card1;
    @FXML
    private ImageView card2;
    @FXML
    private ImageView card3;
    @FXML
    private ImageView card4;

	
	
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
	String rand = "";
    public String imgFields()
    {
    	List<String> imgNames= new ArrayList<>();
    	imgNames.add("_of_clubs.png");
    	imgNames.add("_of_diamonds.png");
    	imgNames.add("_of_hearts.png");
    	imgNames.add("_of_spades.png");
    	Random r = new Random();
    	rand=imgNames.get(r.nextInt(imgNames.size()));
		return rand;
		// imgNames
    }
    

	// Adam array to hold "rank" of cards
	// needs to convert cards ACE = 1, 11 = jack, 12 = queen, 13 is king
	private static String[] rank  = { "Ace", "2", "3", "4", "5", "6", "7", 
			"8", "9", "10", "Jack", "Queen", "King" };
	
	
	
	
	
    @FXML
    void loadImages(ActionEvent event) {
    	int card = (int) (Math.floor(Math.random() * 7) + 1);
    	int cardTwo = (int) (Math.floor(Math.random() * 7) + 1);
    	int cardThree = (int) (Math.floor(Math.random() * 7) + 1);
    	int cardFour = (int) (Math.floor(Math.random() * 7) + 1);
    	card1.setImage(new ImageView("cards/"+card+"_of_clubs.png").getImage());

    	card2.setImage(new ImageView("cards/"+card+"_of_hearts.png").getImage());
//=======
    	card2.setImage(new ImageView("cards/"+cardTwo+"_of_clubs.png").getImage());
    	
    	card3.setImage(new ImageView("cards/"+cardThree+"_of_clubs.png").getImage());
    	
    	card4.setImage(new ImageView("cards/"+cardFour+"_of_clubs.png").getImage());
//>>>>>>> refs/remotes/origin/master
    }
	
	// Adam ActionEvent method to clear text field when button is pressed
	// Adam id anc clr event defined in scenebuilder 
	public void clear (ActionEvent clr) {
		
		clrTxt.setText(null);
		
	

}}

