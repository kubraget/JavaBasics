import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handel = driver.getWindowHandles();
		Iterator<String> it = handel.iterator();
		String Parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		driver.get("https://rahulshettyacademy.com");
		String course = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/get']")).get(1).getText();
		System.out.println(course);
		driver.switchTo().window(Parentid);
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(course);
		File file =name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("Logo.png"));
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		driver.quit();
		

	}

}