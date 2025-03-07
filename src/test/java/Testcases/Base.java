package Testcases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Base {
	
	public static IOSDriver d;
	public static AppiumDriverLocalService s;
	@BeforeTest
	public static void App_launch() throws MalformedURLException, InterruptedException, URISyntaxException {
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
	       
	       d = new IOSDriver(new URI("http://127.0.0.1:4723").toURL(),x);
	       d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       //locators - xpath,classname,ios,iosclasschain,iospredicateString,accessbility id,id
	       //For accessbility id - AppiumBy
	       Thread.sleep(5000);
		
	}
	
	
	@AfterTest
	public void close_app() {
	       d.quit();
	}
	
	
	
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
  		   System.out.println("HR saved success popup not displayed");	
  		   }
	}
	
	static void back() {
		d.findElement(AppiumBy.accessibilityId("Back")).click();
	}
	
	
	static void pairing(String Watch_name,String Watch_macid) throws InterruptedException {
		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Search here\"`]"))
		.sendKeys(Watch_name);

d.findElement(AppiumBy.accessibilityId(Watch_name)).click();

d.findElement(AppiumBy.accessibilityId("Continue")).click();

d.findElement(AppiumBy.accessibilityId(Watch_macid)).click();

d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Pair this device\"`]")).click();

Thread.sleep(40000);

WebElement c = d.findElement(AppiumBy.accessibilityId("Get started"));
if (c.isEnabled()) {
	c.click();
}

try {
	WebElement a = d.findElement(AppiumBy.accessibilityId("OK"));
	if (a.isDisplayed()) {
		a.click();

	}
} catch (Exception e) {
	System.out.println("Element not displayed");
}

Thread.sleep(30000);

try {
	WebElement b = d.findElement(AppiumBy.accessibilityId("closeBtn"));
	if (b.isDisplayed()) {
		b.click();
	}
} catch (Exception e) {
	System.out.println("Weekly report subscription popup not displayed");
}
	}
	
	static void ULC_pairing(String Watch_name,String Watch_macid) throws InterruptedException {
		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Search here\"`]"))
		.sendKeys(Watch_name);

d.findElement(AppiumBy.accessibilityId(Watch_name)).click();

d.findElement(AppiumBy.accessibilityId("Continue")).click();

d.findElement(AppiumBy.accessibilityId(Watch_macid)).click();

d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Pair this device\"`]")).click();

Thread.sleep(40000);

WebElement c = d.findElement(AppiumBy.accessibilityId("Get started"));
if (c.isEnabled()) {
	c.click();
}
Thread.sleep(20000);

try {
	WebElement b = d.findElement(AppiumBy.accessibilityId("closeBtn"));
	if (b.isDisplayed()) {
		b.click();
	}
} catch (Exception e) {
	System.out.println("Weekly report subscription popup not displayed");
}
	}
	
	static void Uprime_pairing(String Watch_name,String Watch_macid) throws InterruptedException {
		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Search here\"`]"))
		.sendKeys(Watch_name);

d.findElement(AppiumBy.accessibilityId(Watch_name)).click();

d.findElement(AppiumBy.accessibilityId("Continue")).click();

d.findElement(AppiumBy.accessibilityId(Watch_macid)).click();

d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Pair this device\"`]")).click();

Thread.sleep(40000);

WebElement c = d.findElement(AppiumBy.accessibilityId("Get started"));
if (c.isEnabled()) {
	c.click();
}
Thread.sleep(30000);

try {
	WebElement b = d.findElement(AppiumBy.accessibilityId("closeBtn"));
	if (b.isDisplayed()) {
		b.click();
	}
} catch (Exception e) {
	System.out.println("Weekly report subscription popup not displayed");
}
	}
	
	static void SC3plus_pairing(String Watch_name,String Watch_macid) throws InterruptedException {
	       
	      	d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Search here\"`]"))
	   	.sendKeys("Storm Call 3 Plus");

	   d.findElement(AppiumBy.accessibilityId("Storm Call 3 Plus")).click();

	   d.findElement(AppiumBy.accessibilityId("Continue")).click();

	   sleep(2);

	   d.findElement(AppiumBy.iOSNsPredicateString("name BEGINSWITH 'Pair with'")).click();

	   d.findElement(AppiumBy.accessibilityId("STORMCALL3+_0478")).click();

	   d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Pair this device\"`]")).click();

	   Thread.sleep(45000);

	   d.findElement(AppiumBy.accessibilityId("Get started")).click();;


	   Thread.sleep(30000);

	   try {
	   WebElement b = d.findElement(AppiumBy.accessibilityId("closeBtn"));
	   if (b.isDisplayed()) {
	   	b.click();
	   }
	   } catch (Exception e) {
	   System.out.println("Weekly report subscription popup not displayed");
	   }
	       }
	
	
	static void Hear_rate() throws InterruptedException {
        d.findElement(AppiumBy.accessibilityId("Auto monitoring heart rate")).click();
		
	    WebElement u = d.findElement(By.className("XCUIElementTypeSwitch"));
	    
	    @SuppressWarnings("deprecation")
		String hrtoggle = u.getAttribute("value").toString();
	    System.out.println(hrtoggle);
	    if(hrtoggle.equals("1")) {
	    	d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeImage[`name == \"unCheckCircle\"`][4]")).click();
	    	sleep(1);
	    	d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save Changes\"`]")).click();
	    	
	    	sleep(1);
	    	OK();
	    }else {
			u.click();
			sleep(1);
			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeImage[`name == \"unCheckCircle\"`][2]")).click();
			sleep(1);
			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save Changes\"`]")).click();
			
			sleep(1);
			
			OK();
			
			sleep(2);
			
			OK();
		}
	}
	
	static void Armour_Hear_rate() throws InterruptedException {
d.findElement(AppiumBy.accessibilityId("Auto monitoring heart rate")).click();
		
	    WebElement u = d.findElement(By.className("XCUIElementTypeSwitch"));
	    
	    @SuppressWarnings("deprecation")
		String hrtoggle = u.getAttribute("value").toString();
	    System.out.println(hrtoggle);
	    if(hrtoggle.equals("1")) {
	    	d.findElement(By.className("XCUIElementTypeSwitch")).click();
	    	sleep(1);
	    	d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save Changes\"`]")).click();
	    	
	    	sleep(1);
	    	OK();
	    }else {
			u.click();
			sleep(1);
			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save Changes\"`]")).click();
			
			sleep(1);
			
			OK();
			
			sleep(2);
			
			OK();
		}
	}
	public static void sed_rem() throws InterruptedException {

		d.findElement(AppiumBy.accessibilityId("Sedentary reminder")).click();

		d.findElement(By.className("XCUIElementTypeSwitch")).click();

		sleep(3);

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save changes\"`]")).click();

		OK();
	}
	
	public static void Sconnectplus_sed_rem() throws InterruptedException {

		d.findElement(AppiumBy.accessibilityId("Sedentary reminder")).click();

		String a = d.findElement(By.className("XCUIElementTypeSwitch")).getAttribute("value").toString();
		
		if(a.equals("0")) {
			d.findElement(By.className("XCUIElementTypeSwitch")).click();
			
			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Select All\"`]")).click();
			
			sleep(3);

			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save changes\"`]")).click();

			OK();
		}else {
			d.findElement(By.className("XCUIElementTypeSwitch")).click();
			
			sleep(3);

			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save changes\"`]")).click();

			OK();
		}

		
	}
	public static void Alarm_feature() throws InterruptedException {
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
	}
	
	
	public static void Sconnectplus_Alarm_feature() throws InterruptedException {
		d.findElement(AppiumBy.accessibilityId("Alarm")).click();
		try {
			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Add Alarm\"`]")).click();
			d.findElement(AppiumBy.accessibilityId("tickMark")).click();
			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"S\"`][1]")).click();
			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save Alarm\"`]")).click();
			OK();
			back();
		} catch (Exception e) {
			sleep(2);
			System.out.println("Already alarms present");
			back();
		}
	
	}
	
	public static void Find_my_watch_feature() {
		d.findElement(AppiumBy.accessibilityId("Find my watch")).click();
		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Find my watch\"`]")).click();
		back();
		back();
	}
	
	public static void Sconnect_Find_my_watch_feature() {
		d.findElement(AppiumBy.accessibilityId("Find my watch")).click();
		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Find my watch\"`]")).click();
		back();
	}
	
	public static void Bluetooth_calling_Feature() throws InterruptedException {
		sleep(1);
		d.findElement(AppiumBy.accessibilityId("Bluetooth calling")).click();
		try {
			System.out.println("Call notification displayed "+d.findElement(AppiumBy.accessibilityId("Call Notification")).isDisplayed());
		} catch (Exception e) {
			System.out.println("Call notification not displayed");
		}
		
		back();

	}
	
	public static void Notifications_feature() throws InterruptedException {

		d.findElement(AppiumBy.accessibilityId("Notifications")).click();

		System.out.println("Call notification tab displayed: "
				+ d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Call Notification\"`]"))
						.isDisplayed());

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Call Notification\"`]")).click();

		System.out.println("SMS notification tab displayed: "
				+ d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"SMS Notification\"`]"))
						.isDisplayed());

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"SMS Notification\"`]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString("name == \"Save\" AND label == \"Save\" AND value == \"Save\""))
				.click();

		OK();

		d.findElement(AppiumBy.accessibilityId("Back")).click();

		Thread.sleep(2000);
	}
	
	public static void CY_Notifications_feature() throws InterruptedException {
		
		sleep(2);

		d.findElement(AppiumBy.accessibilityId("Notifications")).click();

		System.out.println("Call notification tab displayed: "
				+ d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Call Notification\"`]"))
						.isDisplayed());

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Call Notification\"`]")).click();

		System.out.println("SMS notification tab displayed: "
				+ d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"SMS Notification\"`]"))
						.isDisplayed());

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"SMS Notification\"`]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString("name == \"Save\" AND label == \"Save\" AND value == \"Save\""))
				.click();

		OK();


		Thread.sleep(2000);
	}
	
	public static void ULC2BT_Watch_control() throws InterruptedException {

		// Wake gesture includes schedules.

		d.findElement(AppiumBy.accessibilityId("Watch control")).click();

		d.findElement(AppiumBy.accessibilityId("Wake up gesture")).click();
		sleep(3);

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Wake up gesture\"`]")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Schedule\"`]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		// Formats & Units

		d.findElement(AppiumBy.accessibilityId("Formats & units")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"12-Hour Time\"`]")).click();

