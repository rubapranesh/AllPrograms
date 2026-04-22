package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class seleniumgrid {
    @Test
    public void Homepagecheck() throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.10.13:4444"),caps);
		driver.get("https://www.google.com/");
		System.out.print(driver.getTitle());
		
		Thread.sleep(4000);
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
}
