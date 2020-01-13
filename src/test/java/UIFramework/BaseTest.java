package UIFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public WebDriver driver = null;
	//Tset comment
	@BeforeMethod
	public void setup(){
		DriverScript driverScript = new DriverScript();
		driver = driverScript.getDriver();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().timeouts().setScriptTimeout(3, TimeUnit.MINUTES);
		
	}
	
	@AfterSuite
	public void teardown(){
		driver.quit();
	}

}
