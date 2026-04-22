package seleniumProject;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();

		String baseurl="https://demoqa.com/browser-windows";
		driver.get(baseurl);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"tabButton\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"tabButton\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"tabButton\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"tabButton\"]")).click();
		Thread.sleep(1000);

		System.out.println(driver.getWindowHandles());
		
		int count=0;
		for(String a:driver.getWindowHandles())
		{
			count=count+1;
		}
		System.out.println("number of tabs openned" + count);
		//converting set to arryalist
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    driver.get("https://www.google.com");
		    if(driver.getTitle()=="Google") {
		    Thread.sleep(4000);
		    driver.close();
		    }
		    //child 2
		    driver.switchTo().window(tabs2.get(2));
		    driver.get("https://www.amazon.com/");
		    
		    Thread.sleep(3000);
		  
		    //child 3
		    driver.switchTo().window(tabs2.get(3));
		    driver.get("https://www.facebook.com/");
		    Thread.sleep(2000);
		  
		    //child 4
		    driver.switchTo().window(tabs2.get(4));
		    driver.get("https://www.google.com");
		    if(driver.getTitle()=="Google") {
		    Thread.sleep(1000);
		   
		    }
		    //parent window
		    driver.switchTo().window(tabs2.get(0));
		    driver.quit();
	     	Thread.sleep(5000);

	}

}
