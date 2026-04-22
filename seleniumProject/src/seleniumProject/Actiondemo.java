package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiondemo {
	public static void main(String[] args) throws InterruptedException {

	
	WebDriver driver = new FirefoxDriver();
	
	//specify the URL of the webpage
	driver.get("https://www.google.com/");
	
	//maximise the window
	driver.manage().window().maximize();
	
	WebElement Searchelemet = driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
	//Thread.sleep(4000);
	//create an object for the Actions class and pass the driver argument 
	Actions action = new Actions(driver);
	Thread.sleep(2000);
	//pass the product name that has to be searched in the website
	action.sendKeys(Searchelemet, "iphone").build().perform();
	Thread.sleep(3000);
	action.keyDown(Keys.DOWN).click().keyUp(Keys.DOWN).build().perform();
	Thread.sleep(3000);
	action.keyDown(Keys.ENTER).click().keyUp(Keys.ENTER).build().perform();
	WebElement iphone = driver.findElement(By.xpath("//*[text()='iPhone 14 - Order Online At Amazon Today']"));
	WebElement ipad = driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[4]/a"));
	////*[@id="ac-globalnav"]/div/ul[2]/li[4]/a
	Thread.sleep(3000);
	action.moveToElement(iphone).build().perform();
	Thread.sleep(3000);
	action.doubleClick(ipad).build().perform();
	
	action.dragAndDrop(iphone, ipad);
	
	
	
	
	
	
	
}}

