import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



public class SwapLoadImgsTest {

	
	@Test
	public void SwapLoadImgs() {
		
		// create new playing cards controller method for junit testing
		SwapLoadImgs imgFieldsTest = new SwapLoadImgs();
		
		// testing loading of cardTypes from controller and imgFields method
		String cardTypes = imgFieldsTest.randomImgTypeSelector();
	
		// test will fail if these values are not equal
		assertEquals("_of_clubs.png",cardTypes);
		
	}

	

}
