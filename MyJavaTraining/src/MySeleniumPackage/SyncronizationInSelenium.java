package MySeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncronizationInSelenium {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahavir\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		
		WebElement Firstname = driver.findElement(By.name("firstname"));
		WebElement Lastname = driver.findElement(By.name("lastname"));
		WebElement mobilenumbre = driver.findElement(By.name("reg_email__"));
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		
		
		sendKeys(driver, Firstname, 10, "Tom");
		sendKeys(driver, Lastname, 5, "Peter");
		sendKeys(driver, mobilenumbre, 5, "8989898989");
		sendKeys(driver, password, 5, "test@321");
		
		WebElement malebutton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label"));
		clickOn(driver, malebutton, 5);
		

	}
		
		public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
			
			new WebDriverWait(driver, timeout);
			until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(value);
		
	}
		
		private static void until(ExpectedCondition<WebElement> visibilityOf) {
			
		}

		public static void clickOn(WebDriver driver, WebElement element, int timeout) {
			new WebDriverWait(driver, timeout);
			until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			
		}
		

}
