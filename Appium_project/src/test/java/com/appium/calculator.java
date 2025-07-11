package com.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class calculator {

	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities capabilities =new DesiredCapabilities();
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "13");
		capabilities.setCapability("udid", "RFCT11AENVJ");
		capabilities.setCapability("deviceName", "rubapranesh's M52");
		capabilities.setCapability("appPackage", "com.sec.amdroid.app.popupcalculator");
		capabilities.setCapability("appActivity", "com.sec.amdroid.app.popupcalculator.Calculator");
	
        URL url =new URL("http://0.0.0.0:4723/wd/hub/"); 
		
		driver =new AndroidDriver(url,capabilities);
	
	}
}
