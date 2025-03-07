package Testcases;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ULC2BT_StyleCall extends Base{

	@Test(priority = 1)
	public void Watch_Connection() throws InterruptedException {
		pairing("Wave Style Call", "STYLECALL_D6A7");
	}

	@Test(priority = 2)
	public void Home_dasboard_components_Check() {
		ULC2BT_Home_dasboard_components_Check("Wave Style Call");

	}

	@Test(priority = 3)
	public void Settings_Features_Display_Check() throws InterruptedException {
	    ULC2BT_Settings_Features_Display_Check();
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
		Hear_rate();
	}

	@Test(priority = 6)
	public void sedentary_reminder() throws InterruptedException {

		sed_rem();
		
	}

// Alarm
	@Test(priority = 7)
	public void Alarm() throws InterruptedException {
	      Alarm_feature();	
	}
	

	@Test(priority = 7)
	public void Find_My_watch() {
		Find_my_watch_feature();
	}

	@Test(priority = 9)
	public void Bluetooth_calling() throws InterruptedException {
		Bluetooth_calling_Feature();

	}

	@Test(priority = 10)
	public void Notifications() throws InterruptedException {

		Notifications_feature();
	}

	@Test(priority = 11)
	public void Watch_control() throws InterruptedException {

         ULC2BT_Watch_control();
	}

	@Test(priority = 12)
	public void About_Watch() {
		d.findElement(AppiumBy.accessibilityId("About watch")).click();

		System.out.println(
				"Model Name is displayed: " + d.findElement(AppiumBy.accessibilityId("Model name")).isDisplayed());

		back();

		System.out.println("Watch software update tab displayed: "
				+ d.findElement(AppiumBy.accessibilityId("Watch software update")).isDisplayed());
	}

	@Test(priority = 13)
	public void vitals() throws InterruptedException {
		ULC_vitals();
	}

	@Test(priority = 14)
	public void My_watch() throws InterruptedException {
	ULC2BT_My_watch();

	}

	@Test(priority = 16)
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

		scroll("value", "Step Goal","down");

		d.findElement(AppiumBy.accessibilityId("Step Goal")).click();

		sleep(1);

		back();

		d.findElement(AppiumBy.accessibilityId("Sleep Goal")).click();

		sleep(1);

		back();

		scroll("value", "Rate Us","down");

		sleep(2);

		back();
	}

	@Test(priority = 17)
	public void WatchFaceStudio() throws InterruptedException {
		WatchFaceStudio_feature();

	}

	@Test(priority = 18)
	public void watch_disconnection() throws InterruptedException {

		watch_disconnection_feature();
	}

	@Test(priority = 19)
	public void watch_list_screen_display_check_after_disconnection() {

		System.out.println(
				d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Search here\"`]"))
						.isDisplayed());

	}
	
	

}
