package com.hyr.PracticeTestNG;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class GroupingEX {

	
	@Test(groups= {"Fruits"} )
	public void Apple() {
		System.out.println("Apple");
		
	}
	
    @Test(groups= {"Fruits"})
	public void orange() {
		System.out.println("orange");
		//Assert.isTrue(1>2, "faillllllll");
	}
    
    
/*    @Test(timeOut=2000,expectedExceptions=ArrayIndexOutOfBoundsException.class)*/
    @Test(groups="carsbrands")
	public void AUDI() {
		System.out.println("A7");
	}
    
    @Test(groups="carsbrands")
    public void BENZ() {
		System.out.println("X3");
	}
}
