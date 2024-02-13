package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class day4 {
	@Parameters({"URl","APIKey/username"})
	@Test
	public void WebloginCarloan(String urlname,String key)
	{
		//selenium
		System.out.println("WebloginPersonalCarloan");
		System.out.println(urlname);
		System.out.println(key);
	}
	@Test(dataProvider="getData")
	public void MobileloginCarloan(String username,String password)
	{
		//Appium
		System.out.println("MobileloginCarloan");
		System.out.println(username);
		System.out.println(password);
	}
	@Test(enabled=false)
	public void MobilesignInCarloan()
	{
		//Appium
		System.out.println("Mobile sign-In");
	}
	@Test(groups= {"Smoke"})
	public void MobilesignUpCarloan()
	{
		//Appium
		System.out.println("Mobile sign-Up");
	}
	@Test(dependsOnMethods= {"WebloginCarloan","MobilesignUpCarloan"})
	public void APICarloan()
	{
		//Rest API automation
		System.out.println("APIloginCarloan");
	}
	@DataProvider
	public Object[][] getData()
	{
// 1St combination -> firstSetusername,firstSetusername
// 2nd combination -> secondSetusername,secondSetpassword
// 3rd combination -> thirdSetusername,thirdSetpassword
		Object[][] data = new Object[3][2];//Object[3rows(combination)][2columns(values)]
		// 1st set
		data[0][0] = "firstSetusername";
		data[0][1] = "firstSetusername";
		// 2nd set
		data[1][0] = "secondSetusername";
		data[1][1] = "secondSetpassword";
		// 3rd set
		data[2][0] = "thirdSetusername";
		data[2][1] = "thirdSetpassword";
		return data;
	}
	@BeforeMethod
	public void Beforeevery() 
	{
		System.out.println("I will execute before every test case/method in day4 class ");
	}
	@AfterMethod
	public void Afterevery() 
	{
		System.out.println("I will execute after every test case/method in day4 class ");
	}
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("Before executing any methods in the class");
	}
	@AfterClass
	public void Afterclass()
	{
		System.out.println("After executing any methods in the class");
	}
	
	
}
