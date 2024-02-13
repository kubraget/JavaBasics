package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	@Test(groups= {"Smoke"})
	public void payloan()
	{
		System.out.println("good");
	}
	@BeforeTest
	public void firstexecution()
	{
		System.out.println("I will execute at first");
	}
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am number 1");
	}
	@AfterSuite
	public void Afsuite()
	{
		System.out.println("I am  the number 1 from last");
	}

}