//  d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"24-Hour Time\"`]")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Kilometers unit\"`]")).click();

//  d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Miles unit\"`]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		// DND

		d.findElement(AppiumBy.accessibilityId("DND")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[1]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		back();
	}
	
	public static void ULC_Watch_control() throws InterruptedException {

		// Wake gesture includes schedules.

		d.findElement(AppiumBy.accessibilityId("Watch control")).click();

		d.findElement(AppiumBy.accessibilityId("Wake up gesture")).click();
		sleep(3);

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Wake up gesture\"`]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		// Formats & Units

		d.findElement(AppiumBy.accessibilityId("Formats & units")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"12-Hour Time\"`]")).click();

//  d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"24-Hour Time\"`]")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Kilometers unit\"`]")).click();

//  d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Miles unit\"`]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		// DND

		d.findElement(AppiumBy.accessibilityId("DND")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[1]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		back();
	}
	
	public static void CZ_Watch_control() throws InterruptedException {

		// Wake gesture includes schedules.

		d.findElement(AppiumBy.accessibilityId("Watch control")).click();

		d.findElement(AppiumBy.accessibilityId("Wake up gesture")).click();
		sleep(3);

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Wake up gesture\"`]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		// Formats & Units

		d.findElement(AppiumBy.accessibilityId("Formats & units")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"12-Hour Time\"`]")).click();


		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Kilometers unit\"`]")).click();

        d.findElement(AppiumBy.accessibilityId("Wind speed will be shown in Miles per hour (mps), Fahrenheit")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		// DND

		d.findElement(AppiumBy.accessibilityId("DND")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[1]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		back();
	}


	public static void ULC_vitals() throws InterruptedException {
		d.findElement(AppiumBy.accessibilityId("Fitness")).click();

		d.findElement(AppiumBy.accessibilityId("Vital details")).click();

		sleep(2);

// Steps

//  Days
		sleep(1);
		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Week
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("Week")).click();

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Month
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("Month")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  HR
		d.findElement(AppiumBy.accessibilityId("Heart Rate")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Week

		d.findElement(AppiumBy.accessibilityId("Week")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Month

		d.findElement(AppiumBy.accessibilityId("Month")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Sleep

		d.findElement(AppiumBy.accessibilityId("Sleep")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Week

		d.findElement(AppiumBy.accessibilityId("Week")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Month

		d.findElement(AppiumBy.accessibilityId("Month")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Spo2
		d.findElement(AppiumBy.accessibilityId("SpO2")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
// Energy Meter
		d.findElement(AppiumBy.accessibilityId("Energy Meter")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
	}
	
	public static void CZ_vitals() throws InterruptedException {
		d.findElement(AppiumBy.accessibilityId("Fitness")).click();

		d.findElement(AppiumBy.accessibilityId("Vital details")).click();

		sleep(2);

// Steps

//  Days
		sleep(1);
		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Week
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("Week")).click();

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Month
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("Month")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  HR
		d.findElement(AppiumBy.accessibilityId("Heart Rate")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Week

		d.findElement(AppiumBy.accessibilityId("Week")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Month

		d.findElement(AppiumBy.accessibilityId("Month")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
		
//Temperature
		d.findElement(AppiumBy.accessibilityId("Temperature")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();		

//  Sleep

		d.findElement(AppiumBy.accessibilityId("Sleep")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Week

		d.findElement(AppiumBy.accessibilityId("Week")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Month

		d.findElement(AppiumBy.accessibilityId("Month")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
		
		scroll("value", "Energy Meter","right");

//  Spo2
		d.findElement(AppiumBy.accessibilityId("SpO2")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
// Energy Meter
		d.findElement(AppiumBy.accessibilityId("Energy Meter")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
	}
	
	public static void CY_vitals() throws InterruptedException {
		d.findElement(AppiumBy.accessibilityId("Fitness")).click();

		d.findElement(AppiumBy.accessibilityId("Vital details")).click();

		sleep(2);

// Steps

//  Days
		sleep(1);
		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Week
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("Week")).click();

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Month
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("Month")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  HR
		d.findElement(AppiumBy.accessibilityId("Heart Rate")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Week

		d.findElement(AppiumBy.accessibilityId("Week")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Month

		d.findElement(AppiumBy.accessibilityId("Month")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
		
		
//  HRV
			d.findElement(AppiumBy.accessibilityId("HRV")).click();
			sleep(1);

			d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
			sleep(1);
			d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

    //  Week

			d.findElement(AppiumBy.accessibilityId("Week")).click();
			sleep(1);

			d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
			sleep(1);

			d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

	//  Month

			d.findElement(AppiumBy.accessibilityId("Month")).click();
			sleep(1);

			d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
			sleep(1);

			d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();


//  Sleep

		d.findElement(AppiumBy.accessibilityId("Sleep")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Week

		d.findElement(AppiumBy.accessibilityId("Week")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Month

		d.findElement(AppiumBy.accessibilityId("Month")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

		scroll("value", "Stress Level", "right");
		
//Nightly Breathing Rate
		  d.findElement(AppiumBy.iOSNsPredicateString("name  BEGINSWITH 'Nightly'")).click();
		
			sleep(1);

			d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
			sleep(1);
			d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

	//  Week

			d.findElement(AppiumBy.accessibilityId("Week")).click();
			sleep(1);

			d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
			sleep(1);

			d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

	//  Month

			d.findElement(AppiumBy.accessibilityId("Month")).click();
			sleep(1);

			d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
			sleep(1);

			d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
			
//  Spo2
			d.findElement(AppiumBy.accessibilityId("SpO2")).click();
			sleep(1);

			d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
			sleep(1);
			d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
			
			sleep(1);

// Energy Meter
		d.findElement(AppiumBy.accessibilityId("Energy Meter")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
	
//Stress Level
	d.findElement(AppiumBy.accessibilityId("Stress Level")).click();
	sleep(1);

	d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
	sleep(1);
	d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Week

	d.findElement(AppiumBy.accessibilityId("Week")).click();
	sleep(1);

	d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
	sleep(1);

	d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Month

	d.findElement(AppiumBy.accessibilityId("Month")).click();
	sleep(1);

	d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
	sleep(1);

	d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
	}
	
	
	public static void Sconnectplus_vitals() throws InterruptedException {
		d.findElement(AppiumBy.accessibilityId("Fitness")).click();

		d.findElement(AppiumBy.accessibilityId("Vital details")).click();

		sleep(2);

// Steps

//  Days
		sleep(1);
		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Week
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("Week")).click();

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Month
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("Month")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  HR
		d.findElement(AppiumBy.accessibilityId("Heart Rate")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Week

		d.findElement(AppiumBy.accessibilityId("Week")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Month

		d.findElement(AppiumBy.accessibilityId("Month")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
		
		
//  Sleep

		d.findElement(AppiumBy.accessibilityId("Sleep")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Week

		d.findElement(AppiumBy.accessibilityId("Week")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Month

		d.findElement(AppiumBy.accessibilityId("Month")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

		scroll("value", "Stress Level", "right");
	
//Stress Level
	d.findElement(AppiumBy.accessibilityId("Stress Level")).click();
	sleep(1);

	d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
	sleep(1);
	d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Week

	d.findElement(AppiumBy.accessibilityId("Week")).click();
	sleep(1);

	d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
	sleep(1);

	d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Month

	d.findElement(AppiumBy.accessibilityId("Month")).click();
	sleep(1);

	d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
	sleep(1);

	d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
	
	
//  Spo2
			d.findElement(AppiumBy.accessibilityId("SpO2")).click();
			sleep(1);

			d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
			sleep(1);
			d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
			
			sleep(1);
			
			
	}
	
	public static void Armour2_vitals() throws InterruptedException {
		d.findElement(AppiumBy.accessibilityId("Fitness")).click();

		d.findElement(AppiumBy.accessibilityId("Vital details")).click();

		sleep(2);

// Steps

//  Days
		sleep(1);
		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Week
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("Week")).click();

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Month
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("Month")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  HR
		d.findElement(AppiumBy.accessibilityId("Heart Rate")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Week

		d.findElement(AppiumBy.accessibilityId("Week")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Month

		d.findElement(AppiumBy.accessibilityId("Month")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
		
		
//  Sleep

		d.findElement(AppiumBy.accessibilityId("Sleep")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);
		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Week

		d.findElement(AppiumBy.accessibilityId("Week")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();

//  Month

		d.findElement(AppiumBy.accessibilityId("Month")).click();
		sleep(1);

		d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
		sleep(1);

		d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
	
	
//  Spo2
			d.findElement(AppiumBy.accessibilityId("SpO2")).click();
			sleep(1);

			d.findElement(AppiumBy.accessibilityId("shareIcon")).click();
			sleep(1);
			d.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
			
			sleep(1);
			
			
	}
	
	public static void ULC2BT_My_watch() throws InterruptedException {
		d.findElement(AppiumBy.accessibilityId("My Watch")).click();

		d.findElement(AppiumBy.accessibilityId("Find my watch")).click();

		back();

		d.findElement(AppiumBy.accessibilityId("Change watch face")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Update on watch\"`]")).click();

		d.findElement(AppiumBy.accessibilityId("Cloud")).click();

		back();

		scroll("value", "Bluetooth Calling","down");

		d.findElement(AppiumBy.accessibilityId("Bluetooth Calling")).click();
		
		sleep(2);

		back();
		
		sleep(2);

		d.findElement(AppiumBy.accessibilityId("Home")).click();

	}
	
	public static void ULC5BT_My_watch() throws InterruptedException {
		d.findElement(AppiumBy.accessibilityId("My Watch")).click();

		d.findElement(AppiumBy.accessibilityId("Find my watch")).click();

		back();

		d.findElement(AppiumBy.accessibilityId("Change watch face")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Update on watch\"`]")).click();

		d.findElement(AppiumBy.accessibilityId("Cloud")).click();

		back();

		scroll("value", "Bluetooth Calling","down");

		d.findElement(AppiumBy.accessibilityId("Bluetooth Calling")).click();
		
		sleep(2);

		back();
		
		sleep(2);
		
		
		   try {
			
			   d.findElement(AppiumBy.accessibilityId("View Activities")).click();
			   sleep(1);
			   
			d.findElement(AppiumBy.accessibilityId("checkMarkWhite")).click();

			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Done\"`]")).click();
			
			sleep(2);
			
			back();
		} catch (Exception e) {
			System.out.println("1K popup not displayed");
		}
			
			sleep(3);
			
			back();
	

		d.findElement(AppiumBy.accessibilityId("Home")).click();

	}
	
	public static void ULC_My_watch() throws InterruptedException {
		d.findElement(AppiumBy.accessibilityId("My Watch")).click();

		d.findElement(AppiumBy.accessibilityId("Find my watch")).click();

		back();

		d.findElement(AppiumBy.accessibilityId("Change watch face")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Update on watch\"`]")).click();

		d.findElement(AppiumBy.accessibilityId("Cloud")).click();

		back();
		sleep(2);

		d.findElement(AppiumBy.accessibilityId("Home")).click();

	}
	
	
	public static void CY_My_watch() throws InterruptedException {
		 d.findElement(AppiumBy.accessibilityId("My Watch")).click();
			
			sleep(2);

			d.findElement(AppiumBy.accessibilityId("Find my watch")).click();

			back();

			d.findElement(AppiumBy.accessibilityId("Change watch face")).click();
			sleep(1);

			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Update on watch\"`]")).click();

			d.findElement(AppiumBy.accessibilityId("Cloud")).click();

			back();
			
			sleep(2);

			scroll("value", "Bluetooth Calling","down");
			
//			scroll("value", "Bluetooth Calling","up");
			try {
				d.findElement(AppiumBy.accessibilityId("Alarms")).click();
				
				back();
			} catch (Exception e) {
				System.out.println("Alarms tab not found");
			}
			
			try {
				d.findElement(AppiumBy.accessibilityId("Custom reminder")).click();
				
				back();
				
				back();
			} catch (Exception e) {
				System.out.println("Reminders tab not found");
			}
			
			

		   d.findElement(AppiumBy.accessibilityId("Bluetooth Calling")).click();
		   sleep(1);
		   back();
		   
		   
		   
			sleep(10);
			
		   try {
			
			   d.findElement(AppiumBy.accessibilityId("View Activities")).click();
			   sleep(1);
			   
			d.findElement(AppiumBy.accessibilityId("checkMarkWhite")).click();

			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Done\"`]")).click();
			
			sleep(2);
			
			back();
		} catch (Exception e) {
			System.out.println("1K popup not displayed");
		}
			
			sleep(3);
				}
	
	public static void Sconnectplus_My_watch() throws InterruptedException {
		 d.findElement(AppiumBy.accessibilityId("My Watch")).click();
			
			sleep(2);

			d.findElement(AppiumBy.accessibilityId("Find my watch")).click();

			back();

			d.findElement(AppiumBy.accessibilityId("Change watch face")).click();
			sleep(1);

			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Update on watch\"`]")).click();

			d.findElement(AppiumBy.accessibilityId("Cloud")).click();

			back();
			
			sleep(2);

			scroll("value", "Bluetooth Calling","down");
			
//			scroll("value", "Bluetooth Calling","up");
			
			

			  d.findElement(AppiumBy.accessibilityId("Bluetooth Calling")).click();
			   sleep(2);
			   back();	
			   
			   sleep(3);
			try {
				d.findElement(AppiumBy.accessibilityId("Alarms")).click();
				
				back();
			} catch (Exception e) {
				System.out.println("Alarms tab not found");
			}
			
			try {
				d.findElement(AppiumBy.accessibilityId("Event reminder")).click();
				
				back();
				
			} catch (Exception e) {
				System.out.println("Reminders tab not found");
			}
			
	}
	
	public static void Lconnectace_My_watch() throws InterruptedException {
		 d.findElement(AppiumBy.accessibilityId("My Watch")).click();
			
			sleep(2);

			d.findElement(AppiumBy.accessibilityId("Change watch face")).click();
			sleep(1);

			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Update on watch\"`]")).click();

			d.findElement(AppiumBy.accessibilityId("Cloud")).click();

			back();
			
			sleep(2);

			scroll("value", "Bluetooth Calling","down");
			
//			scroll("value", "Bluetooth Calling","up");
			
			

			  d.findElement(AppiumBy.accessibilityId("Bluetooth Calling")).click();
			   sleep(2);
			   back();	
			   
			   sleep(3);
			try {
				d.findElement(AppiumBy.accessibilityId("Alarms")).click();
				
				back();
			} catch (Exception e) {
				System.out.println("Alarms tab not found");
			}
			
	}
	public static void Uprime_My_watch() throws InterruptedException {
		 d.findElement(AppiumBy.accessibilityId("My Watch")).click();
			
			sleep(2);

			d.findElement(AppiumBy.accessibilityId("Change watch face")).click();
			sleep(5);

			back();
			
			sleep(5);

			scroll("value", "Bluetooth Calling","down");
			
//			scroll("value", "Bluetooth Calling","up");
			
			

			  d.findElement(AppiumBy.accessibilityId("Bluetooth Calling")).click();
			   sleep(2);
			   back();	
			   
			   sleep(3);
			try {
				d.findElement(AppiumBy.accessibilityId("Alarms")).click();
				
				back();
			} catch (Exception e) {
				System.out.println("Alarms tab not found");
			}
			
	}
	
	public static void Armour2_My_watch() throws InterruptedException {
		 d.findElement(AppiumBy.accessibilityId("My Watch")).click();
			
			sleep(2);

			d.findElement(AppiumBy.accessibilityId("Change watch face")).click();
			sleep(5);

			back();
			
			sleep(5);
			
			d.findElement(AppiumBy.accessibilityId("Find my watch")).click();

			back();

			scroll("value", "Bluetooth Calling","down");
			
//			scroll("value", "Bluetooth Calling","up");
			
			

			  d.findElement(AppiumBy.accessibilityId("Bluetooth Calling")).click();
			   sleep(2);
			   back();	
			   
			   sleep(3);
		
	}
	public static void CZ_My_watch() throws InterruptedException {
		 d.findElement(AppiumBy.accessibilityId("My Watch")).click();
			
			sleep(2);

			d.findElement(AppiumBy.accessibilityId("Find my watch")).click();

			back();

			d.findElement(AppiumBy.accessibilityId("Change watch face")).click();
			sleep(1);

			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Update on watch\"`]")).click();

			d.findElement(AppiumBy.accessibilityId("Cloud")).click();

			back();
			
			sleep(2);

			scroll("value", "Wave Prime features","down");
			
			try {
				d.findElement(AppiumBy.accessibilityId("Alarms")).click();
				
				back();
			} catch (Exception e) {
				System.out.println("Alarms tab not found");
			}
			
			
		   try {
			
			   d.findElement(AppiumBy.accessibilityId("View Activities")).click();
			   sleep(1);
			   
			d.findElement(AppiumBy.accessibilityId("checkMarkWhite")).click();

			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Done\"`]")).click();
			
			sleep(2);
			
			back();
		} catch (Exception e) {
			System.out.println("1K popup not displayed");
		}
			
			sleep(3);
			
			back();
	}
	
	public static void SC3Plus_Mywatch() throws InterruptedException {
	      sleep(2);
	      
			d.findElement(AppiumBy.accessibilityId("My Watch")).click();

			d.findElement(AppiumBy.accessibilityId("Change watch face")).click();

			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Update on watch\"`]")).click();

			d.findElement(AppiumBy.accessibilityId("Cloud")).click();

			back();
			
			d.findElement(AppiumBy.accessibilityId("Emergency SOS")).click();
			
			sleep(1);
			
			back();
			
			scroll("value", "Find my watch","down");
			
			d.findElement(AppiumBy.accessibilityId("Find my watch")).click();

			back();


			d.findElement(AppiumBy.accessibilityId("Bluetooth Calling")).click();
			
			sleep(2);

			back();
			
			   try {
					
				   d.findElement(AppiumBy.accessibilityId("View Activities")).click();
				   sleep(1);
				   
				d.findElement(AppiumBy.accessibilityId("checkMarkWhite")).click();

				d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Done\"`]")).click();
				
				sleep(2);
				
				back();
			} catch (Exception e) {
				System.out.println("1K popup not displayed");
			}
				
				sleep(3);
				
				back();
			
			sleep(2);

			d.findElement(AppiumBy.accessibilityId("Home")).click();
	       
	       
	       
	       
	}
	//Fit crew
	
	public static void Fitcrew() throws InterruptedException {
		sleep(1);
	    d.findElement(AppiumBy.accessibilityId("Fit Crew")).click();
	    
	    sleep(3);
	    
	    d.findElement(AppiumBy.accessibilityId("Messages")).click();
	    
	    sleep(2);
	    
	    
	    d.findElement(AppiumBy.accessibilityId("Home")).click();
	    
	}
	public static void WatchFaceStudio_feature() throws InterruptedException {
		sleep(2);
		d.findElement(AppiumBy.iOSClassChain(
				"**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[1]"))
				.click();

		sleep(3);

		try {
			d.findElement(AppiumBy.accessibilityId("Skip")).click();
		} catch (Exception e) {
			System.out.println("Skip not displayed");
		}

		d.findElement(AppiumBy.accessibilityId("Save")).click();

		sleep(2);

		d.findElement(AppiumBy.accessibilityId("Apply Now")).click();

		sleep(15);

		d.findElement(AppiumBy
				.iOSNsPredicateString("name == \"Okay\" AND label == \"Okay\" AND type == \"XCUIElementTypeButton\""))
				.click();

		try {
			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Later\"`]")).click();
		} catch (Exception e) {
			System.out.println("Rate us popup not displayed");
		}

		try {
			back();
		} catch (Exception e) {
			System.out.println("Back button not displayed");
		}

	}
	public static void WatchFaceStudio_feature_SC3Plus() throws InterruptedException {
		sleep(2);
		d.findElement(AppiumBy.iOSClassChain(""
	       		+ "**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/"
	       		+ "XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"
	       		+ "/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]")).click();

		sleep(3);

		try {
			d.findElement(AppiumBy.accessibilityId("Skip")).click();
		} catch (Exception e) {
			System.out.println("Skip not displayed");
		}

		d.findElement(AppiumBy.accessibilityId("Save")).click();

		sleep(2);

		d.findElement(AppiumBy.accessibilityId("Apply Now")).click();

		sleep(15);

		d.findElement(AppiumBy
				.iOSNsPredicateString("name == \"Okay\" AND label == \"Okay\" AND type == \"XCUIElementTypeButton\""))
				.click();

		try {
			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Later\"`]")).click();
		} catch (Exception e) {
			System.out.println("Rate us popup not displayed");
		}

		try {
			back();
		} catch (Exception e) {
			System.out.println("Back button not displayed");
		}

	}
	
	public static void watch_disconnection_feature() throws InterruptedException {

		Thread.sleep(2000);

		d.findElement(AppiumBy.accessibilityId("Settings")).click();
		
		d.findElement(AppiumBy.accessibilityId("Watch settings")).click();

		d.findElement(AppiumBy.accessibilityId("Watch status Connected")).click();

		d.findElement(AppiumBy.accessibilityId("Disconnect")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Disconnect\"`]")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"GOT IT\"`]")).click();

	}
	
	public static void Ultima_prime_watch_disconnection_feature() throws InterruptedException {

		Thread.sleep(2000);

		d.findElement(AppiumBy.accessibilityId("Settings")).click();
		
		d.findElement(AppiumBy.accessibilityId("Watch settings")).click();

		d.findElement(AppiumBy.accessibilityId("Watch status Connected")).click();

		d.findElement(AppiumBy.accessibilityId("Disconnect")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Disconnect\"`]")).click();
		
		sleep(15);

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"GOT IT\"`]")).click();
	}
    public static void ULC2BT_Home_dasboard_components_Check(String watchname) {
		System.out.println("Home icon displayed " + d.findElement(AppiumBy.accessibilityId("Home")).isDisplayed());
		System.out
				.println("Fitness icon displayed " + d.findElement(AppiumBy.accessibilityId("Fitness")).isDisplayed());
		System.out.println(
				"My watch icon displayed " + d.findElement(AppiumBy.accessibilityId("My Watch")).isDisplayed());
		System.out.println("Fit crew displayed " + d.findElement(AppiumBy.accessibilityId("Fit Crew")).isDisplayed());
		System.out.println(
				"Settings icon displayed " + d.findElement(AppiumBy.accessibilityId("Settings")).isDisplayed());
		System.out.println("boAt logo displayed " + d.findElement(AppiumBy.accessibilityId("Logo")).isDisplayed());
		System.out.println(watchname+" Watch text displayed "
				+ d.findElement(AppiumBy.accessibilityId(watchname)).isDisplayed());
		System.out.println(
				"Connected status displayed " + d.findElement(AppiumBy.accessibilityId("Connected")).isDisplayed());
		System.out.println(
				"BT calling supported text " + d.findElement(AppiumBy.accessibilityId("BT calling")).isDisplayed());

	}
    
    public static void ULC_Home_dasboard_components_Check(String watchname) {
		System.out.println("Home icon displayed " + d.findElement(AppiumBy.accessibilityId("Home")).isDisplayed());
		System.out
				.println("Fitness icon displayed " + d.findElement(AppiumBy.accessibilityId("Fitness")).isDisplayed());
		System.out.println(
				"My watch icon displayed " + d.findElement(AppiumBy.accessibilityId("My Watch")).isDisplayed());
		System.out.println("Fit crew displayed " + d.findElement(AppiumBy.accessibilityId("Fit Crew")).isDisplayed());
		System.out.println(
				"Settings icon displayed " + d.findElement(AppiumBy.accessibilityId("Settings")).isDisplayed());
		System.out.println("boAt logo displayed " + d.findElement(AppiumBy.accessibilityId("Logo")).isDisplayed());
		System.out.println(watchname+" Watch text displayed "
				+ d.findElement(AppiumBy.accessibilityId(watchname)).isDisplayed());
		System.out.println(
				"Connected status displayed " + d.findElement(AppiumBy.accessibilityId("Connected")).isDisplayed());
    }
    public void ULC_Home_dasboard_components_Check() {
		System.out.println("Home icon displayed " + d.findElement(AppiumBy.accessibilityId("Home")).isDisplayed());
		System.out
				.println("Fitness icon displayed " + d.findElement(AppiumBy.accessibilityId("Fitness")).isDisplayed());
		System.out.println(
				"My watch icon displayed " + d.findElement(AppiumBy.accessibilityId("My Watch")).isDisplayed());
		System.out.println("Fit crew displayed " + d.findElement(AppiumBy.accessibilityId("Fit Crew")).isDisplayed());
		System.out.println(
				"Settings icon displayed " + d.findElement(AppiumBy.accessibilityId("Settings")).isDisplayed());
		System.out.println("boAt logo displayed " + d.findElement(AppiumBy.accessibilityId("Logo")).isDisplayed());
		System.out.println("Wave smart call Watch text displayed "
				+ d.findElement(AppiumBy.accessibilityId("Wave Smart Call")).isDisplayed());
		System.out.println(
				"Connected status displayed " + d.findElement(AppiumBy.accessibilityId("Connected")).isDisplayed());
		System.out.println(
				"BT calling supported text " + d.findElement(AppiumBy.accessibilityId("BT calling")).isDisplayed());

	}
    
    public void ULC2BT_Settings_Features_Display_Check() throws InterruptedException {
		Thread.sleep(5000);

		d.findElement(AppiumBy.accessibilityId("Settings")).click();

		d.findElement(AppiumBy.accessibilityId("Watch features")).click();

		System.out.println(
				"Watch faces Tab displayed " + d.findElement(AppiumBy.accessibilityId("Watchfaces")).isDisplayed());

		System.out.println("Auto HR feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Auto monitoring heart rate")).isDisplayed());

		System.out.println("Sedentary reminder feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Sedentary reminder")).isDisplayed());

		System.out.println("Alarm feature displayed " + d.findElement(AppiumBy.accessibilityId("Alarm")).isDisplayed());

		System.out.println("Find my watch feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Find my watch")).isDisplayed());

		System.out.println("BT calling feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Bluetooth calling")).isDisplayed());

		System.out.println(
				"Notifications features " + d.findElement(AppiumBy.accessibilityId("Notifications")).isDisplayed());

		Thread.sleep(2000);
	}
    
    public void ULC5BT_Settings_Features_Display_Check() throws InterruptedException {
		Thread.sleep(5000);

		d.findElement(AppiumBy.accessibilityId("Settings")).click();

		d.findElement(AppiumBy.accessibilityId("Watch features")).click();

		System.out.println(
				"Watch faces Tab displayed " + d.findElement(AppiumBy.accessibilityId("Watchfaces")).isDisplayed());

		System.out.println("Auto HR feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Auto monitoring heart rate")).isDisplayed());

		System.out.println("Sedentary reminder feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Sedentary reminder")).isDisplayed());

		System.out.println("Alarm feature displayed " + d.findElement(AppiumBy.accessibilityId("Alarm")).isDisplayed());
		
		System.out.println("Nudges feature displayed " + d.findElement(AppiumBy.accessibilityId("Nudges")).isDisplayed());

		System.out.println("Find my watch feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Find my watch")).isDisplayed());

		System.out.println("BT calling feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Bluetooth calling")).isDisplayed());

		System.out.println(
				"Notifications features " + d.findElement(AppiumBy.accessibilityId("Notifications")).isDisplayed());
		
		scroll("value","QR Tray","down");
		
		System.out.println("Alarm feature displayed " + d.findElement(AppiumBy.accessibilityId("QR Tray")).isDisplayed());
		
		scroll("value","Watchfaces","up");

		Thread.sleep(2000);
	}
    
    public void ULC_Settings_Features_Display_Check() throws InterruptedException {
		Thread.sleep(5000);

		d.findElement(AppiumBy.accessibilityId("Settings")).click();

		d.findElement(AppiumBy.accessibilityId("Watch features")).click();

		System.out.println(
				"Watch faces Tab displayed " + d.findElement(AppiumBy.accessibilityId("Watchfaces")).isDisplayed());

		System.out.println("Auto HR feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Auto monitoring heart rate")).isDisplayed());

		System.out.println("Sedentary reminder feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Sedentary reminder")).isDisplayed());

		System.out.println("Alarm feature displayed " + d.findElement(AppiumBy.accessibilityId("Alarm")).isDisplayed());

		System.out.println("Find my watch feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Find my watch")).isDisplayed());
		System.out.println(
				"Notifications features " + d.findElement(AppiumBy.accessibilityId("Notifications")).isDisplayed());

		Thread.sleep(2000);
	}
    public void CZ_Settings_Features_Display_Check() throws InterruptedException {
		Thread.sleep(5000);

		d.findElement(AppiumBy.accessibilityId("Settings")).click();

		d.findElement(AppiumBy.accessibilityId("Watch features")).click();

		System.out.println(
				"Watch faces Tab displayed " + d.findElement(AppiumBy.accessibilityId("Watchfaces")).isDisplayed());

		System.out.println("Auto HR feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Auto monitoring heart rate")).isDisplayed());

		System.out.println("Sedentary reminder feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Sedentary reminder")).isDisplayed());

		System.out.println("Alarm feature displayed " + d.findElement(AppiumBy.accessibilityId("Alarm")).isDisplayed());

		System.out.println("Find my watch feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Find my watch")).isDisplayed());
		System.out.println(
				"Notifications features " + d.findElement(AppiumBy.accessibilityId("Notifications")).isDisplayed());
		System.out.println(
				"Weather settings " + d.findElement(AppiumBy.accessibilityId("Weather settings")).isDisplayed());


		Thread.sleep(2000);
	}
    
    public void CY_Settings_Features_Display_Check() throws InterruptedException {
		Thread.sleep(5000);

		d.findElement(AppiumBy.accessibilityId("Settings")).click();

		d.findElement(AppiumBy.accessibilityId("Watch features")).click();

		System.out.println(
				"Watch faces Tab displayed " + d.findElement(AppiumBy.accessibilityId("Watchfaces")).isDisplayed());

		System.out.println("Auto HR feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Auto monitoring heart rate")).isDisplayed());
		
		System.out.println("Auto stress & HRV monitoring displayed "
				+ d.findElement(AppiumBy.accessibilityId("Auto stress & HRV monitoring")).isDisplayed());
		
		System.out.println("Nightly breathing rate displayed "
				+ d.findElement(AppiumBy.accessibilityId("Nightly breathing rate")).isDisplayed());
		
		System.out.println("AAD displayed "
				+ d.findElement(AppiumBy.accessibilityId("Auto activity detection")).isDisplayed());

		System.out.println("Sedentary reminder feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Sedentary reminder")).isDisplayed());

		System.out.println("Alarm feature displayed " + d.findElement(AppiumBy.accessibilityId("Alarm")).isDisplayed());
        
		
		scroll("value","QR tray","down");
		
		System.out.println("Nudges displayed "
				+ d.findElement(AppiumBy.accessibilityId("Nudges")).isDisplayed());
		
		System.out.println("Custom reminder displayed "
				+ d.findElement(AppiumBy.accessibilityId("Custom reminder")).isDisplayed());
		
		System.out.println("Find my watch feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Find my watch")).isDisplayed());

		System.out.println("BT calling feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Bluetooth calling")).isDisplayed());

		System.out.println(
				"Notifications features " + d.findElement(AppiumBy.accessibilityId("Notifications")).isDisplayed());
		
		System.out.println("Weather settings displayed "
				+ d.findElement(AppiumBy.accessibilityId("Weather settings")).isDisplayed());
		
		System.out.println("QR Tray displayed "
				+ d.findElement(AppiumBy.accessibilityId("QR Tray")).isDisplayed());
		
		System.out.println("SensAI displayed "
				+ d.findElement(AppiumBy.accessibilityId("SensAI")).isDisplayed());
		
		scroll("value","Watchfaces","up");

		Thread.sleep(2000);
	}
    
    public void Sconnectplus_Settings_Features_Display_Check() throws InterruptedException {
		Thread.sleep(5000);

		d.findElement(AppiumBy.accessibilityId("Settings")).click();

		d.findElement(AppiumBy.accessibilityId("Watch features")).click();

		System.out.println(
				"Watch faces Tab displayed " + d.findElement(AppiumBy.accessibilityId("Watchfaces")).isDisplayed());

		System.out.println("Auto HR feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Auto monitoring heart rate")).isDisplayed());
		
		System.out.println("Auto stress & HRV monitoring displayed "
				+ d.findElement(AppiumBy.accessibilityId("Auto stress measurement")).isDisplayed());
		
		System.out.println("Nightly breathing rate displayed "
				+ d.findElement(AppiumBy.accessibilityId("Auto spo2 measurements")).isDisplayed());

		System.out.println("Sedentary reminder feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Sedentary reminder")).isDisplayed());

		System.out.println("Alarm feature displayed " + d.findElement(AppiumBy.accessibilityId("Alarm")).isDisplayed());
		
		System.out.println("Event reminder feature displayed " + d.findElement(AppiumBy.accessibilityId("Event reminder")).isDisplayed());
		
		System.out.println("Drink reminder feature displayed " + d.findElement(AppiumBy.accessibilityId("Drink reminder")).isDisplayed());
		
		scroll("value","Sports type","down");
		
		System.out.println("Shortcuts displayed "
				+ d.findElement(AppiumBy.accessibilityId("Shortcuts")).isDisplayed());
		
		System.out.println("Sports type displayed "
				+ d.findElement(AppiumBy.accessibilityId("Sports type")).isDisplayed());
		
		System.out.println("Find my watch feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Find my watch")).isDisplayed());

		System.out.println("BT calling feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Bluetooth calling")).isDisplayed());

		System.out.println(
				"Notifications features " + d.findElement(AppiumBy.accessibilityId("Notifications")).isDisplayed());
		
		System.out.println("Weather settings displayed "
				+ d.findElement(AppiumBy.accessibilityId("Weather settings")).isDisplayed());
		
		scroll("value","Watchfaces","up");

		Thread.sleep(2000);
	}
    
    public void Lconnectace_Settings_Features_Display_Check() throws InterruptedException {
		Thread.sleep(5000);

		d.findElement(AppiumBy.accessibilityId("Settings")).click();

		d.findElement(AppiumBy.accessibilityId("Watch features")).click();

		System.out.println(
				"Watch faces Tab displayed " + d.findElement(AppiumBy.accessibilityId("Watchfaces")).isDisplayed());

		System.out.println("Auto HR feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Auto monitoring heart rate")).isDisplayed());
		
		System.out.println("Sedentary reminder feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Sedentary reminder")).isDisplayed());

		System.out.println("Alarm feature displayed " + d.findElement(AppiumBy.accessibilityId("Alarm")).isDisplayed());
		

		System.out.println("BT calling feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Bluetooth calling")).isDisplayed());

		System.out.println(
				"Notifications features " + d.findElement(AppiumBy.accessibilityId("Notifications")).isDisplayed());
		
		System.out.println("Weather settings displayed "
				+ d.findElement(AppiumBy.accessibilityId("Weather settings")).isDisplayed());

		Thread.sleep(2000);
	}
    
    public void Ultima_prime_Settings_Features_Display_Check() throws InterruptedException {
		Thread.sleep(5000);

		d.findElement(AppiumBy.accessibilityId("Settings")).click();

		d.findElement(AppiumBy.accessibilityId("Watch features")).click();

		System.out.println(
				"Watch faces Tab displayed " + d.findElement(AppiumBy.accessibilityId("Watchfaces")).isDisplayed());

		System.out.println("Auto HR feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Auto monitoring heart rate")).isDisplayed());
		
		System.out.println("Sedentary reminder feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Sedentary reminder")).isDisplayed());

		System.out.println("Alarm feature displayed " + d.findElement(AppiumBy.accessibilityId("Alarm")).isDisplayed());
		
		System.out.println("Nudges feature displayed " + d.findElement(AppiumBy.accessibilityId("Nudges")).isDisplayed());
		System.out.println("World Clock feature displayed " + d.findElement(AppiumBy.accessibilityId("World clock")).isDisplayed());
		
		System.out.println("BT calling feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Bluetooth calling")).isDisplayed());

		System.out.println(
				"Notifications features " + d.findElement(AppiumBy.accessibilityId("Notifications")).isDisplayed());
		
        scroll("value", "Weather settings", "down");
		
		System.out.println("Weather settings displayed "
				+ d.findElement(AppiumBy.accessibilityId("Weather settings")).isDisplayed());
		
		scroll("value","Watchfaces","up");

		Thread.sleep(2000);
    }
    
    public void Armour2_Settings_Features_Display_Check() throws InterruptedException {
		Thread.sleep(5000);

		d.findElement(AppiumBy.accessibilityId("Settings")).click();

		d.findElement(AppiumBy.accessibilityId("Watch features")).click();

		System.out.println(
				"Watch faces Tab displayed " + d.findElement(AppiumBy.accessibilityId("Watchfaces")).isDisplayed());

		System.out.println("Auto HR feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Auto monitoring heart rate")).isDisplayed());
		
		System.out.println("Wallet feature displayed " + d.findElement(AppiumBy.accessibilityId("Wallet")).isDisplayed());
		
		System.out.println("Sedentary reminder feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Sedentary reminder")).isDisplayed());

		System.out.println("Alarm feature displayed " + d.findElement(AppiumBy.accessibilityId("Alarm")).isDisplayed());
		
		System.out.println("Drink reminder feature displayed " + d.findElement(AppiumBy.accessibilityId("Drink reminder")).isDisplayed());
		
		System.out.println("Find my watch feature displayed " + d.findElement(AppiumBy.accessibilityId("Find my watch")).isDisplayed());
		System.out.println("Camera feature displayed " + d.findElement(AppiumBy.accessibilityId("Camera")).isDisplayed());
		
		scroll("value", "Additional Activities", "down");
		
		System.out.println("BT calling feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Bluetooth calling")).isDisplayed());

		System.out.println(
				"Notifications features " + d.findElement(AppiumBy.accessibilityId("Notifications")).isDisplayed());
		
        
		
		System.out.println("Weather settings displayed "
				+ d.findElement(AppiumBy.accessibilityId("Weather settings")).isDisplayed());
		
		System.out.println("Additional Activities displayed "
				+ d.findElement(AppiumBy.accessibilityId("Additional Activities")).isDisplayed());
		
		scroll("value","Watchfaces","up");

		Thread.sleep(2000);
    }
    
    public void SC3Plus_Settings_Features_Display_Check() throws InterruptedException {
		Thread.sleep(5000);

		d.findElement(AppiumBy.accessibilityId("Settings")).click();

		d.findElement(AppiumBy.accessibilityId("Watch features")).click();

		System.out.println(
				"Watch faces Tab displayed " + d.findElement(AppiumBy.accessibilityId("Watchfaces")).isDisplayed());

		System.out.println("Auto HR feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Auto monitoring heart rate")).isDisplayed());

		System.out.println("Sedentary reminder feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Sedentary reminder")).isDisplayed());

		System.out.println("Alarm feature displayed " + d.findElement(AppiumBy.accessibilityId("Alarm")).isDisplayed());
		
		System.out.println("Nudges displayed "
				+ d.findElement(AppiumBy.accessibilityId("Nudges")).isDisplayed());
		
		
		System.out.println("Find my watch feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Find my watch")).isDisplayed());
		System.out.println("Emergency SOS settings displayed "
				+ d.findElement(AppiumBy.accessibilityId("Emergency SOS settings")).isDisplayed());


		System.out.println("BT calling feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Bluetooth calling")).isDisplayed());
		
		scroll("value","QR tray","down");

		System.out.println(
				"Notifications features " + d.findElement(AppiumBy.accessibilityId("Notifications")).isDisplayed());
		
		System.out.println("QR Tray displayed "
				+ d.findElement(AppiumBy.accessibilityId("QR Tray")).isDisplayed());
		
		System.out.println("Turn-by-turn navigation feature displayed "
				+ d.findElement(AppiumBy.accessibilityId("Turn-by-turn navigation")).isDisplayed());
		scroll("value","Watchfaces","up");


		Thread.sleep(2000);
	}
    
    public void Stress_HRV() throws InterruptedException {
    	  sleep(1);
   	   
   	   d.findElement(AppiumBy.accessibilityId("Auto stress & HRV monitoring")).click();
    	  sleep(2);
          
          WebElement v = d.findElement(By.className("XCUIElementTypeSwitch"));
   	    
   	    @SuppressWarnings("deprecation")
   		String hrvtoggle = v.getAttribute("value").toString();
   	    System.out.println(hrvtoggle);
   	    if(hrvtoggle.equals("1")) {
   	    	v.click();
   	    	sleep(2);
   	    	d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save changes\"`]")).click();
   	    	sleep(2);
   	    	OK();
   	    }else {
   			v.click();
   			sleep(2);
   			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeImage[`name == \"unCheckCircle\"`][3]")).click();
   			sleep(2);
   			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save changes\"`]")).click();
   			sleep(2);
   			OK();
   		}
          
    }
    
    public void NBR_feature() throws InterruptedException {

    	 sleep(2);
         
         d.findElement(AppiumBy.accessibilityId("Nightly breathing rate")).click();
         
         
         d.findElement(AppiumBy.className("XCUIElementTypeSwitch")).click();
         
         sleep(1);
         d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save\"`]")).click();
         sleep(1);
         OK();  
    }
    
    public void AAD_feature() throws InterruptedException {
        sleep(1);
        
        d.findElement(AppiumBy.accessibilityId("Auto activity detection")).click();
        
        try {
        
          boolean a = d.findElement(AppiumBy.accessibilityId("Don't show this message again")).isDisplayed();
        
        if(a == true) {
     	   d.findElement(AppiumBy.accessibilityId("uncheckBox")).click();
     	   sleep(1);
     	   d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Ok\"`]")).click();
        }
        }catch (Exception e) {
 		System.out.println("Element not displayed");
 	}
        
        sleep(3);
        
        d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Manage\"`]")).click();
        
        d.findElement(By.className("XCUIElementTypeSwitch")).click();
        
        d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save Changes\"`]")).click();
        
        OK();
        
        sleep(1);
        d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Walking\"`]")).click();
        
        sleep(3);
        
        d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save changes\"`]")).click();
        
        sleep(2);
        
        OK();
        
    }
    
    public static void weather_feature() throws InterruptedException {
    	  sleep(4);
          d.findElement(AppiumBy.accessibilityId("Weather settings")).click();
          sleep(2);
          
          d.findElement(By.className("XCUIElementTypeSwitch")).click();
          sleep(3);
       	   
       	   d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save Changes\"`]")).click();
       	   
       	   sleep(5);
       	   
       	   OK();
    }
    
    public static void Qr_tray_feature() throws InterruptedException {
        sleep(1);
        d.findElement(AppiumBy.accessibilityId("QR Tray")).click();
        
        try {
 		 d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Get Started\"`]")).click();
 		 sleep(2);
 	  	d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Later\"`]")).click();
 		 
 	} catch (Exception e) {
 	   try {
     	   sleep(2);
   		 d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Later\"`]")).click();
 	} catch (Exception a) {
 		back();
 	}
 	}
    }
        
     
        
       
    
    public static void sensAI_feature() throws InterruptedException {
    	sleep(1);
    	   d.findElement(AppiumBy.accessibilityId("SensAI")).click();
    	      
    	      try {
    			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Skip\"`]"));
    			sleep(1);
    			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Proceed to sense AI\"`]")).click();
    			sleep(1);
    			OK();
    			
    			back();
    		} catch (Exception e) {
    			System.out.println("FTU not displayed");
    		}
    	      
    	      try {
    			OK();
    			
    			back();
    		} catch (Exception e) {
    			System.out.println("sesnAI has no sessions");
    		}
    	      sleep(1);
    	      back();
    	      
    	        
    		
    }
    
    public static void CY_Watch_control() throws InterruptedException {

		// Wake gesture includes schedules.

		d.findElement(AppiumBy.accessibilityId("Watch control")).click();

		d.findElement(AppiumBy.accessibilityId("Wake up gesture")).click();
		sleep(3);

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Wake up gesture\"`]")).click();
		sleep(1);

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Schedule\"`]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		// Formats & Units

		d.findElement(AppiumBy.accessibilityId("Formats & units")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"12-Hour Time\"`]")).click();

