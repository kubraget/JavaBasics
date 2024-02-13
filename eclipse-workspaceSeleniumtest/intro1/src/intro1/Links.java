package intro1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://qaclickacademy.com/practice.php");
		int link = driver.findElements(By.tagName("a")).size();
		System.out.println(link);
		WebElement footer=driver.findElement(By.xpath(".//*[@id='gf-BIG']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement column=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());
		for(int i=0;i<column.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		}
	}

}
