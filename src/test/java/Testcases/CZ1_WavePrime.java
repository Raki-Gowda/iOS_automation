package Testcases;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class CZ1_WavePrime extends Base{
	@Test(priority = 1)
	public void Watch_Connection() throws InterruptedException {
		ULC_pairing("Wave Prime", "WAVEPRIME_A0ED");
	}

	@Test(priority = 2)
	public void Home_dasboard_components_Check() {
		ULC_Home_dasboard_components_Check("Wave Prime");

	}

	@Test(priority = 3)
	public void Settings_Features_Display_Check() throws InterruptedException {
	    CZ_Settings_Features_Display_Check();
	}

	@Test(priority = 4)
	public void Watch_faces() throws InterruptedException {
		d.findElement(AppiumBy.accessibilityId("Watchfaces")).click();
		sleep(2);
		d.findElement(AppiumBy.iOSNsPredicateString("name == \"Cloud\"")).click();
		sleep(1);
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
	

	@Test(priority = 8)
	public void Find_My_watch() {
		Find_my_watch_feature();
	}
	
	@Test(priority = 9)
	public void Notifications() throws InterruptedException {

		weather_feature();
		
	}
	
	@Test(priority = 10)
	public void Weather_Settings() throws InterruptedException {
		
		Notifications_feature();
	}

	@Test(priority = 11)
	public void Watch_control() throws InterruptedException {

         CZ_Watch_control();
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
	
	public void System_settings() throws InterruptedException {
		system_setings_tab();
	}

	@Test(priority = 13)
	public void vitals() throws InterruptedException {
		CZ_vitals();
	}
	
	
	@Test(priority = 14)
	public void fit_crew() throws InterruptedException {
		Fitcrew();
	}

	@Test(priority = 15)
	public void My_watch() throws InterruptedException {
	
		CZ_My_watch();

	}
	

	@Test(priority = 16)
	public void profile() throws InterruptedException {
        Profile();
	}

	@Test(priority = 17)
	public void boAtcoins() throws InterruptedException {
		sleep(2);
		d.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther")).click();
		

		sleep(5);
		
		back();

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
