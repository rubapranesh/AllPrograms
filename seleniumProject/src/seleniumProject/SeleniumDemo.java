package seleniumProject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver","D://Automation notes JAVA//Selenium Drivers//Drivers//FirefoxDriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		/*WebDriver drive1r=new ChromeDriver();
		WebDriver driver2=new EdgeDriver();*/
		
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println( driver.getTitle());
		System.out.println( driver.getCurrentUrl());
		System.out.println( driver.getPageSource());
		
		driver.findElement(By.partialLinkText("Broken Images")).click();
		
		
		// driver.findElement(By.linkText("Hom")).click();
		 //locators
		 //id - classname - xpath- linktext - partiallinktext - tagnemae -css
		// Thread.sleep(5000); // 3 -sec
		 //click
/*		 JavascriptExecutor executor = (JavascriptExecutor) driver;
	     executor.executeScript("arguments[0].click();", driver.findElement(By.id("impressiveRadio")));*/
		/* Thread.sleep(2000);
		 WebElement radiobutton = driver.findElement(By.id("yesRadio"));
		 radiobutton.click();
		*/
	/*	 WebElement radiobutton2 = driver.findElement(By.id("impressiveRadio"));
		 radiobutton2.click();*/
		 
		 
		 
	      /*  
	        driver.get(baseUrl);
	        
	        String expectedTitle = "Swag Labs";
	        String actualTitle = "";*/
	
	       // WebElement loginLink = driver.findElement(By.id("login_button_container"));
	    	
	    
	        
	   /*
	        actualTitle = driver.getTitle();
	        
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	            
	            WebElement username = driver.findElement(By.id("user-name"));
	            username.sendKeys("standard_user");
	            Thread.sleep(4000);
	            WebElement pass = driver.findElement(By.id("//input[@id='password']"));
	            pass.sendKeys("secret_sauce");
	            Thread.sleep(4000);
	            WebElement loginbutton = driver.findElement(By.tagName(tagName));
	            loginbutton.click();
	            Thread.sleep(4000);
	            */
	            
	            
	            
	            
	       /* } else {
	            System.out.println("Test Failed");
	        }
	        */
	        
	       // driver.close();
		
	
	}
	
		
	}



		
	


