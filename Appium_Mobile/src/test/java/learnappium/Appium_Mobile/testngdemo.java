package learnappium.Appium_Mobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testngdemo{
	WebDriver driver;
	@Test
	public void google() 
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("first    ");
		//driver install
		driver.get("https://demoqa.com/buttons");
		driver.findElement(By.xpath("//*[@id=\"GnPfk\"]")).click();//*[@id="dynamicClickMessage"]
		String s=driver.findElement(By.xpath("//*[@id=\"dynamicClickMessage\"]")).getText();
	
		Boolean a=true;
		Boolean b=false;
		Assert.assertEquals(s, "You have done a dynamic click" , "Passed");
		
		
	}

	
	
}
