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

public class SeleniumMuliplewindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
// Invoking multiple windows/tab from selenium
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String parentID = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		driver.get("https://rahulshettyacademy.com");
		String course = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/get']"))
				.get(1).getText();
		System.out.println(course);
		driver.switchTo().window(parentID);
// capture Webelement screenshot using Selenium
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(course);
		File file =name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("Logo.png"));
// to get Height and width of edit boxes
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		driver.quit();
	}

}
