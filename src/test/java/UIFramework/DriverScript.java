package UIFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScript {
	
	WebDriver driver = null;
	
	String browser = "chrome";
	public WebDriver getDriver(){
		
		
	  	  if(driver==null){
	  		  
	  		  if(browser.equalsIgnoreCase("chrome")){
	  			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
	  			driver = new ChromeDriver();
	  			driver.manage().timeouts().setScriptTimeout(3, TimeUnit.MILLISECONDS);
		  		  return driver;
	  		  }else if (browser.equalsIgnoreCase("firefox"))
	  		  {
	  			 System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\resources\\geckodriver.exe");
	  			 driver = new FirefoxDriver();
	  			
		  		 return driver;
	  		  }
	  	  }
		  
		   return driver;
	}

}
