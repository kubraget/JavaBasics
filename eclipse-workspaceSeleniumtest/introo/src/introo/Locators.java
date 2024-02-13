package introo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String password = getPassword(driver);
		String name = "kubra fathima";
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+",");
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(),"Welcome to Rahul Shetty Academy");
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		

		

	}

	public static String getPassword(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("kubra");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567890");
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		String passwordA = (driver.findElement(By.cssSelector("p.infoMsg")).getText());
		String password = passwordA.split("'")[1].split("'")[0].trim();
		System.out.println(password);
		driver.findElement(By.className("go-to-login-btn")).click();
		return password;

	}

}
