package iosautomation.Appium;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;

public class Practice_appium extends Resourcs{

    public static void main( String[] args ) throws MalformedURLException, InterruptedException
    {
       launch();
       Thread.sleep(30000);
       
//       d.findElement(AppiumBy.iOSClassChain(
//				"**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[1]"))
//				.click();
//
//		sleep(5);
//		
//		back();
		
		sleep(2);
		
		d.findElement(AppiumBy.accessibilityId("Settings")).click();

		d.findElement(AppiumBy.accessibilityId("Watch features")).click();
			
		
//			d.findElement(AppiumBy.accessibilityId("Wallet")).click();
//			
//			d.findElement(AppiumBy.accessibilityId("Paytm")).click();
//			sleep(1);
//			d.findElement(AppiumBy.accessibilityId("Paytm")).click();
//			sleep(1);
//			
//			d.findElement(AppiumBy.accessibilityId("PhonePe")).click();
//			sleep(1);
//			d.findElement(AppiumBy.accessibilityId("PhonePe")).click();
//			sleep(1);
//			d.findElement(AppiumBy.accessibilityId("Gpay")).click();
//			sleep(1);
//			d.findElement(AppiumBy.accessibilityId("Gpay")).click();
//			sleep(1);
//			d.findElement(AppiumBy.accessibilityId("BHIM")).click();
//			sleep(1);
//			d.findElement(AppiumBy.accessibilityId("BHIM")).click();
//			
//			sleep(2);
//			
//			back();
//			
//			sleep(1);
//			
//			d.findElement(AppiumBy.accessibilityId("Camera")).click();
//			sleep(3);
//			
//			d.findElement(AppiumBy.accessibilityId("backBtnImage")).click();
//			
//			sleep(1);
//			scroll("value", "Additional Activities", "down");
//			
//			d.findElement(AppiumBy.accessibilityId("Additional Activities")).click();
//			
//			try {
//				d.findElement(AppiumBy.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther")).click();
//				
//				sleep(1);
//				
//				d.findElement(AppiumBy.iOSNsPredicateString("name == \"Done\" AND label == \"Done\" AND value == \"Done\"")).click();
//				
//				OK();
//				
//				sleep(5);
//				
//				back();
//				
//				
//			} catch (Exception e) {
//				System.out.println("Coud'nt add Additional activties");
//				back();
//			}
		
    }
			
			
	   
	   
	   
   
	   


    static void scroll(String AN,String AV,String dirction) {
        JavascriptExecutor js = (JavascriptExecutor) d;
        Map<String, Object> params = new HashMap<>();
        params.put("direction", dirction);
        params.put(AN,AV);
        js.executeScript("mobile: scroll", params);     
        }
    
    static void Wclock() throws InterruptedException {
		d.findElement(AppiumBy.accessibilityId("Settings")).click();

		d.findElement(AppiumBy.accessibilityId("Watch features")).click();
			
			
			//World clock
			
			d.findElement(AppiumBy.accessibilityId("World clock")).click();
			
			sleep(1);
			
			try {
				d.findElement(AppiumBy.xpath("//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeButton[2]")).click();
				sleep(3);
				d.findElement(AppiumBy.iOSNsPredicateString("name == \"Yes\" AND label == \"Yes\" AND value == \"Yes\"")).click();	
				
			} catch (Exception e) {
				System.out.println("No clocks to delete");
			}
			
			try {
				sleep(5);
				
				JavascriptExecutor js = (JavascriptExecutor) d;
				Map<String, Object> params = new HashMap<>();
				params.put("duration", 1.0);
				params.put("x", 206);
				params.put("y", 816);
				js.executeScript("mobile: tap", params);
			    
				sleep(2);
				
				d.findElement(AppiumBy.accessibilityId("Search here")).sendKeys("India");
				sleep(2);
				try {
					d.findElement(AppiumBy.accessibilityId("search")).click();
				} catch (Exception e) {
					System.out.println("Keyboard search failed");
				}
			
				
				sleep(2);
				
				d.findElement(AppiumBy.accessibilityId("Indianapolis, IN")).click();
				
				
				
				sleep(1);
				
				d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"
						+ "/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/"
						+ "XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
				
				
				d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"
						+ "/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
				
				OK();
			} catch (Exception e) {
				System.out.println("World clock addition failed");
				
				back();
			}
			
			
	
    }
   
}
