package seleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Copypaste {
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/account/about/");
		
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//*[text() = 'Create an account']"));

		element.click();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement userName = driver.findElement(By.id("username"));
		
		firstName.sendKeys("Pranesh");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		

		action.keyDown( Keys.CONTROL ).sendKeys( "a" ).keyUp( Keys.CONTROL ).build().perform();
		Thread.sleep(2000);
		action.keyDown( Keys.CONTROL ).sendKeys( "c" ).keyUp( Keys.CONTROL ).build().perform();
		Thread.sleep(2000);
		userName.click();
		Thread.sleep(2000);
		action.keyDown( Keys.CONTROL ).sendKeys( "v" ).keyUp( Keys.CONTROL ).build().perform();
		Thread.sleep(2000);
	;
		}
}
