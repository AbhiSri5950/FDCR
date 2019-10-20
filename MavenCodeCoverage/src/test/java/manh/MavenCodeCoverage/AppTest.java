package manh.MavenCodeCoverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	 @Test
	    public void testName() {

		 AppTestName appTest = new AppTestName();
	        assertEquals("Hello abhi", appTest.getMessage("abhi"));

	    }
	

	/*
	 * @Test public void testNameEmpty() {
	 * 
	 * AppTestName appTest = new AppTestName();
	 * assertEquals("Please provide a name!", appTest.getMessage(" "));
	 * 
	 * }
	 */
}
