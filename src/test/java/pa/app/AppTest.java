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
		//System.out.println("@BeforeEach - Runbefore Each method");
	}	
	
    @DisplayName("First Test - concat")
	@Test
	void testConcat1() {
		App ap = new App();String res = ap.concat("Hello"," world1!");assertEquals("Hello world1!", res);
	}	
	@DisplayName("Second Test - addition")
	@Test
	void testAddition() {
		App ap = new App();int res = ap.addition(2,2);assertEquals(4, res);
	}	
	@DisplayName("Third Test - subtraction")
	@Test
	void testSubtraction() {
		App ap = new App();int res = ap.subtraction(4,2);assertEquals(2, res);
	}
	@DisplayName("Fourth Test - multiplication")
	@Test
	void testMultiplication() {
		App ap = new App();int res = ap.multiplication(4,2);assertEquals(8, res);
	}
	@DisplayName("Fifth Test - division")
	@Test
	void testDivision() {
		App ap = new App();int res = ap.division(4,2);assertEquals(2, res);
	}
	@DisplayName("Sixth Test - main")
	@Test
	void testMain(){
		App.main(null);assertTrue(true);
	}
}
