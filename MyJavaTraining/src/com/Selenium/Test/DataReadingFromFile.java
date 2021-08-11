package com.Selenium.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataReadingFromFile {
	 static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
	
		
	      Properties prop = new Properties();
	      
	      FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\SampleFile\\config.properties");
	      
	      prop.load(ip);
	      String url = prop.getProperty("URL");
	      //System.out.println(url);
	      String browserName = prop.getProperty("browser");
	     // String Username = prop.getProperty("username");
	      //String Password = prop.getProperty("password");
	      
	      //System.out.println(browserName);
	      
	      if(browserName.equals("chrome")) {
	    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahavir\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    	  driver = new ChromeDriver();
	    	 	    	  
	      }
	      else if (browserName.equals("FF")) {
	    	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mahavir\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	    	  driver = new FirefoxDriver();
	    	
	      }
	      driver.manage().window().maximize();
    	  driver.manage().deleteAllCookies();
    	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	      driver.get(url);
	
			driver.findElement(By.xpath(prop.getProperty("Username_xpath"))).sendKeys(prop.getProperty("username"));
			driver.findElement(By.xpath(prop.getProperty("Password_xpath"))).sendKeys(prop.getProperty("password"));
			    
	      Thread.sleep(3000);
	      driver.quit();
	}

}
