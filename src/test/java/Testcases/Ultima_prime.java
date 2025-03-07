package Testcases;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Ultima_prime extends Base{
	@Test(priority = 1)
	public void Watch_Connection() throws InterruptedException {
		ULC_pairing("Ultima Prime", "ULTIMAPRIME_3BE9");
	}

	@Test(priority = 2)
	public void Home_dasboard_components_Check() {
		ULC2BT_Home_dasboard_components_Check("Ultima Prime");
	}
	@Test(priority = 3)
	public void Watch_features_Check() throws InterruptedException {
	   Ultima_prime_Settings_Features_Display_Check();
	}
	
	@Test(priority = 4 )
	public void Watch_faces() throws InterruptedException {
		d.findElement(AppiumBy.accessibilityId("Watchfaces")).click();
        sleep(2);
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
		ULPrime_Alarm();
		
	}
	
	@Test (priority = 8)
	public void nudges() throws InterruptedException {
		ULPrime_nudge();
	}
	
	
	@Test(priority = 9)
	public void World_clock() throws InterruptedException {
		sleep(2);
		d.findElement(AppiumBy.accessibilityId("World clock")).click();
		
		sleep(1);
		
		try {
			d.findElement(AppiumBy.xpath("//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeButton[2]")).click();
			sleep(3);
			d.findElement(AppiumBy.iOSNsPredicateString("name == \"Yes\" AND label == \"Yes\" AND value == \"Yes\"")).click();	
			
			sleep(2);
			back();
		} catch (Exception e) {
			System.out.println("No clocks to delete");
			
			back();
		}
	}
	
	
	@Test(priority = 10)
	public void BT_Calling() throws InterruptedException{
		Bluetooth_calling_Feature();
		 scroll("value", "Weather settings", "down");
	}
	
	@Test(priority = 11)
	public void Weather() throws InterruptedException{
		weather_feature();
	}
	
	@Test(priority=12)
	public void Notifications() throws InterruptedException{
		CY_Notifications_feature();
		
		back();
	}
	
	
	@Test(priority = 13)
	public void watch_control() throws InterruptedException {
		Uprime_Watch_control();
	}
	
	
	@Test(priority = 14)
	public void system_settings() throws InterruptedException {
		system_setings_tab();
	}
	
	
	
	@Test(priority = 15)
	public void fitness_vitals() throws InterruptedException {
		Sconnectplus_vitals();
	}
	
	
	@Test(priority = 16)
	public void My_watch() throws InterruptedException {
		Uprime_My_watch();
	}
	
	
	@Test(priority = 17)
	public void Fit_crew() throws InterruptedException {
		Fitcrew();
	}
	
	@Test(priority = 18)
	public void profile() throws InterruptedException {
//	     Profile
	   Profile();
	}

	@Test(priority = 19)
	public void boAtcoins() throws InterruptedException {
		sleep(2);
		d.findElement(AppiumBy.iOSClassChain(
				"**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[1]"))
				.click();

		sleep(5);
		
		back();

	}


	@Test(priority = 20)
	public void watch_disconnection() throws InterruptedException {

		Ultima_prime_watch_disconnection_feature();
	}

	@Test(priority = 21)
	public void watch_list_screen_display_check_after_disconnection() {
		
		System.out.println(
				d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Search here\"`]"))
						.isDisplayed());

	}
}
