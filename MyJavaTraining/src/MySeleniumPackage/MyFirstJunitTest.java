package MySeleniumPackage;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyFirstJunitTest {
	
	static int a;
	static int b;
	
	
	@BeforeClass
	public static void startTest() {
		System.out.println("Start Test");
		
		a = 200;
		b = 100;
	}
	@Test
	public void myFirstTest() {
		System.out.println("First Test Case");
		
		int sum =a+b;
		assertEquals(300,sum);
		
	}
	@Test
	public void mySecondTest() {
		System.out.println("Second Test Case");
		
		int sub =a-b;
		assertFalse(1001==sub);
		
	}
	@AfterClass
	public static void endTest() {
		System.out.println("End of Test");
		
	}

}
