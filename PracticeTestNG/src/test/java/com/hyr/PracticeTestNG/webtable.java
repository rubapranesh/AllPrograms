package com.hyr.PracticeTestNG;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class webtable {
@Test
	public void metho() throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String baseurl="https://demoqa.com/browser-windows";
	driver.get(baseurl);
	driver.manage().window().maximize();
	Thread.sleep(6000);

String parentwindowhandle=driver.getWindowHandle();
	System.out.println("parent window" +  parentwindowhandle);
	
	for(int i=0;i<=2;i++)
	{
		driver.findElement(By.xpath("//*[@id='windowButton']")).click();
	}
	
	Set<String> windowhandles=driver.getWindowHandles();

	for (String handle:windowhandles) {
	
		System.out.println("window handle" + handle);
	    driver.switchTo().window(handle);
	   
	    driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	}

	driver.switchTo().window(parentwindowhandle);
	driver.close();
	
	//Thread.sleep(2000);

	//driver.close();
    driver.quit();
	
}
	

}
