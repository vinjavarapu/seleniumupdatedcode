package seleniumheadless_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class BaseClass {
 
	  
	   public static WebDriver driver;
	   
	   
	   
	 @Test
	public  void ChromeDriverOptions(){
		  
	  
	  System.setProperty("webdriver.chrome.driver", "\\chromedriver1\\chromedriver.exe");
      
      //create object of chrome options
      ChromeOptions options = new ChromeOptions();
      
      //add the headless argument
      options.addArguments("headless");
      
      //pass the options parameter in the Chrome driver declaration
      WebDriver driver = new ChromeDriver(options);
      driver.get("https://www.google.com");
      
    
      
  }
  }
