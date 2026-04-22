package com.hyr.PracticeTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class username {

	@Test
	public void testusername() throws InterruptedException{
		
		FirefoxDriver driver =new FirefoxDriver();
		
		driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AYZoVhdJDdIbkyNR-7ehNeilz6gUkV-iL8OjBqefC7WRummguxahE_e1PSHVJkhXh_ITmxmJG-JkPQ&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		Thread.sleep(5000);
		WebElement username =driver.findElement(By.id("identifierId"));
		WebElement nextbutton =driver.findElement(By.xpath("//div[@id='identifierNext']//button/div[3]"));
		String text=username.getText();
       System.out.println(text);
		
		
		try {
			if(text.equals(""))
			{
				username.click();
				username.sendKeys("pra@gmail.com");
				nextbutton.click();
				WebElement error =driver.findElement(By.xpath("//div[@class='o6cuMc Jj6Lae']"));

				if(error.isDisplayed())
				{
					Assert.assertFalse(false);
				}
				
			}
			else {
				System.out.println("fail the TC");
			}
		}
		catch(Exception e)
		{
		System.out.println(e);
		WebElement error =driver.findElement(By.xpath("//div[@class='o6cuMc Jj6Lae']"));

		String invalidusername=error.getText();
		System.out.println("error " + invalidusername);
		if(error.isDisplayed())
		{
			System.out.println("invalid username");
		}
			//Assert.assertFalse(false);
		}
		
		
		
		
		
		
		
	}
	
	
	
	
}
