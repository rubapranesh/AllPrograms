package seleniumProject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basicproject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.gecko.driver","D://Automation notes JAVA//Selenium Drivers//Drivers//FirefoxDriver.exe");
		
				WebDriver driver=new FirefoxDriver();
				
				driver.get("https://google.com");
				Thread.sleep(3000);
				driver.navigate().to("https://www.facebook.com/login.php/");
				Thread.sleep(3000);
				driver.navigate().back();
				Thread.sleep(3000);
				driver.navigate().forward();
				Thread.sleep(3000);
				driver.navigate().refresh();
				
		
	}

}
