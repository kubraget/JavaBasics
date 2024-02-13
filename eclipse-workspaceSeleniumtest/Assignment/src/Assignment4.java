import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// FluentWait
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		WebElement wait = w.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver input) {
				// TODO Auto-generated method stub
				if (driver.findElement(By.xpath("//h3")).isDisplayed()) {
					return driver.findElement(By.xpath("//h3"));
				} else {
					return null;
				}
			}
		});
		System.out.println(driver.findElement(By.xpath("//h3")).getText());
		driver.switchTo().window(parentID);
		System.out.println(driver.findElement(By.xpath("//h3")).getText());

	}

}
