package test;

import org.testng.annotations.Test;

public class day3 {
	@Test(groups= {"Smoke"})
	public void WebloginHomeloan()
	{
		//selenium
		System.out.println("WebloginHomeloan");
	}
	@Test
	public void MobileloginHomeloan()
	{
		//Appium
		System.out.println("MobileloginHomeloan");
	}
	@Test
	public void loginAPIHomeloan()
	{
		//Rest API automation
		System.out.println("APIloginHomeloan");
	}
}
