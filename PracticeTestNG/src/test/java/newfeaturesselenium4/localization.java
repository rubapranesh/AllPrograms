package newfeaturesselenium4;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class localization {
	
	ChromeDriver driver;
	@BeforeSuite
	public void lanchbrowser() throws InterruptedException{
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void aGoogleSearchMethod() throws InterruptedException 
	{
	
		DevTools devTools=driver.getDevTools();
		devTools.createSession();
		
		Map coordinates= new HashMap();
		coordinates.put("latitude", 40);
		coordinates.put("longitude", 3);
		coordinates.put("accuracy", 1);
		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		driver.get("http://google.com"); 
		
		
	}
}
