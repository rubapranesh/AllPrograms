package seleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrollupanddown {
	public static void main(String[] args) throws InterruptedException   {
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.lambdatest.com/");
		
		//assertEquals(driver.getTitle(), "Most Powerful Cross Browser Testing Tool Online | LambdaTest");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		// Scroll Down using Actions class
		//act.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		

/*		try {
		Thread.sleep(4000);
		} 
		catch (InterruptedException e) {
			System.out.println(e);
		}*/
		
    // Scroll Up using Actions class
	//	act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		Thread.sleep(4000);
		WebElement checkbooklink=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section[9]/div/p/a"));
		//scroll
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", checkbooklink);
		
		
		System.out.println("completed");
		
		/*Thread.sleep(4000);
		System.out.println("scroll id completed");
		Actions act = new Actions(driver);
		act.scrollToElement(checkbooklink);
		Thread.sleep(4000);
		act.perform(); */
		Thread.sleep(7000);
		driver.close();
	}
}
