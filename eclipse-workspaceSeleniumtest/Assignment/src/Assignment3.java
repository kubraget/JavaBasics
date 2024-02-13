import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Synchronization with Explicit wait
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(3));
		driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();
		WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(options);
		dropdown.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		List<WebElement> product =  driver.findElements(By.cssSelector(".card-footer .btn-info"));
		for(int i=0;i<product.size();i++)
		{
			product.get(i).click();
		}
		driver.findElement(By.partialLinkText("Checkout")).click();
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
	}

}


