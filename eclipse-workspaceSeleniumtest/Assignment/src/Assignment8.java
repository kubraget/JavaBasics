import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Autosuggestive
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
	    Thread.sleep(2000);
	    List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("india"))
				option.click();
		}
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));

	}

}
