package com.hyr.PracticeTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class canvaswebelemnt {

	WebDriver driver;
	WebDriver chdriver;
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
		
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	
	@Test
	public void google() throws InterruptedException   {
		String baseurl="https://pageflows.com/web/elements/canvas/";
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		WebElement canvas = driver.findElement(By.id("confetti-canvas"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(canvas, xOffset, yOffset).click().perform();

	} 

	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
		driver.quit();
	}

}
