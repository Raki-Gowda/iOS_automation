package iosautomation.Appium;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumBy;

public class realdevice extends Resourcs{

    public static void main( String[] args ) throws MalformedURLException, InterruptedException
    {
     launch();
     sleep(1);
       try {
    	     WebElement a = d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Get Started\"`]"));     
    	        if(a.isDisplayed()) {
    	        	a.click();
    	      
    	        }
	} catch (Exception e) {
	   System.out.println("Element not displayed");	
	}
   
//       d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Phone Number\"`]")).sendKeys("7829190451");
//     
//       d.findElement(AppiumBy.accessibilityId("Send OTP")).click();
//       
//       Thread.sleep(5000);
//       d.findElement(AppiumBy.className("XCUIElementTypeTextField")).click();
//       Thread.sleep(1000);
//       d.findElement(AppiumBy.accessibilityId("suggestion")).click();
//       
//       d.findElement(AppiumBy.accessibilityId("Verify OTP")).click();
//       Thread.sleep(2000);
//       
//       d.findElement(AppiumBy.accessibilityId("Continue to pairing")).click();
       
       
       d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Search here\"`]")).sendKeys("Wave Smart Call");
       
       d.findElement(AppiumBy.accessibilityId("Wave Smart Call")).click();
       
       d.findElement(AppiumBy.accessibilityId("Continue")).click();
       
       d.findElement(AppiumBy.accessibilityId("SMARTCALL_D20A")).click();
       
       d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Pair this device\"`]")).click();
       
       sleep(30);       
       WebElement c = d.findElement(AppiumBy.accessibilityId("Get started"));
       if(c.isEnabled()) {
    	   c.click();
       }
       
       try {
  	     WebElement a = d.findElement(AppiumBy.accessibilityId("OK"));     
  	        if(a.isDisplayed()) {
  	        	a.click();
  	      
  	        }
	    } catch (Exception e) {
	   System.out.println("Element not displayed");	
	   }
       
       Thread.sleep(30000);
       
       try {
		WebElement b = d.findElement(AppiumBy.accessibilityId("closeBtn"));
		if(b.isDisplayed()) {
			b.click();
		}
	} catch (Exception e) {
		System.out.println("Weekly report subscription popup not displayed");
	}
       
       
       System.out.println("Home icon displayed "+d.findElement(AppiumBy.accessibilityId("Home")).isDisplayed());
       System.out.println("Fitness icon displayed "+d.findElement(AppiumBy.accessibilityId("Fitness")).isDisplayed());
       System.out.println("My watch icon displayed "+d.findElement(AppiumBy.accessibilityId("My Watch")).isDisplayed());
       System.out.println("Fit crew displayed "+d.findElement(AppiumBy.accessibilityId("Fit Crew")).isDisplayed());
       System.out.println("Settings icon displayed "+d.findElement(AppiumBy.accessibilityId("Settings")).isDisplayed());
       System.out.println("boAt logo displayed "+d.findElement(AppiumBy.accessibilityId("Logo")).isDisplayed());
       System.out.println("Wave smart call Watch text displayed "+d.findElement(AppiumBy.accessibilityId("Wave Smart Call")).isDisplayed());
       System.out.println("Connected status displayed "+d.findElement(AppiumBy.accessibilityId("Connected")).isDisplayed());
       System.out.println("BT calling supported text "+d.findElement(AppiumBy.accessibilityId("BT calling")).isDisplayed());
       
       Thread.sleep(5000);
       
       d.findElement(AppiumBy.accessibilityId("Settings")).click();
       //Watch features
       d.findElement(AppiumBy.accessibilityId("Watch features")).click();
       
       System.out.println("Watch faces Tab displayed "+d.findElement(AppiumBy.accessibilityId("Watchfaces")).isDisplayed());
       
       System.out.println("Auto HR feature displayed "+d.findElement(AppiumBy.accessibilityId("Auto monitoring heart rate")).isDisplayed());

       System.out.println("Sedentary reminder feature displayed "+d.findElement(AppiumBy.accessibilityId("Sedentary reminder")).isDisplayed());

       System.out.println("Alarm feature displayed "+d.findElement(AppiumBy.accessibilityId("Alarm")).isDisplayed());
       
       System.out.println("Find my watch feature displayed "+d.findElement(AppiumBy.accessibilityId("Find my watch")).isDisplayed());

       System.out.println("BT calling feature displayed "+d.findElement(AppiumBy.accessibilityId("Bluetooth calling")).isDisplayed());

       System.out.println("Notifications features "+d.findElement(AppiumBy.accessibilityId("Notifications")).isDisplayed());
       
