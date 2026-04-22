package com.hyr.PracticeTestNG;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Test
	@Parameters({"logins","passwords"})
	public void printName11111(@Optional String a,@Optional  String b) {	
		System.out.println("login is "+ a);
		System.out.println("password is "+ b);
	    // Assert.assertTrue(1>2, "positive test case");
	}
	@Test
	@Parameters({"login","password"})
	public void printNaame22222(@Optional String a, @Optional String b) {	
		System.out.println("login is "+ a);
		System.out.println("password is "+ b);
	    // Assert.assertTrue(1>2, "positive test case");
	}
	
	
}