//  d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"24-Hour Time\"`]")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Kilometers unit\"`]")).click();

//  d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Miles unit\"`]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		// DND

		d.findElement(AppiumBy.accessibilityId("DND")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[1]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();
		
		d.findElement(AppiumBy.accessibilityId("Battery saver mode")).click();
		
		sleep(2);
		
		back();

		back();
	}
    
    public static void Lconnectace_Watch_control() throws InterruptedException {

		// Wake gesture includes schedules.

		d.findElement(AppiumBy.accessibilityId("Watch control")).click();

		d.findElement(AppiumBy.accessibilityId("Wake up gesture")).click();
		sleep(3);

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Wake up gesture\"`]")).click();
		sleep(1);

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		// Formats & Units

		d.findElement(AppiumBy.accessibilityId("Formats & units")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"12-Hour Time\"`]")).click();

//  d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"24-Hour Time\"`]")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Kilometers unit\"`]")).click();

//  d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Miles unit\"`]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		// DND

		d.findElement(AppiumBy.accessibilityId("DND")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[1]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		back();
	}
    
    public static void Uprime_Watch_control() throws InterruptedException {

		// Wake gesture includes schedules.

		d.findElement(AppiumBy.accessibilityId("Watch control")).click();

		d.findElement(AppiumBy.accessibilityId("Wake up gesture")).click();
		sleep(3);

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Wake up gesture\"`]")).click();
		sleep(1);

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		// Formats & Units

		d.findElement(AppiumBy.accessibilityId("Formats & units")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"12-Hour Time\"`]")).click();