//     Watchfaces
       d.findElement(AppiumBy.accessibilityId("Watchfaces")).click();
       d.findElement(AppiumBy.iOSNsPredicateString("name == \"Cloud\"")).click();
       Thread.sleep(3000);
       d.findElement(AppiumBy.accessibilityId("Default")).click();
       Thread.sleep(2000);
       d.findElement(AppiumBy.accessibilityId("Back")).click();
       
//       Auto HR
       d.findElement(AppiumBy.accessibilityId("Auto monitoring heart rate")).click();
       
       WebElement HRtoggle = d.findElement(By.className("XCUIElementTypeSwitch"));
      
    	   HRtoggle.click();
    	   Thread.sleep(1000);
    	   d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Save Changes\"`]")).click();
    	   try {
  	  	     WebElement a = d.findElement(AppiumBy.iOSNsPredicateString("name == \"Ok\" AND label == \"Ok\" AND value == \"Ok\""));     
  	  	        if(a.isDisplayed()) {
  	  	        	a.click();
  	  	      
  	  	        }
  		    } catch (Exception e) {
  		   System.out.println("HR saved success popup not displayed");	
  		   }
    	   try {
  	  	     WebElement a = d.findElement(AppiumBy.iOSNsPredicateString("name == \"Ok\" AND label == \"Ok\" AND value == \"Ok\""));     
  	  	        if(a.isDisplayed()) {
  	  	        	a.click();
  	  	      
  	  	        }
  		    } catch (Exception e) {
  		   System.out.println("HR saved success popup not displayed");	
  		   } 	   
       
//    Sedentary reminder
      d.findElement(AppiumBy.accessibilityId("Sedentary reminder")).click();
      
      d.findElement(By.className("XCUIElementTypeSwitch")).click();
      
      sleep(3);
      
      d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save changes\"`]")).click();
      
      
      OK();
      
//      Alarm
      d.findElement(AppiumBy.accessibilityId("Alarm")).click();
      try {
    	  d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Add Alarm\"`]")).click();
    	  d.findElement(AppiumBy.accessibilityId("tickMark")).click();
    	  d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save Alarm\"`]")).click();
    	  OK();
    	  back(); 	  
      } catch (Exception e) {
    	  sleep(2);
    	  System.out.println("Already alarms present");
    	  back();	  
      }
       
//     Find My watch
      d.findElement(AppiumBy.accessibilityId("Find my watch")).click();
      d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Find my watch\"`]")).click();
      back();
      back();
      
      //Bluetooth calling
      d.findElement(AppiumBy.accessibilityId("Bluetooth calling")).click();
      
      System.out.println(d.findElement(AppiumBy.accessibilityId("Call Notification")).isDisplayed());
      
      back();
      
      
      //Notifications
      
      d.findElement(AppiumBy.accessibilityId("Notifications")).click();
      
      System.out.println("Call notification tab displayed: "+d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Call Notification\"`]")).isDisplayed());
	   
      d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Call Notification\"`]")).click();
	      
	   System.out.println("SMS notification tab displayed: "+d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"SMS Notification\"`]")).isDisplayed());
	      
	   d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"SMS Notification\"`]")).click();
	   
	   d.findElement(AppiumBy.iOSNsPredicateString("name == \"Save\" AND label == \"Save\" AND value == \"Save\"")).click();
	   
	   OK();
     
       d.findElement(AppiumBy.accessibilityId("Back")).click();
       
       Thread.sleep(2000);
       
//Watch control
       
       //Wake gesture includes schedules.
       
       d.findElement(AppiumBy.accessibilityId("Watch control")).click();
       
       d.findElement(AppiumBy.accessibilityId("Wake up gesture")).click();
       
       d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Wake up gesture\"`]")).click();
       
       d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Schedule\"`]")).click();
       
       d.findElement(AppiumBy.iOSNsPredicateString("name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();
       
       OK();
       
       //Formats & Units
       
       d.findElement(AppiumBy.accessibilityId("Formats & units")).click();
       
       d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"12-Hour Time\"`]")).click();
       
