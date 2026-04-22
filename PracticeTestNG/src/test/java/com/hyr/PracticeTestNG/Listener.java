package com.hyr.PracticeTestNG;

	import java.time.Duration;

import org.openqa.selenium.By;		
	import org.openqa.selenium.WebDriver;		
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;		
	import org.testng.annotations.Listeners;		
	import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;             		

	//@Listeners(com.hyr.PracticeTestNG.ListenerTest.class)			
	import com.hyr.PracticeTestNG.RetryCountIfFailed;
	public class Listener  {				
		WebDriver driver;			

	//Test to pass as to verify listeners.		
	@Test
	@RetryCountIfFailed(4)
	public void Login() throws Exception				
	{		
		WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver();
	 driver.get("https://www.google.com/");
	
		  Assert.assertTrue(false);	
	
	  				
	}		

	//Forcefully failed this test as verify listener.		
	/*
	 * @Test public void TestToFail() {
	 * 
	 * Assert.assertTrue(false); }
	 */	
	
}
