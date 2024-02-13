package introo;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluenntwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.cssSelector("#start button")).click();
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(4)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		 WebElement wait = w.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {	 
		     if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()) {
		     return driver.findElement(By.cssSelector("[id='finish'] h4"));
		     }
		     else
		     {
		    	 return null;
		     }
		     }
		   });
		 System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
	}

}