//  d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"24-Hour Time\"`]")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Kilometers unit\"`]")).click();

//  d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Miles unit\"`]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		// DND

		d.findElement(AppiumBy.accessibilityId("Do not disturb")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		back();
	}
    public static void Armour_Watch_control() throws InterruptedException {

		// Wake gesture includes schedules.

		d.findElement(AppiumBy.accessibilityId("Watch control")).click();

		d.findElement(AppiumBy.accessibilityId("Wake up gesture")).click();
		sleep(3);

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Wake up gesture\"`]")).click();
		sleep(15);

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();
		
		
		sleep(3);

		// Formats & Units

		d.findElement(AppiumBy.accessibilityId("Formats & units")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"12-Hour Time\"`]")).click();

//  d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"24-Hour Time\"`]")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Kilometers unit\"`]")).click();

//  d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Miles unit\"`]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		// DND

		d.findElement(AppiumBy.accessibilityId("Do not disturb")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		back();
	}
    public static void Sconnectplus_Watch_control() throws InterruptedException {

		// Wake gesture includes schedules.

		d.findElement(AppiumBy.accessibilityId("Watch control")).click();

		d.findElement(AppiumBy.accessibilityId("Wake up gesture")).click();
		sleep(3);

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Wake up gesture\"`]")).click();
		sleep(1);

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		// Formats & Units
		
		sleep(2);

		d.findElement(AppiumBy.accessibilityId("Formats & units")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"12-Hour Time\"`]")).click();

