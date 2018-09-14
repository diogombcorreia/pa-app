package pa.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for Maven JUnit 5 - Hello world!
 * @author  Paulo Araújo
 * @version 1.0
 */
public class AppTest 
{
	@BeforeEach 
	public void init() {
		System.out.println("@BeforeEach - Runbefore Each method");
	}	
	
    @DisplayName("First Test - concat")
	@Test
	void testConcat1() {
		App ap = new App();
		String res = ap.concat("Hello"," world1!");
		// Test concat example method
		assertEquals("Hello world1!", res);
	}	
	@DisplayName("Second Test - concat")
	@Test
	void testConcat2() {
		App ap = new App();
		String res = ap.concat("Hello"," world2!");
		// Test concat example method
		assertEquals("Hello world2!", res);
	}	
	@DisplayName("Third Test - concat")
	@Test
	void testConcat3() {
		App ap = new App();
		String res = ap.concat("Hello"," world3!");
		// Test concat example method
		assertEquals("Hello world3!", res);
	}	
	@DisplayName("Fourth Test - main")
	@Test
	void testMain(){
		App.main(null);
		assertTrue(true);
	}
}
