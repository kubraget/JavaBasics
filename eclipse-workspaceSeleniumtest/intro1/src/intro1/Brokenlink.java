package intro1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Brokenlink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a  = new SoftAssert();
		for(WebElement link:links)
		{
		String url =link.getAttribute("href");
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		int respCode = connection.getResponseCode();
		System.out.println(respCode);
		a.assertTrue(respCode>400,"the link with the text\"+link.getText()+\"is broken with code");
		}
		a.assertAll();
	}
}
//String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
//String urll = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
//HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
//connection.setRequestMethod("HEAD");
//connection.connect();
//int respCode = connection.getResponseCode();
//System.out.println(respCode);
