import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class imgFieldsTest {

	
	@Test
	public void imgFieldstest() {
		
		// create new playing cards controller method for junit testing
		PlayingCardsController imgFieldsTest = new PlayingCardsController();
		
		// testing loading of cardTypes from controller and imgFields method
		String cardTypes = imgFieldsTest.imgFields();
	
		// test will fail if these values are not equal
		assertEquals("_of_clubs.png",cardTypes);
		
	}

}
