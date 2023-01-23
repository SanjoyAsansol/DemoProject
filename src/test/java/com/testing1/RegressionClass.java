package com.testing1;

import org.testng.annotations.Test;

public class RegressionClass {
	
	@Test
	public void regressionTest1()
	{
		System.out.println("------Regression Test1-------");
	}
	@Test(groups= {"smoke"})
	public void regressionTest2()
	{
		System.out.println("------Regression Test2-------");
	}
	@Test(groups= {"smoke"})
	public void regressionTest3()
	{
		System.out.println("------Regression Test3-------");
	}
	

}
