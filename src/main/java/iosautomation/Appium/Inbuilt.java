package iosautomation.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Inbuilt {

	public static IOSDriver d;
	public static AppiumDriverLocalService s;
    public static void main( String[] args ) throws MalformedURLException
    {
       s = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
    		   .withIPAddress("127.0.0.1").usingPort(4723).build();
       
       XCUITestOptions x = new XCUITestOptions();
       x.setDeviceName("iPhone 16 Pro");
//       x.setApp("/Users/rakeshkumar/Library/Developer/Xcode/DerivedData/UIKitCatalog-gblbrnlgznzxrhgyixckpfjsblsh/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
       x.setPlatformVersion("18.2");
       x.setWdaLaunchTimeout(Duration.ofMillis(100000));
      
       
       
       d = new IOSDriver(new URL("http://127.0.0.1:4723"),x);
       d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       Map<String,String> p = new HashMap<String, String>();
       p.put("bundleId","com.apple.mobileslideshow");
       d.executeScript("mobile:launchApp", p);
       
       
       
	}

}
