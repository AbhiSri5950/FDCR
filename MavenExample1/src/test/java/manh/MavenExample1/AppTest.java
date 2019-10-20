package manh.MavenExample1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void testNameMkyong() {

	    App obj = new App();
	    assertEquals("Hello Abhi", obj.getMessage("Abhi"));

	}
}
