package com.testing1;

import org.testng.annotations.Test;

public class SmokeClass {
	
	@Test(groups= {"smoke"})
	public void smokeTest1()
	{
		System.out.println("------Smoke Test1-------");
	}
	@Test(groups= {"smoke"})
	public void smokeTest2()
	{
		System.out.println("------Smoke Test2-------");
	}
	@Test(groups= {"smoke"})
	public void smokeTest3()
	{
		System.out.println("------Smoke Test3-------");
	}

}