//       d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"24-Hour Time\"`]")).click();
       
       d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Kilometers unit\"`]")).click();
       
//       d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Miles unit\"`]")).click();
       
       d.findElement(AppiumBy.iOSNsPredicateString("name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

       OK();       
       
       //DND
       
       d.findElement(AppiumBy.accessibilityId("DND")).click();
       
       d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[1]")).click();
       
       d.findElement(AppiumBy.iOSNsPredicateString("name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

       OK();       
       
       back();
       
//     About Watch
       d.findElement(AppiumBy.accessibilityId("About watch")).click();
     
       System.out.println("Model Name is displayed: "+d.findElement(AppiumBy.accessibilityId("Model name")).isDisplayed());
    
       back();
    
       System.out.println("Watch software update tab displayed: "+d.findElement(AppiumBy.accessibilityId("Watch software update")).isDisplayed());
     
       d.findElement(AppiumBy.accessibilityId("Fitness")).click();
       
       d.findElement(AppiumBy.accessibilityId("Vital details")).click();
       
       sleep(2);
       
//      Steps
       
//       Days
       sleep(1);
       d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
       sleep(1);
       d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
       
//       Week
       sleep(1);

       d.findElement(AppiumBy.accessibilityId("Week")).click();
      
       d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
       
       d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
       
//       Month
       sleep(1);

       d.findElement(AppiumBy.accessibilityId("Month")).click();
       sleep(1);

       d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
       sleep(1);

       d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
       
//       HR
       d.findElement(AppiumBy.accessibilityId("Heart Rate")).click();
       sleep(1);

       d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
       sleep(1);
       d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
       
//       Week
       
       d.findElement(AppiumBy.accessibilityId("Week")).click();
       sleep(1);

       d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
       sleep(1);

       d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
       
//       Month
       
       d.findElement(AppiumBy.accessibilityId("Month")).click();
       sleep(1);

       d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
       sleep(1);

       d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
       
//       Sleep
       
       d.findElement(AppiumBy.accessibilityId("Sleep")).click();
       sleep(1);

       d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
       sleep(1);
       d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
       
//       Week
       
       d.findElement(AppiumBy.accessibilityId("Week")).click();
       sleep(1);

       d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
       sleep(1);

       d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
       
//       Month
       
       d.findElement(AppiumBy.accessibilityId("Month")).click();
       sleep(1);

       d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
       sleep(1);

       d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
       
//       Spo2
       d.findElement(AppiumBy.accessibilityId("SpO2")).click();
       sleep(1);

       d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
       sleep(1);
       d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
//      Energy Meter
      d.findElement(AppiumBy.accessibilityId("Energy Meter")).click();
        sleep(1);

       d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
       sleep(1);
       d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//     My watch
       d.findElement(AppiumBy.accessibilityId("My Watch")).click();
     
       d.findElement(AppiumBy.accessibilityId("Find my watch")).click();
     
       back();
     
       d.findElement(AppiumBy.accessibilityId("Change watch face")).click();
     
       d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Update on watch\"`]")).click();
     
       d.findElement(AppiumBy.accessibilityId("Cloud")).click();
     
       back();
 
       scroll("value", "Bluetooth Calling");
      
       
       d.findElement(AppiumBy.accessibilityId("Bluetooth Calling")).click();
     
       back();
    
       d.findElement(AppiumBy.accessibilityId("Home")).click();
       
        Thread.sleep(2000);
       
        d.findElement(AppiumBy.accessibilityId("Settings")).click();
       
        d.findElement(AppiumBy.accessibilityId("Watch status Connected")).click();
       
        d.findElement(AppiumBy.accessibilityId("Disconnect")).click();
       
        d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Disconnect\"`]")).click();
       
        d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"GOT IT\"`]")).click();
       
        System.out.println(d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Search here\"`]")).isDisplayed());
       
       
       d.quit();
    }
    
    
    public static void scroll(String AN,String AV) {
	     JavascriptExecutor js = (JavascriptExecutor) d;
	     Map<String, Object> params = new HashMap<>();
	     params.put("direction", "down");
	     params.put(AN,AV);
	     js.executeScript("mobile: scroll", params);
	}

}
