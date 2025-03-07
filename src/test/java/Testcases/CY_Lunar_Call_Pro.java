package Testcases;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class CY_Lunar_Call_Pro extends Base{
	
	@Test(priority = 1)
	public void Watch_Connection() throws InterruptedException {
		pairing("Lunar Call Pro", "LCALLPRO_8594");
	}

	@Test(priority = 2)
	public void Home_dasboard_components_Check() {
		ULC2BT_Home_dasboard_components_Check("Lunar Call Pro");
	}
	@Test(priority = 3)
	public void Watch_features_Check() throws InterruptedException {
	   CY_Settings_Features_Display_Check();
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
	public void HRV_and_Stress() throws InterruptedException {
		Stress_HRV();
	}
	
	@Test(priority = 7)
	public void NBR() throws InterruptedException{
		NBR_feature();
		
	}
	@Test(priority = 8)
	public void AAD() throws InterruptedException{
		AAD_feature();
	}
	@Test(priority = 9)
	public void Sedentary() throws InterruptedException{
		sed_rem();
	}
	@Test(priority = 10)
	public void alarm() throws InterruptedException{
		Alarm_feature();
		
		sleep(1);
		
		scroll("value","sensAI","down");
		
	}
	@Test(priority = 11)
	public void Nudge() throws InterruptedException{
		nudges_feature();
		
	}
	@Test(priority = 12)
	public void Custom_reminder() throws InterruptedException{
		reminders();
	}
	@Test(priority = 13)
	public void Find_my_watch(){
		Find_my_watch_feature();
		
	}
	@Test(priority = 14)
	public void BT_Calling() throws InterruptedException{
		Bluetooth_calling_Feature();
		
	}
	@Test(priority = 15)
	public void Notifications() throws InterruptedException{
		CY_Notifications_feature();
		
	}
	@Test(priority = 16)
	public void Weather() throws InterruptedException{
		weather_feature();
	}
	@Test(priority = 17)
	public void QR_tray() throws InterruptedException{
		Qr_tray_feature();
	}
	@Test(priority = 18)
	public void sensAI() throws InterruptedException{
		sensAI_feature();
	}
	
	@Test(priority = 19)
	public void watch_control() throws InterruptedException {
		CY_Watch_control();
	}
	
	
	@Test(priority = 20)
	public void fitness_vitals() throws InterruptedException {
		CY_vitals();
	}
	
	
	@Test(priority = 21)
	public void My_watch() throws InterruptedException {
		CY_My_watch();
	}
	
	
	@Test(priority = 22)
	public void Fit_crew() throws InterruptedException {
		Fitcrew();
	}
	
	@Test(priority = 23)
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

	@Test(priority = 24)
	public void WatchFaceStudio() throws InterruptedException {
		WatchFaceStudio_feature();

	}

	@Test(priority = 25)
	public void watch_disconnection() throws InterruptedException {

		watch_disconnection_feature();
	}

	@Test(priority = 26)
	public void watch_list_screen_display_check_after_disconnection() {

		System.out.println(
				d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Search here\"`]"))
						.isDisplayed());

	}
	

	

}
