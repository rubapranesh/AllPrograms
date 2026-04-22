package seleniumProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		 driver.get("https://demoqa.com/checkbox");
		 
	        // Create instance of WebDriverWait class, We are giving wait time of 20 seconds
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 
	        // Web driver will wait until element became visible
	      //  Below method will return element if element became visible 
	        // If element not found, it will throw an exception
	        
	     
		 driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
		 List<WebElement> a=driver.findElements(By.xpath("//span[contains(@class,'text')]"));
         System.out.println(a);
		  driver.findElement(By.className("gLFyf")).sendKeys("Pranesh");
		 driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
		 
		 Thread.sleep(5000);
		 driver.close();
		
	}

}
