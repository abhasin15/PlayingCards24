import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.scene.image.ImageView;
/**
 * This class will initially load random images into program
 * and will swap images
 * @author Ayush
 */

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
				int somenum = cardRand[counter];
				//checkNums(somenum);
				cardStack[counter].setImage(new ImageView("view/"+cardRand[counter]+randomImgTypeSelector()).getImage());
				
				}
	}
	
	/*public void checkNums(int cardRand){
	
     //  System.out.print(cardRand);
      int counter = 0, n = 0;
      n = cardRand;
       while(n > 0)
       {
           n= n / 10;
           counter++; //get me the counter value of all digits in the number
       }
       
       String cardDigits = Integer.toString(cardRand);
       System.out.println(cardDigits);
       Pattern p = Pattern.compile("^[10-13]");
       Matcher m = p.matcher(cardDigits);
       int doubleDigitCount=0;
       if(m.find())
       {
    	   doubleDigitCount++;
    	   System.out.println(doubleDigitCount++);
       }
       
       
       
		while(cardRand > 0)
        {
            int a = cardRand % 10;
            System.out.print(a);
            cardRand = cardRand / 10;

        }
		
	}   /
	*/
	public void initialImgsSelector(ImageView[] cardStack){
		int[] cardRand = new int[4];
		for(int counter = 0; counter < 4; counter ++)
			{
			cardRand[counter] = (int) (Math.floor(Math.random() * 13) + 1);
			//checkNums(cardRand[counter]);
			cardStack[counter].setImage(new ImageView("view/"+cardRand[counter]+randomImgTypeSelector()).getImage());
			}
	}

	
}
