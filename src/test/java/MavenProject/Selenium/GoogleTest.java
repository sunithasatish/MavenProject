package MavenProject.Selenium;


import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import UIFramework.BaseTest;

public class GoogleTest extends BaseTest {
  @Test
  public void googleTest() {
	  
	 
	  driver.get("http://google.com");
	  
	  Set<Cookie> cookies = driver.manage().getCookies();
	  
	  for(Cookie c: cookies){
		  
		  System.out.println(c.getName());
		  System.out.println("-------");
		  System.out.println(c);
	  }
	  
	  driver.manage().deleteCookieNamed("NID");
	  
	  System.out.println("#####$$$$$$$$#######");
Set<Cookie> cookies1 = driver.manage().getCookies();
	  
	  for(Cookie c: cookies1){
		  
		  System.out.println(c.getName());
		  System.out.println("############");
		  System.out.println(c);
	  }
	  
	  Cookie cname = new Cookie("NIM","TEST");
	  driver.manage().addCookie(cname);
	  
	  System.out.println("####%%%%%%%%#######");
	  Set<Cookie> cookies2 = driver.manage().getCookies();
	  	  
	  	  for(Cookie c: cookies2){
	  		  
	  		  System.out.println(c.getName());
	  		  System.out.println("&&&&&&&&");
	  		  System.out.println(c);
	  	  }
	  
  }
}
