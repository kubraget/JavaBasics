package test;


import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	@Parameters({"URl"})
	@Test
	public void Demo(String urlname)
	{
		System.out.println("Hello");
		System.out.println(urlname);
	}
	@Test
	public void Demo1()
	{
		System.out.println("Bye");

	}
	@AfterTest
	public void firstexecution()
	{
		System.out.println("I will execute at last");
	}
}
