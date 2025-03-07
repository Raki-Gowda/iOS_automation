package Testcases;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ULC2BT_LynkVoice extends Base {

	@Test(priority = 1)
	public void Watch_Connection() throws InterruptedException {
		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Search here\"`]"))
				.sendKeys("Wave Lynk Voice");

		d.findElement(AppiumBy.accessibilityId("Wave Lynk Voice")).click();

		d.findElement(AppiumBy.accessibilityId("Continue")).click();

		d.findElement(AppiumBy.accessibilityId("LYNKVOICE_D9E4")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Pair this device\"`]")).click();

		Thread.sleep(30000);

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

	@Test(priority = 2)
	public void Home_dasboard_components_Check() {
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
				+ d.findElement(AppiumBy.accessibilityId("Wave Lynk Voice")).isDisplayed());
		System.out.println(
				"Connected status displayed " + d.findElement(AppiumBy.accessibilityId("Connected")).isDisplayed());
		System.out.println(
				"BT calling supported text " + d.findElement(AppiumBy.accessibilityId("BT calling")).isDisplayed());

	}

	@Test(priority = 3)
	public void Settings_Features_Display_Check() throws InterruptedException {
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

	@Test(priority = 4)
	public void Watch_faces() throws InterruptedException {
		d.findElement(AppiumBy.accessibilityId("Watchfaces")).click();
		d.findElement(AppiumBy.iOSNsPredicateString("name == \"Cloud\"")).click();
		sleep(3);
		d.findElement(AppiumBy.accessibilityId("Default")).click();
		sleep(3);
		d.findElement(AppiumBy.accessibilityId("Back")).click();
	}

	@Test(priority = 5)
	public void HR() throws InterruptedException {
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

	@Test(priority = 6)
	public void sedentary_reminder() throws InterruptedException {

		d.findElement(AppiumBy.accessibilityId("Sedentary reminder")).click();

		d.findElement(By.className("XCUIElementTypeSwitch")).click();

		sleep(3);

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Save changes\"`]")).click();

		OK();

// Alarm
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

	@Test(priority = 7)
	public void Find_My_watch() {
		d.findElement(AppiumBy.accessibilityId("Find my watch")).click();
		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Find my watch\"`]")).click();
		back();
		back();
	}

	@Test(priority = 8)
	public void Bluetooth_calling() {
		d.findElement(AppiumBy.accessibilityId("Bluetooth calling")).click();

		System.out.println(d.findElement(AppiumBy.accessibilityId("Call Notification")).isDisplayed());

		back();

	}

	@Test(priority = 9)
	public void Notifications() throws InterruptedException {

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

	@Test(priority = 10)
	public void Watch_control() throws InterruptedException {

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

	@Test(priority = 11)
	public void About_Watch() {
		d.findElement(AppiumBy.accessibilityId("About watch")).click();

		System.out.println(
				"Model Name is displayed: " + d.findElement(AppiumBy.accessibilityId("Model name")).isDisplayed());

		back();

		System.out.println("Watch software update tab displayed: "
				+ d.findElement(AppiumBy.accessibilityId("Watch software update")).isDisplayed());
	}

	@Test(priority = 12)
	public void vitals() throws InterruptedException {
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

	@Test(priority = 13)
	public void My_watch() {
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

	}

	@Test(priority = 14)
	public void profile() throws InterruptedException {
//	     Profile
		sleep(2);
		d.findElement(AppiumBy.iOSClassChain(
				"**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[2]"))
				.click();

		System.out.println(
				"Phone num verified " + d.findElement(AppiumBy.accessibilityId("+917829190451")).isDisplayed());

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"View Profile\"`]")).click();

		sleep(1);

		back();

		scroll("value", "Step Goal");

		d.findElement(AppiumBy.accessibilityId("Step Goal")).click();

		sleep(1);

		back();

		d.findElement(AppiumBy.accessibilityId("Sleep Goal")).click();

		sleep(1);

		back();

		scroll("value", "Rate Us");

		sleep(2);

		back();
	}

	@Test(priority = 15)
	public void WatchFaceStudio() throws InterruptedException {
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

	@Test(priority = 16)
	public void watch_disconnection() throws InterruptedException {

		Thread.sleep(2000);

		d.findElement(AppiumBy.accessibilityId("Settings")).click();

		d.findElement(AppiumBy.accessibilityId("Watch status Connected")).click();

		d.findElement(AppiumBy.accessibilityId("Disconnect")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Disconnect\"`]")).click();

		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"GOT IT\"`]")).click();

	}

	@Test(priority = 17)
	public void watch_list_screen_display_check_after_disconnection() {

		System.out.println(
				d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Search here\"`]"))
						.isDisplayed());

	}

	public static void scroll(String AN, String AV) {
		JavascriptExecutor js = (JavascriptExecutor) d;
		Map<String, Object> params = new HashMap<>();
		params.put("direction", "down");
		params.put(AN, AV);
		js.executeScript("mobile: scroll", params);
	}

}
