package newfeaturesselenium4;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v108.emulation.Emulation;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basic {
	//webdriver interface donot expose devtools
	//use chrome Driver
	 ChromeDriver driver;
	@BeforeSuite
	public void lanchbrowser() throws InterruptedException{
		//WebDriverManager.chromedriver().setup();
		/*WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();*/
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91852\\eclipse-workspace\\PracticeTestNG\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	//webdriver interface donot expose devtools
	@Test
	public void aGoogleSearchMethod() throws InterruptedException 
	{
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		DevTools devTools=driver.getDevTools();
		devTools.createSession();
		//  https://chromedevtools.github.io/devtools-protocol/tot/Network/
		//send command to CDP Methods--> CDP Methods will invoke and get access to chrome dev tools
		//some fields are optional check the EMulation method
//	ex1
	/*devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
		driver.get("https://rahulshettyacademy.com/angularAppdemo/"); 
		driver.findElement(By.cssSelector(".navbar-toggler-icon")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Library")).click();*/
		
		//ex2
		Map deviceMetrics= new HashMap();
		deviceMetrics.put("width", 600);
		deviceMetrics.put("height", 1000);
		deviceMetrics.put("deviceScaleFactor", 50);
		deviceMetrics.put("mobile", true);
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
		driver.get("https://rahulshettyacademy.com/angularAppdemo/"); 
		driver.findElement(By.cssSelector(".navbar-toggler-icon")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Library")).click();
		
		
		
		
		
		
		
		
	}
	
}
