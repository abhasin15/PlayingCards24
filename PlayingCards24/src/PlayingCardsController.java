

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
	
	

	static String rand = "";

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
    
    public void startImgs() // this needs to work to show startup imgs
	{
    	//int rando =(int) (Math.floor(Math.random() * 13) + 1);
		card1.setImage(new ImageView("cards/11_of_diamonds.png").getImage());
	}

    @FXML
    public static String imgFields()
    {
    	String[] cardTypes = {"_of_clubs.png", "_of_diamonds.png", "_of_hearts.png", "_of_spades.png"};
    	Random r = new Random();
    	rand = cardTypes[r.nextInt(cardTypes.length)];
		return rand;
    }
    
   //constructor to load random images at start of game
    

    @FXML
    void loadImages(ActionEvent event) {
    	ImageView fourCardStack[] = {card1,card2,card3,card4};
    	int[] cardRand = new int[4];
    	for(int counter = 0; counter < 4; counter ++)
    	{
    		cardRand[counter] = (int) (Math.floor(Math.random() * 13) + 1);
    		fourCardStack[counter].setImage(new ImageView("cards/"+cardRand[counter]+imgFields()).getImage());
    	}
    /*	int card = (int) (Math.floor(Math.random() * 13) + 1);
    	int cardTwo = (int) (Math.floor(Math.random() * 13) + 1);
    	int cardThree = (int) (Math.floor(Math.random() * 13) + 1);
    	int cardFour = (int) (Math.floor(Math.random() * 13) + 1);

    	card1.setImage(new ImageView("cards/"+card+imgFields()).getImage());

    	card2.setImage(new ImageView("cards/"+cardTwo+imgFields()).getImage());


    	card3.setImage(new ImageView("cards/"+cardThree + imgFields()).getImage());

    	card4.setImage(new ImageView("cards/"+cardFour + imgFields()).getImage());
*/
    }


	public void clear (ActionEvent clr) {

		clrTxt.setText(null);



}}