//  d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"24-Hour Time\"`]")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Kilometers unit\"`]")).click();

//  d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Miles unit\"`]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();
		
		sleep(1);
		
		back();
		
    }

    
    public static void SC3Plus_Watch_control() throws InterruptedException {

		// Wake gesture includes schedules.

		d.findElement(AppiumBy.accessibilityId("Watch control")).click();

		d.findElement(AppiumBy.accessibilityId("Wake up gesture")).click();
		sleep(3);

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Wake up gesture\"`]")).click();
		sleep(1);

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Schedule\"`]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		// Formats & Units

		d.findElement(AppiumBy.accessibilityId("Formats & units")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"12-Hour Time\"`]")).click();

//  d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"24-Hour Time\"`]")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Kilometers unit\"`]")).click();

//  d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Miles unit\"`]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		// DND

		d.findElement(AppiumBy.accessibilityId("DND")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[1]")).click();

		d.findElement(AppiumBy.iOSNsPredicateString(
				"name == \"Save changes\" AND label == \"Save changes\" AND value == \"Save changes\"")).click();

		OK();

		back();
	}
    
    public void system_setings_tab() throws InterruptedException {
    	 d.findElement(AppiumBy.accessibilityId("System settings")).click();
         
         d.findElement(AppiumBy.accessibilityId("Linked applications")).click();
         
         d.findElement(AppiumBy.iOSNsPredicateString("value BEGINSWITH 'Apple Health'")).click();
         sleep(1);
         back();
         
         back();
         
         d.findElement(AppiumBy.accessibilityId("Help & support")).click();
         
         sleep(1);
         
         System.out.println("Troubleshoot tab is idsplayed: "+d.findElement(AppiumBy.accessibilityId("Troubleshoot notifications")).isDisplayed());
         
         System.out.println("FAQ’s tab is idsplayed: "+d.findElement(AppiumBy.accessibilityId("FAQ’s")).isDisplayed());
         System.out.println("Contact us / feedback tab is idsplayed: "+d.findElement(AppiumBy.accessibilityId("Contact us / feedback")).isDisplayed());
         
         back();
         
         d.findElement(AppiumBy.accessibilityId("About app")).click();
         
         System.out.println("Privacy policy tab is idsplayed: "+d.findElement(AppiumBy.accessibilityId("Privacy policy")).isDisplayed());
         System.out.println("EULA tab is idsplayed: "+d.findElement(AppiumBy.accessibilityId("EULA")).isDisplayed());
         System.out.println("Disclaimer tab is idsplayed: "+d.findElement(AppiumBy.accessibilityId("Disclaimer")).isDisplayed());
         
         sleep(1);
         
         back();
         
    } 
    
    public static void nudges_feature() throws InterruptedException {
    	   d.findElement(AppiumBy.accessibilityId("Nudges")).click();
    	   
    	   d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`name == \"Nudges\"`]")).click();
    	   
    	   sleep(2);
    	   
    	   d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save\"`]")).click();
    	   
    	   sleep(2);
    	   
    	   OK();
    }
    
    
    public static void reminders() throws InterruptedException {
 	   
 	   d.findElement(AppiumBy.accessibilityId("Custom reminder")).click();
 	   try {
 		   d.findElement(AppiumBy.accessibilityId("customReminderDelete")).click();
 		   
 	} catch (Exception e) {
 		System.out.println("No reminders to delete");
 	}
 	   
 	   d.findElement(AppiumBy.accessibilityId("Medicine")).click();
 	   
 	   
 	   d.findElement(AppiumBy.iOSNsPredicateString("value == \"Enter Medicine Name\"")).sendKeys("Test");
 	   
 	   d.findElement(AppiumBy.accessibilityId("Done")).click();
 	   
 	   d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"DD/MM/YYYY\"`][2]")).click();
 	   
 	   d.findElement(AppiumBy.accessibilityId("tickMark")).click();
 	   
 	   
 	   d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"DD/MM/YYYY\"`][1]")).click();
 	   
 	   d.findElement(AppiumBy.accessibilityId("tickMark")).click();
 	   
 	   
 	   d.findElement(AppiumBy.accessibilityId("plus")).click();
 	   
 	   d.findElement(AppiumBy.accessibilityId("tickMark")).click();
 	   
 	   d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Set Reminder\"`]")).click();
 	   
 	   OK();
 	   
 	   sleep(2);
 	   
 	   d.findElement(AppiumBy.accessibilityId("customReminderDelete")).click();
 	   
 	   sleep(2);
 	   
 	   back();
    }
    
    public static void SOS_Feature() throws InterruptedException {
d.findElement(AppiumBy.accessibilityId("Emergency SOS settings")).click();
		
		try {
			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Enable Location\"`]")).click();
		} catch (Exception e) {
			System.out.println("Enable location popup not displayed");
		}
		
		sleep(2);
		try {
			d.findElement(AppiumBy.iOSNsPredicateString("label BEGINSWITH 'Location'")).click();
			
			
			d.findElement(AppiumBy.accessibilityId("LOCATION_SERVICES_AUTH_ALWAYS")).click();
			
			d.findElement(AppiumBy.className("XCUIElementTypeSwitch")).click();
			
			
	        App_launch();
			
			 Thread.sleep(50000);
		       try {
		  	     WebElement b = d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Get Started\"`]"));     
		  	        if(b.isDisplayed()) {
		  	        	b.click();
		  	        }
			} catch (Exception e) {
			   System.out.println("Element not displayed");	
			}
		       
		       sleep(2);
		       
		       d.findElement(AppiumBy.accessibilityId("Settings")).click();

				d.findElement(AppiumBy.accessibilityId("Watch features")).click();

				d.findElement(AppiumBy.accessibilityId("Emergency SOS settings")).click();
		       
		} catch (Exception e) {
			System.out.println("Locations permission popup not found");
		}
			
