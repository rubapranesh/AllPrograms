package seleniumProject;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String baseurl="https://demoqa.com/browser-windows";
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(6000);

	    String parentwindowhandle=driver.getWindowHandle();
		System.out.println("parent window  ==" +  parentwindowhandle);
		
		
			driver.findElement(By.xpath("//*[@id='windowButton']")).click();
		
		Set<String> windowhandles=driver.getWindowHandles();

		for (String handle:windowhandles) {
		if(handle.equals(parentwindowhandle))
		{
			
		}
		else
			{
				System.out.println("window handle" + handle);
			    driver.switchTo().window(handle);
			    
			    driver.get("https://www.google.com");
			    driver.manage().window().maximize();
			}
		}

		driver.switchTo().window(parentwindowhandle);
		
		
		//Thread.sleep(2000);
	
		//driver.close();
        driver.quit();
		
	}}


