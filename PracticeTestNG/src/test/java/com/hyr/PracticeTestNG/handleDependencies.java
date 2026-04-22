package com.hyr.PracticeTestNG;

import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class handleDependencies {

	@Test(enabled=true)
	public void HighSchool() {
		System.out.println("Highschool");
		Assert.assertEquals("Ats correct", "its correct");
	}
	
    @Test(dependsOnMethods="HighSchool")
	public void HigherSecondary() {
		System.out.println("Highersecondary");
		Assert.assertTrue(true);
	}
    
    @Test(dependsOnMethods="HigherSecondary")
	public void Engineering() {
		System.out.println("Enginnering");
	}
}
