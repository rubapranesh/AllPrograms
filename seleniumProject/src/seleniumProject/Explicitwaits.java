package seleniumProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaits {

	
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.google.com/");
		// maximized the browser window
		driver.manage().window().maximize();  
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
/*		WebElement element = driver.findElement(By.id("identifierId"));
		// entering username
		element.sendKeys("dummy@gmail.com");
		element.sendKeys(Keys.RETURN);*/
		// entering password
 /*    	driver.findElement(By.id("Passwd")).sendKeys("password");
		// clicking signin button
		driver.findElement(By.id("signIn")).click();*/
		// explicit wait - to wait for the compose button to be click-able
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//img[@class='lnXdpd']")));
		
		System.out.println("passss");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F22);
		robot.keyRelease(KeyEvent.VK_F22);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		
	    driver.close();
		
	}

}//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

