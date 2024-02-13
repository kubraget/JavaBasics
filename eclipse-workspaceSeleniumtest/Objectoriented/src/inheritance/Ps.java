package inheritance;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

//parent calss
public class Ps {
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Run me first");
	}
	@AfterTest
	public void AfterMethod()
	{
		System.out.println("Run me last");	
	}
public void doThis() 
	{
	System.out.println("Hello i am here");
	}
}
