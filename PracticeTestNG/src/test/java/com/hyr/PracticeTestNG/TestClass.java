package com.hyr.PracticeTestNG;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import seleniumProject.WebDriverWait;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.WebElement;

import static org.testng.Assert.fail;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestClass  {
	WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		System.out.println("Before Suite");
	}
	
	@Test
	public void google() throws InterruptedException   {
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
	

	} 
	@Test
	public void google2() throws InterruptedException   {

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
	
	}
	@Test
	public void google3() throws InterruptedException   {
	
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");


	}
	
	@AfterSuite
	public void afterSuite() {
		driver.quit();
		System.out.println("After Suite");
	}
	
	
	
}