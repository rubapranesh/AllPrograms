package learnappium.Appium_Mobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class LongpressTest extends BaseTest {

	@Test
	public void LongPressGesture() throws MalformedURLException, InterruptedException 
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();	
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();	
		WebElement ele=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
        //android mobile gestures
		//longpress
		longpressAction(ele);
		//by.id and resource id in elemets are same
		 String samplemenupopup =driver.findElement(By.id("android:id/title")).getText();
	        Assert.assertEquals(samplemenupopup, "Sample menu");
	        Assert.assertTrue(   driver.findElement(By.id("android:id/title")).isDisplayed());
		
		Thread.sleep(2000);
   
        
	}
	
	
	
}
