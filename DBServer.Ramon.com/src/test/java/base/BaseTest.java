package base;
import org.junit.AfterClass;
import static driver.DriverFactory.KillDriver;

import java.util.Random;

public class BaseTest {
	
	public Random rnd;
	
	public BaseTest() {
		rnd = new Random();
	}

	@AfterClass
	public static void tearDownAfterClass() {
		KillDriver();
    }		
}
