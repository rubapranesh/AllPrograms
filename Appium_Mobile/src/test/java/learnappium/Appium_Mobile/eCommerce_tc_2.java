package learnappium.Appium_Mobile;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerce_tc_2 extends BaseTest  {

	@Test
	public void set() throws InterruptedException  {
		
		// driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ruba");
		 //to hide the keyboard
		 driver.hideKeyboard();
		 driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		
		 driver.findElement(By.id("android:id/text1")).click();
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		 
		 //Toast message will appear and go in 2 sec and even if you capture also you wont get the element
		 //Toast message will have definitely name tag
		String toastmessage= driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		 Assert.assertEquals("Please enter your name", toastmessage);
		  
	}
	
	
}