//			
//			String c = d.findElement(AppiumBy.className("XCUIElementTypeSwitch")).getAttribute("value");
//			
//			if(c.equals("1")) {
//				d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton")).click();
//				d.findElement(AppiumBy.accessibilityId("Change Contact")).click();
//				d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Proceed\"`]")).click();
//				
//			}
			sleep(2);
			d.findElement(AppiumBy.className("XCUIElementTypeSwitch")).click();
			
			sleep(2);
			
			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"OK\"`]")).click();
		
    }
    
    public void Navigation_feature() throws InterruptedException {
    	d.findElement(AppiumBy.accessibilityId("Turn-by-turn navigation")).click();
		try {
			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Next\"`]")).click();
			
			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Accept\"`]")).click();
			
		} catch (Exception e) {
			System.out.println("No FTU");
		}
		
		
		sleep(3);
		
		
		d.findElement(AppiumBy.className("XCUIElementTypeTextField")).sendKeys("Al daaz");
	   
		sleep(3);
		
		d.findElement(AppiumBy.accessibilityId("Al Daaz, HSR")).click();
		
		sleep(2);
		
		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Get Directions\"`]")).click();
		
		sleep(3);
		
		d.findElement(AppiumBy.iOSNsPredicateString("name == \"Navigation On Watch\" AND label == \"Navigation On Watch\" AND type == \"XCUIElementTypeButton\"")).click();
		
		Thread.sleep(5);
		
		d.findElement(AppiumBy.iOSNsPredicateString("name == \"Exit\" AND label == \"Exit\" AND type == \"XCUIElementTypeButton\"")).click();
		
		sleep(7);
		
		back();
		
		back();
		
		back();
    }
    
    public static void Profile() throws InterruptedException {
//	     Profile
		sleep(2);
		
		d.findElement(AppiumBy.accessibilityId("Home")).click();
		sleep(2);
		d.findElement(AppiumBy.iOSClassChain(
				"**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[2]"))
				.click();

		System.out.println(
				"Phone num verified " + d.findElement(AppiumBy.accessibilityId("+917829190451")).isDisplayed());

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"View Profile\"`]")).click();

		sleep(1);

		back();

		scroll("value", "Step Goal","down");

		d.findElement(AppiumBy.accessibilityId("Step Goal")).click();

		sleep(1);

		back();

		d.findElement(AppiumBy.accessibilityId("Sleep Goal")).click();

		sleep(1);

		back();

		scroll("value", "Rate Us","down");
		
		System.out.println("Activity reports Tab is displayed "+d.findElement(AppiumBy.accessibilityId("Activity reports")).isDisplayed());
		System.out.println("Fitness plan Tab is displayed "+d.findElement(AppiumBy.accessibilityId("Fitness plan")).isDisplayed());
		System.out.println("My Fit Crew Tab is displayed "+d.findElement(AppiumBy.accessibilityId("My Fit Crew")).isDisplayed());
		System.out.println("Fitness report Tab is displayed "+d.findElement(AppiumBy.accessibilityId("Fitness report")).isDisplayed());
		System.out.println("Rate Us Tab is displayed "+d.findElement(AppiumBy.accessibilityId("Rate Us")).isDisplayed());
		System.out.println("Share this app Tab is displayed "+d.findElement(AppiumBy.accessibilityId("Share this App")).isDisplayed());
		
		System.out.println("Logout button displayed "+d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Logout\"`]")).isDisplayed());
		System.out.println("Delete My account button displayed "+d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Delete my account\"`]")).isDisplayed());

		sleep(2);

		back();
    }
    
    
    public static void Auto_SPO2_feature() throws InterruptedException {
      d.findElement(AppiumBy.accessibilityId("Auto spo2 measurements")).click();
		
	    
        WebElement v = d.findElement(By.className("XCUIElementTypeSwitch"));
 	    
 	    @SuppressWarnings("deprecation")
 		String valuee = v.getAttribute("value").toString();
 	    System.out.println(valuee);
 	    
 	    if(valuee.equals("1")) {
 	    	d.findElement(AppiumBy.className("XCUIElementTypeSwitch")).click();
 			sleep(2);
 			
 			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save Changes\"`]")).click();
 			
 			sleep(6);
 	    }else {
 	    	d.findElement(AppiumBy.className("XCUIElementTypeSwitch")).click();
 			sleep(2);
 			
 			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save Changes\"`]")).click();
 			
 			OK();
 			
 			
 			
 			sleep(6);
 	    }
 	    
    }
    
    public static void Auto_Stress_feature() throws InterruptedException {
    	sleep(2);
    	
        d.findElement(AppiumBy.accessibilityId("Auto stress measurement")).click();
		
       WebElement v = d.findElement(By.className("XCUIElementTypeSwitch"));
 	    
 	    @SuppressWarnings("deprecation")
 		String valuee = v.getAttribute("value").toString();
 	    System.out.println(valuee);
 	    
 	    if(valuee.equals("1")) {
 	    	d.findElement(AppiumBy.className("XCUIElementTypeSwitch")).click();
 			sleep(2);
 			
 			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save Changes\"`]")).click();
 			
 			sleep(6);
 	    }else {
 	    	d.findElement(AppiumBy.className("XCUIElementTypeSwitch")).click();
 			sleep(2);
 			
 			
 			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save Changes\"`]")).click();
 			
 			OK();
 			sleep(6);
 			
 	    }       
       
    }
    
    public static void event_reminder_feature() throws InterruptedException {
    	
    	sleep(2);
       d.findElement(AppiumBy.accessibilityId("Event reminder")).click();
		
		
		try {
			d.findElement(AppiumBy.accessibilityId("scheduleReminderDelete")).click();
			
			OK();
			
			sleep(2);
			
			OK();
		} catch (Exception e) {
			System.out.println("No reminder to delete");
		}
		
		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Add Reminder\"`]")).click();
		
		
        d.findElement(AppiumBy.className("XCUIElementTypeTextField")).sendKeys("Test");
        
        d.findElement(AppiumBy.accessibilityId("Done")).click();
        
        
        d.findElement(By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeButton")).click();
		
		
		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Done\"`]")).click();
		
		d.findElement(AppiumBy.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeButton")).click();
		
		
		d.findElement(AppiumBy.accessibilityId("Once")).click();
		
		sleep(2);
		
		d.findElement(AppiumBy.iOSNsPredicateString("name == \"Set reminder\" AND label == \"Set reminder\" AND value == \"Set reminder\"")).click();
		
		
		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save changes\"`]")).click();
		
		sleep(2);
		
		OK();
		
		sleep(3);
		
		d.findElement(AppiumBy.accessibilityId("scheduleReminderDelete")).click();
		
		OK();
		
		sleep(2);
		
		OK();
		
		sleep(2);
		back();
		
    }
    
    public static void shortcuts_feature() throws InterruptedException {
	d.findElement(AppiumBy.accessibilityId("Shortcuts")).click();
		
		d.findElement(AppiumBy.accessibilityId("Music")).click();
		
		sleep(2);
		
		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")).click();
		
		
    }
    
    public static void Sports_type_feature() {
	
    	d.findElement(AppiumBy.accessibilityId("Sports type")).click();
		
		try {
			d.findElement(By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[1]")).click();
			
			sleep(1);
			d.findElement(AppiumBy.iOSNsPredicateString("name == \"Save\" AND label == \"Save\" AND type == \"XCUIElementTypeButton\"")).click();
			
		} catch (Exception e) {
			back();
		}
    }
    
    public static void Drink_reminder_Feature() throws InterruptedException{
    	sleep(1);
       d.findElement(AppiumBy.accessibilityId("Drink reminder")).click();
		
	    d.findElement(By.className("XCUIElementTypeSwitch")).click();
	   sleep(1);
	   
	   d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save\"`]")).click();
	   
	   OK();
	    
    }
    
    
    public static void ULPrime_nudge() throws InterruptedException {
    	sleep(2);
		d.findElement(AppiumBy.accessibilityId("Nudges")).click();
		
		try {
			System.out.println("Personalised nudges present "+d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Personalised nudges\"`]")).isDisplayed());
			sleep(1);
			d.findElement(AppiumBy.className("XCUIElementTypeSwitch")).click();
	    	   
	    	   sleep(3);
	    	   
	    	   d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save\"`]")).click();
	    	   
	    	   sleep(2);
	    	   
	    	   OK();
		} catch (Exception e) {
			System.out.println("Personalised nudges not present ");
		}
    }
    
    public static void ULPrime_Alarm() throws InterruptedException {
		d.findElement(AppiumBy.accessibilityId("Alarm")).click();
		
		try {
			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Add Alarm\"`]")).click();
			d.findElement(AppiumBy.accessibilityId("tickMark")).click();
			d.findElement(By.className("XCUIElementTypeTextField")).sendKeys("Test");
			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"S\"`][1]")).click();
			d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save Alarm\"`]")).click();
			OK();
			back();
		} catch (Exception e) {
			sleep(2);
			System.out.println("Already alarms present");
			back();
		}
    }
    
    public static void world_clock_feature() throws InterruptedException {
    	d.findElement(AppiumBy.accessibilityId("World clock")).click();
		
		sleep(1);
		
		try {
			d.findElement(AppiumBy.xpath("//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeButton[2]")).click();
			sleep(3);
			d.findElement(AppiumBy.iOSNsPredicateString("name == \"Yes\" AND label == \"Yes\" AND value == \"Yes\"")).click();	
			
		} catch (Exception e) {
			System.out.println("No clocks to delete");
			back();
		}
    }
    
    public static void Wallet_feature() throws InterruptedException {
    	d.findElement(AppiumBy.accessibilityId("Wallet")).click();
		
		d.findElement(AppiumBy.accessibilityId("Paytm")).click();
		sleep(1);
		d.findElement(AppiumBy.accessibilityId("Paytm")).click();
		sleep(1);
		
		d.findElement(AppiumBy.accessibilityId("PhonePe")).click();
		sleep(1);
		d.findElement(AppiumBy.accessibilityId("PhonePe")).click();
		sleep(1);
		d.findElement(AppiumBy.accessibilityId("Gpay")).click();
		sleep(1);
		d.findElement(AppiumBy.accessibilityId("Gpay")).click();
		sleep(1);
		d.findElement(AppiumBy.accessibilityId("BHIM")).click();
		sleep(1);
		d.findElement(AppiumBy.accessibilityId("BHIM")).click();
		
		sleep(2);
		
		back();
    }
    
    public static void Camera_featiru() throws InterruptedException {
    	sleep(1);
		
		d.findElement(AppiumBy.accessibilityId("Camera")).click();
		sleep(5);
		
		d.findElement(AppiumBy.accessibilityId("backBtnImage")).click();
		
		sleep(1);
    }
   
    public static void Add_activities() {
    	d.findElement(AppiumBy.accessibilityId("Additional Activities")).click();
		
		try {
			d.findElement(AppiumBy.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther")).click();
			
			sleep(1);
			
			d.findElement(AppiumBy.iOSNsPredicateString("name == \"Done\" AND label == \"Done\" AND value == \"Done\"")).click();
			
			sleep(5);
			
			OK();
			
			sleep(5);
			
			back();
			
			
		} catch (Exception e) {
			System.out.println("Coud'nt add Additional activties");
			back();
		}
		
		
    }
    
    
	
	public static void scroll(String AN, String AV,String direction) {
		JavascriptExecutor js = (JavascriptExecutor) d;
		Map<String, Object> params = new HashMap<>();
		params.put("direction", direction);
		params.put(AN, AV);
		js.executeScript("mobile: scroll", params);
	}

	

}
