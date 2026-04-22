package seleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
				Thread.sleep(7000);
			
		Actions action = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//*[@id='drag1']"));
		WebElement destination = driver.findElement(By.xpath("//*[@id='div2']"));
		
        action.clickAndHold(source).moveToElement(destination).release().build().perform();		
       
        //driver.quit();
	}

}
