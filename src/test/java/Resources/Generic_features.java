package Resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Testcases.Base;
import io.appium.java_client.AppiumBy;

public class Generic_features extends Base{

	public static void HR() throws InterruptedException {
		d.findElement(AppiumBy.accessibilityId("Auto monitoring heart rate")).click();

		WebElement HRtoggle = d.findElement(By.className("XCUIElementTypeSwitch"));

		HRtoggle.click();
		Thread.sleep(1000);
		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Save Changes\"`]")).click();
		try {
			WebElement a = d.findElement(
					AppiumBy.iOSNsPredicateString("name == \"Ok\" AND label == \"Ok\" AND value == \"Ok\""));
			if (a.isDisplayed()) {
				a.click();

			}
		} catch (Exception e) {
			System.out.println("HR saved success popup not displayed");
		}
		try {
			WebElement a = d.findElement(
					AppiumBy.iOSNsPredicateString("name == \"Ok\" AND label == \"Ok\" AND value == \"Ok\""));
			if (a.isDisplayed()) {
				a.click();

			}
		} catch (Exception e) {
			System.out.println("HR saved success popup not displayed");
		}
	}
	
	public static void sed_rem() throws InterruptedException {

		d.findElement(AppiumBy.accessibilityId("Sedentary reminder")).click();

		d.findElement(By.className("XCUIElementTypeSwitch")).click();

		sleep(3);

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save changes\"`]")).click();

		OK();
	}

}
