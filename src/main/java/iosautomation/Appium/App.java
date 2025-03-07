package iosautomation.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class App
{
	public static IOSDriver d;
	public static AppiumDriverLocalService s;
    public static void main( String[] args ) throws MalformedURLException
    {
       s = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
    		   .withIPAddress("127.0.0.1").usingPort(4723).build();
       
       XCUITestOptions x = new XCUITestOptions();
       x.setDeviceName("iPhone 16 Pro");
       x.setApp("/Users/rakeshkumar/Library/Developer/Xcode/DerivedData/UIKitCatalog-gblbrnlgznzxrhgyixckpfjsblsh/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
       x.setPlatformVersion("18.2");
       x.setWdaLaunchTimeout(Duration.ofMillis(100000));
      
           
       d = new IOSDriver(new URL("http://127.0.0.1:4723"),x);
       d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       //locators - xpath,classname,ios,iosclasschain,iospredicateString,accessbility id,id
       //For accessbility id - AppiumBy
       d.findElement(AppiumBy.accessibilityId("Alert Views")).click();
       
       d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Text Entry\"`]")).click();
       
       d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeCell")).sendKeys("Hello World");
       
       d.findElement(AppiumBy.accessibilityId("OK")).click();
       
      
       
    }
}
