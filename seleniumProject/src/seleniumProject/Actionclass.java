package seleniumProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

 public class Actionclass {
		public static void main(String[] args) throws InterruptedException {

			//specify the driver location
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shalini\\Downloads\\Driver\\chromedriver.exe");
			
			//instantiate the driver
			FirefoxDriver driver = new FirefoxDriver();
			//
			new WebDriverWait(driver, Duration.ofSeconds(10));
			
			//specify the URL of the webpage
			driver.get("https://www.google.com/");
			
			//maximise the window
			driver.manage().window().maximize();
			
			//specify the locator of the search box
			WebElement element= driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
			
			
			
			//create an object for the Actions class and pass the driver argument 
		    Actions action = new Actions(driver);
		
			//pass the product name that has to be searched in the website
			//action.sendKeys(element, "iphone").build().perform();
			
			
			//select all
			
		//	action.keyDown(element,Keys.SHIFT).sendKeys("lambdatest").build().perform();
		    
			action.sendKeys("iphone");
		
			
		//	WebElement iphonesearchelemet = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
			
		//	System.out.println(iphonesearchelemet.getText());
			Thread.sleep(2000);
			action.keyDown(Keys.DOWN).keyUp(Keys.DOWN).build().perform();
			Thread.sleep(2000);
			action.keyDown(Keys.DOWN).keyUp(Keys.DOWN).build().perform();
			Thread.sleep(2000);
			action.keyDown(Keys.DOWN).keyUp(Keys.DOWN).build().perform();
			Thread.sleep(2000);
			action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
			
			
		
            WebElement secondpro = driver.findElement(By.xpath("(//*[@class='LC20lb MBeuO DKV0Md'])[1]"));
			
			System.out.println(secondpro.getText());
			
		
			action.doubleClick(secondpro).click().build().perform();
			
			//mouse click
			
		/*	List<WebElement> elementToClick = driver.findElements(By.xpath("//div[@class='v7W49e']//div[@class='kb0PBd cvP2Ce jGGQ5e ieodic']//h3"));
			
			//perform a mouse click on the search button
			//scroll down
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", elementToClick.get(0));
			elementToClick.get(0).click();
			//action.click(elementToClick.get(0)).build().perform();
			
		
			
			//double click

			WebElement elementToClickiphone = driver.findElement(By.xpath("//*[text()='Meet the new iPhone 15 - Apple Official Site']"));
			action.doubleClick(elementToClickiphone).build().perform();
			
			
			//sendkeys enter key

			//action.sendKeys(Keys.ENTER).build().perform();
			
			//refresh
		//	action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).build().perform();
			
			action.contextClick(elementToClickiphone).build().perform();
		
			driver.close();*/
			
		}
	
		
		
	}


