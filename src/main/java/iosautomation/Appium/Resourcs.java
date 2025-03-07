package iosautomation.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Resourcs {
	public static IOSDriver d;
	public static AppiumDriverLocalService s;
	
	public static void launch() throws MalformedURLException, InterruptedException {
		 s = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
	    		   .withIPAddress("127.0.0.1").usingPort(4723).build();
	       
	       XCUITestOptions x = new XCUITestOptions();
//	       x.setCapability("xcodeOrgId","4X573YZ7ZJ");
//	       x.setCapability("xcodeSigningId","iPhone Developer");
	       x.setCapability("platformName", "IOS");
	       x.setCapability("automationName","XCUITest");
	       x.setCapability("udid","00008020-000E60EC2603002E");
	       x.setCapability("bundleId","com.coveiot.ios.boat.prod");
	       x.setCapability("autoAcceptAlerts", true);
	       x.setWdaLaunchTimeout(Duration.ofMillis(200000));
	       
	       d = new IOSDriver(new URL("http://127.0.0.1:4723"),x);
	       d.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	       //locators - xpath,classname,ios,iosclasschain,iospredicateString,accessbility id,id
	       //For accessbility id - AppiumBy
	       
	}

	
//	accessbulity Id - Data sync in progress, please try after some time.
	
	
	public static void sleep(int n) throws InterruptedException {
		n = n * 1000;
		Thread.sleep(n);
	}
	
	public static void OK(){
		 try {
  	  	     WebElement a = d.findElement(AppiumBy.iOSNsPredicateString("name == \"Ok\" AND label == \"Ok\" AND value == \"Ok\""));     
  	  	        if(a.isDisplayed()) {
  	  	        	a.click();
  	  	      
  	  	        }
  		    } catch (Exception e) {
  		   System.out.println("OK popup not displayed");	
  		   }
	}
	
	public static void back() {
		d.findElement(AppiumBy.accessibilityId("Back")).click();
	}
	
	
	

}
