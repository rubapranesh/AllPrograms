package com.hyr.PracticeTestNG;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider {
	WebDriver driver;
	 @DataProvider(name = "stringArrayProvider")
	    public Object[][] provideStringArray() {
	        String[][] inputArray = {
	            {"1"},
	            {"Second-Value"},
	            {"third-Value"},
	            {"fourth-Value"},
	            {"vuhsdishu"}
	        };
	        return new Object[][] {
	            { inputArray }
	        };
	    }

	    // Test method using the DataProvider
	    @Test(dataProvider = "stringArrayProvider")
	    public void testFlattenStringArray(String[][] inputArray) {
	        List<String> flatList = flattenToList(inputArray);
	        WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		    System.out.println("login sucessfull");
	        // Output to verify
	        System.out.println("Flattened List:");
	        for (String value : flatList) {
	        	String baseurl="https://demoqa.com/browser-windows";
				driver.get(baseurl);
				driver.manage().window().maximize();
	            System.out.println(value);
	            
	        }
	    }

	    // Method to flatten 2D array
	    private List<String> flattenToList(String[][] array) {
	        List<String> result = new ArrayList<>();
	        for (String[] row : array) {
	            for (String value : row) {
	                result.add(value);
	            }
	        }
	        return result;
	    }
}
