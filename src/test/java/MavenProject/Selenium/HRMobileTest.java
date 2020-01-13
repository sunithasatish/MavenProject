package MavenProject.Selenium;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import UIFramework.BaseTest;

public class HRMobileTest extends BaseTest{

	
	@Test
	public void mobileTest() throws InterruptedException{
		
		driver.get("https://hr.com");
		
		Dimension actualSize = driver.manage().window().getSize();
		
		Dimension gpixel = new Dimension(411, 731);
		
		
		driver.manage().window().setSize(new Dimension(1024, 1366));
		Thread.sleep(3000);
		driver.manage().window().setSize(gpixel);
		Thread.sleep(3000);
		
		driver.manage().window().setSize(actualSize);
		Thread.sleep(3000);
		
	}
}
