package pa.app;
import java.util.logging.Logger;
/**
 * Maven JUnit 5 - Hello world!
 * @author  Paulo Araújo
 * @version 1.0
 *
 */
public class App 
{
	private static final Logger logger = Logger.getLogger( App.class.getName() );
    public static void main( String[] args )
    {
        logger.info("Maven JUnit 5 - Hello World!");
    }
	
	// String concatenation method example
	String concat(String s1, String s2) {
		return s1+s2;
	}
	
	public int addition(int a, int b){
		return a + b;
	}
	
	public int subtraction(int a, int b){
		return a - b;
	}
	
	public int multiplication(int a, int b){
		return a * b;
	}
	
	public int division(int a, int b){
		return a / b;
	}
}