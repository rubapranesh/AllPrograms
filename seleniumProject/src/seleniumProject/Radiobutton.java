package seleniumProject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.gecko.driver","D://Automation notes JAVA//Selenium Drivers//Drivers//FirefoxDriver.exe");

				WebDriver driver=new FirefoxDriver();  

				String baseurl="https://demoqa.com/radio-button";
				driver.get(baseurl);
				Thread.sleep(10000);
			    WebElement radiobutton = driver.findElement(By.id("yesRadio"));
			    Thread.sleep(3000);
			    radiobutton.click();

			 	 System.out.println( radiobutton.isEnabled());
				 System.out.println(radiobutton.isSelected());
				 System.out.println( radiobutton.isDisplayed());
		 
		 
		 Thread.sleep(4000);
		 
		 driver.close();
		 
		 
		 
	}

}
