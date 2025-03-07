package Testcases;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Lunar_connect_ace extends Base{
	@Test(priority = 1)
	public void Watch_Connection() throws InterruptedException {
		pairing("Lunar Connect Ace", "LCONNECT ACE");
	}

	@Test(priority = 2)
	public void Home_dasboard_components_Check() {
		ULC2BT_Home_dasboard_components_Check("Lunar Connect Ace");
	}
	@Test(priority = 3)
	public void Watch_features_Check() throws InterruptedException {
	   Lconnectace_Settings_Features_Display_Check();
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
	
	
	@Test(priority = 9)
	public void Sedentary() throws InterruptedException{
		Sconnectplus_sed_rem();
	}
	@Test(priority = 10)
	public void alarm() throws InterruptedException{
		Sconnectplus_Alarm_feature();
		
	}
	@Test(priority = 14)
	public void BT_Calling() throws InterruptedException{
		Bluetooth_calling_Feature();
	}
	
	@Test(priority = 15)
	public void Weather() throws InterruptedException{
		weather_feature();
	}
	
	@Test(priority=18)
	public void Notifications() throws InterruptedException{
		CY_Notifications_feature();
		
		back();
	}
	
	
	@Test(priority = 19)
	public void watch_control() throws InterruptedException {
		Lconnectace_Watch_control();
	}
	
	
	@Test(priority = 20)
	public void system_settings() throws InterruptedException {
		system_setings_tab();
	}
	
	
	
	@Test(priority = 21)
	public void fitness_vitals() throws InterruptedException {
		Sconnectplus_vitals();
	}
	
	
	@Test(priority = 22)
	public void My_watch() throws InterruptedException {
		Lconnectace_My_watch();
	}
	
	
	@Test(priority = 23)
	public void Fit_crew() throws InterruptedException {
		Fitcrew();
	}
	
	@Test(priority = 24)
	public void profile() throws InterruptedException {
//	     Profile
	   Profile();
	}

	@Test(priority = 25)
	public void boAtcoins() throws InterruptedException {
		sleep(2);
		d.findElement(AppiumBy.iOSClassChain(
				"**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[1]"))
				.click();

		sleep(5);
		
		back();

	}


	@Test(priority = 26)
	public void watch_disconnection() throws InterruptedException {

		watch_disconnection_feature();
	}

	@Test(priority = 27)
	public void watch_list_screen_display_check_after_disconnection() {

		System.out.println(
				d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Search here\"`]"))
						.isDisplayed());

	}
	


}
