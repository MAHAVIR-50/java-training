package JavaBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloProgram {

		public static void main(String[] args) {
		
		System.out.println("Hello java");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahavir\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

	}

}
