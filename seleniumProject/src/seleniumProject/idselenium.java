package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class idselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		String baseurl="https://practice.expandtesting.com/radio-buttons";
		driver.get(baseurl);
		driver.manage().window().maximize();
		
	
	
		WebElement element = driver.findElement(By.id("black"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		Thread.sleep(3000);
		
		List<WebElement> checkbooklinkclickone=driver.findElements(By.id("black"));
    	checkbooklinkclickone.get(0).click();
		Thread.sleep(3000);
		System.out.println( checkbooklinkclickone.get(0).isEnabled());
		System.out.println( checkbooklinkclickone.get(0).isSelected());
		System.out.println( checkbooklinkclickone.get(0).isDisplayed());
		
		
	    driver.close();
	   
		
		
	}

}
