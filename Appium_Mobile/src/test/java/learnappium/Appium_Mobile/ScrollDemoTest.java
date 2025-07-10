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

public class ScrollDemoTest extends BaseTest {

	@Test
	public void ScrollDemo() throws MalformedURLException, InterruptedException 
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
//type -1
		//it will scroll the entire page until it find the element
		//google engine script                               //class            //arg                      //method
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		Thread.sleep(2000);
		
//type-2
		//appium guys suggested method
		//scroll based on coordinates // no prier idea
		//if you use loop it will also run until the end
		ScrolluptoEnd();
		Thread.sleep(2000);
        
	}
	
	
	
}
