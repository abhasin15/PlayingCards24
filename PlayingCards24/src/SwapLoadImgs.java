import java.util.Random;

import javafx.scene.image.ImageView;

public class SwapLoadImgs {
	String rand = " ";
	public String randomImgTypeSelector(){
		String[] cardTypes = {"_of_clubs.png", "_of_diamonds.png", "_of_hearts.png", "_of_spades.png"};
		Random r = new Random();
		rand = cardTypes[r.nextInt(cardTypes.length)];
		return rand;
	}
	
	public void randomCardSelector(ImageView[] cardStack){
		
		int[] cardRand = new int[4];
			for(int counter = 0; counter < 4; counter ++)
				{
				cardRand[counter] = (int) (Math.floor(Math.random() * 13) + 1);
				cardStack[counter].setImage(new ImageView("view/"+cardRand[counter]+randomImgTypeSelector()).getImage());
				}
	}
	
	public void initialImgsSelector(ImageView[] cardStack){
		int[] cardRand = new int[4];
		for(int counter = 0; counter < 4; counter ++)
			{
			cardRand[counter] = (int) (Math.floor(Math.random() * 13) + 1);
			cardStack[counter].setImage(new ImageView("view/"+cardRand[counter]+randomImgTypeSelector()).getImage());
			}
	}
	
}
