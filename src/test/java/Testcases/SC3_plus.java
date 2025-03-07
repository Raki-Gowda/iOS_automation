package Testcases;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SC3_plus extends Base{
	@Test(priority = 1)
	public void Watch_Connection() throws InterruptedException {
		SC3plus_pairing("Storm Call 3 Plus", "STROMCALL3+_0478");
	}

	@Test(priority = 2)
	public void Home_dasboard_components_Check() {
		ULC2BT_Home_dasboard_components_Check("Storm Call 3 Plus");
	}
	@Test(priority = 3)
	public void Watch_features_Check() throws InterruptedException {
	   SC3Plus_Settings_Features_Display_Check();
	}
	
	@Test(priority = 4 )
	public void Watch_faces() throws InterruptedException {
		d.findElement(AppiumBy.accessibilityId("Watchfaces")).click();
		d.findElement(AppiumBy.iOSNsPredicateString("name == \"Cloud\"")).click();
		d.findElement(AppiumBy.iOSNsPredicateString("name == \"Default\"")).click();
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
	public void Sedentary() throws InterruptedException{
		sed_rem();
	}
	@Test(priority = 7)
	public void alarm() throws InterruptedException{
		Alarm_feature();
		
	}
	@Test(priority = 8)
	public void Nudge() throws InterruptedException{
		nudges_feature();
		
	}

	@Test(priority = 9)
	public void Find_my_watch(){
		Find_my_watch_feature();
		
	}
	
	@Test(priority = 10)
	public void SOS() throws InterruptedException {
		SOS_Feature();
	}
	@Test(priority = 11)
	public void BT_Calling() throws InterruptedException{
		Bluetooth_calling_Feature();
		
		scroll("value","QR Tray", "down");
		
	}
	@Test(priority = 12)
	public void Notifications() throws InterruptedException{
		CY_Notifications_feature();
		
	}
	@Test(priority = 13)
	public void QR_tray() throws InterruptedException{
		Qr_tray_feature();
	}
    
	@Test(priority = 14)
	public void Navigation() throws InterruptedException {
		Navigation_feature();
	}
	
	@Test(priority = 15)
	public void watch_control() throws InterruptedException {
		SC3Plus_Watch_control();
		
		d.findElement(AppiumBy.accessibilityId("About watch")).click();

		System.out.println(
				"Model Name is displayed: " + d.findElement(AppiumBy.accessibilityId("Model name")).isDisplayed());

		back();

		System.out.println("Watch software update tab displayed: "
				+ d.findElement(AppiumBy.accessibilityId("Watch software update")).isDisplayed());
	}
	
	@Test(priority = 16)
	public void system_settings() throws InterruptedException {
		system_setings_tab();
	}
	
	
	@Test(priority = 17)
	public void fitness_vitals() throws InterruptedException {
		ULC_vitals();
	}
	
	
	@Test(priority = 18)
	public void My_watch() throws InterruptedException {
		SC3Plus_Mywatch();
	}
	
	
	@Test(priority = 19)
	public void Fit_crew() throws InterruptedException {
		Fitcrew();
	}
	
	@Test(priority = 20)
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

	@Test(priority = 21)
	public void WatchFaceStudio() throws InterruptedException {
	  WatchFaceStudio_feature_SC3Plus();

	}

	@Test(priority = 22)
	public void watch_disconnection() throws InterruptedException {

		watch_disconnection_feature();
	}

	@Test(priority = 23)
	public void watch_list_screen_display_check_after_disconnection() {

		System.out.println(
				d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Search here\"`]"))
						.isDisplayed());

	}
	

	
	


}
