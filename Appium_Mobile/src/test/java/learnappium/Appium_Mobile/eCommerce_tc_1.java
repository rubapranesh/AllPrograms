package learnappium.Appium_Mobile;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumBy;

public class eCommerce_tc_1 extends BaseTest  {

	@Test
	public void set() throws InterruptedException  {
		
		ExtentTest test =extent.createTest("Score Application openend successfully");
		//test.log(Status.PASS, "Application launch");
		
		test.pass("Score logo Appeared successfully");
		 driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ruba");
		 //to hide the keyboard
		 driver.hideKeyboard();
		 driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		
		 driver.findElement(By.id("android:id/text1")).click();
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click(); 
	}
}
