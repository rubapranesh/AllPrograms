package com.hyr.PracticeTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class PriorityClass {
	
	 
    @Test
	public void startthecar() {
		
    	System.out.println("start the car");
	}

    @Test
	public void FirstGEAR() {
    	int a=200;
    	int b=300;
    	Assert.assertTrue(a>b);
		System.out.println("FirstGEAR");
	}
    
    @Test
	public void SecondGEAR() {
		System.out.println("SecondGEAR");
		
	}
    @Test
	public void ThirdGEAR() {
		System.out.println("ThirdGEAR");
	}
    
    @Test
	public void ForthGEAR() {
		System.out.println("ForthGEAR");
	}
    @Test
   	public void TurntheMusicON() {
   		System.out.println("TurntheMusicON");
   	}
	
}
