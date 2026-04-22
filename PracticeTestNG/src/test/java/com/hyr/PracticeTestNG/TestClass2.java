package com.hyr.PracticeTestNG;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClass2 {

	WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	@Test
	public void Login()  {
		
		String baseurl = "https://www.google.com/";
		driver.get(baseurl); // trigger the given url
		driver.manage().window().maximize(); // maximize
		System.out.println("login sucessfull");
		
	}
	
	@Test
	public void loot()  {
		
		String baseurl = "https://www.google.com/";
		driver.get(baseurl); // trigger the given url
		driver.manage().window().maximize(); // maximize
		System.out.println("login sucessfull");
		
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
		driver.quit();
	}
}


