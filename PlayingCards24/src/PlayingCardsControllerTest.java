

import org.junit.jupiter.api.Test;

import javafx.scene.image.ImageView;


/*@Override
public void initialize(URL location, ResourceBundle resources) { //method call to SwapLoadImgs.java 
ImageView fourCardStack[] = {card1,card2,card3,card4};
initialImgsSelector(fourCardStack);
}

*/

public class PlayingCardsControllerTest {
		
	// test array load 
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void testInitialize() {
		
		ImageView card1 = new ImageView();
		ImageView card2 = new ImageView();
		ImageView card3 = new ImageView();
		ImageView card4 = new ImageView();
		
		ImageView fourCardStack[] = {card1,card2,card3,card4};
		equals(fourCardStack);
	}

}

