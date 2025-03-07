package Testcases;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Wave_armour2 extends Base{

	@Test(priority = 1)
	public void Watch_Connection() throws InterruptedException {
		ULC_pairing("Wave Armour 2", "ARMOUR2-FD0");
	}

	@Test(priority = 2)
	public void Home_dasboard_components_Check() {
		ULC2BT_Home_dasboard_components_Check("Wave Armour 2");
	}
	@Test(priority = 3)
	public void Watch_features_Check() throws InterruptedException {
	   Armour2_Settings_Features_Display_Check();
	}
	
	@Test(priority = 4 )
	public void Watch_faces() throws InterruptedException {
		d.findElement(AppiumBy.accessibilityId("Watchfaces")).click();
        sleep(2);
		d.findElement(AppiumBy.accessibilityId("Back")).click();
	}
	@Test(priority = 5)
	public void HR() throws InterruptedException {
		Armour_Hear_rate();
	}
	
	@Test(priority = 6)
	public void wallet() throws InterruptedException {
		Wallet_feature();
	}
	
	
	@Test(priority = 7)
	public void Sedentary() throws InterruptedException{
		sed_rem();
	}
	@Test(priority = 8)
	public void alarm() throws InterruptedException{
		Alarm_feature();
		
	}
	
	@Test(priority =9)
	public void Drink_reminder() throws InterruptedException {
		Drink_reminder_Feature();
	}

	
	@Test (priority = 10)
	public void Find_my_watch() throws InterruptedException {
		Find_my_watch_feature();
	}
	
	
	@Test(priority = 11)
	public void Camera() throws InterruptedException {
		Camera_featiru();
	   
		scroll("value", "Additional Activities", "down");
	}
	
	
	@Test(priority = 12)
	public void BT_Calling() throws InterruptedException{
		Bluetooth_calling_Feature();
		 scroll("value", "Weather settings", "down");
	}
	
	@Test(priority = 13)
	public void Weather() throws InterruptedException{
		weather_feature();
	}
	
	@Test(priority = 14)
	public void Additional_Activities() {
		Add_activities();
	}

	
	@Test(priority=15)
	public void Notifications() throws InterruptedException{
		CY_Notifications_feature();
		
		back();
	}
	
	
	@Test(priority = 16)
	public void watch_control() throws InterruptedException {
		Armour_Watch_control();
	}
	
	
	@Test(priority = 17)
	public void system_settings() throws InterruptedException {
		system_setings_tab();
	}
	
	
	
	@Test(priority = 18)
	public void fitness_vitals() throws InterruptedException {
		Armour2_vitals();
	}
	
	
	@Test(priority = 19)
	public void My_watch() throws InterruptedException {
		Armour2_My_watch();
	}
	
	
	@Test(priority = 20)
	public void Fit_crew() throws InterruptedException {
		Fitcrew();
	}
	
	@Test(priority = 21)
	public void profile() throws InterruptedException {
//	     Profile
	   Profile();
	}

	@Test(priority = 22)
	public void boAtcoins() throws InterruptedException {
		sleep(2);
		d.findElement(AppiumBy.iOSClassChain(
				"**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[1]"))
				.click();

		sleep(5);
		
		back();

	}


	@Test(priority = 23)
	public void watch_disconnection() throws InterruptedException {

		watch_disconnection_feature();
	}

	@Test(priority = 24)
	public void watch_list_screen_display_check_after_disconnection() {

		System.out.println(
				d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Search here\"`]"))
						.isDisplayed());

	}

}
