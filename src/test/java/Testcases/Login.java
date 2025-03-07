package Testcases;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Login extends Base{

	
    @Test
	public void VerifyOTP() throws InterruptedException, MalformedURLException, URISyntaxException {
    
     sleep(10);
     try {
      	     WebElement a = d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Get Started\"`]"));     
      	        if(a.isDisplayed()) {
      	        	a.click();
      	      
      	        }
  	} catch (Exception e) {
  	   System.out.println("Element not displayed");	
  	}
     
     sleep(10);
     
     d.quit();
     
     App_launch();
     
     sleep(5);
    	
      d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Phone Number\"`]")).sendKeys("7829190451");
    
      d.findElement(AppiumBy.accessibilityId("Send OTP")).click();
      
      Thread.sleep(5000);
      d.findElement(AppiumBy.className("XCUIElementTypeTextField")).click();
      Thread.sleep(2000);
      try {
          d.findElement(AppiumBy.accessibilityId("suggestion")).click();
	} catch (Exception e) {
		System.out.println("OTP not displayed in suggestions ,ENter the OTP Manually");
	}
      
      d.findElement(AppiumBy.accessibilityId("Verify OTP")).click();
      Thread.sleep(2000);
      
      d.findElement(AppiumBy.accessibilityId("Continue to pairing")).click();
	}
}
