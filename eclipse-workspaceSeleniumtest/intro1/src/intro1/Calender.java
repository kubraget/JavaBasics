package intro1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(1000);
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		while(!driver.findElement(By.xpath("//div[@class='flatpickr-month']")).getText().contains("August"))
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
		}
		Thread.sleep(1000);
		int count = driver.findElements(By.className("flatpickr-day")).size();
		for(int i=0;i<count;i++) {
			String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if(text.equalsIgnoreCase("26"))
			{
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				System.out.println("The selected date is"+text);
				break;
			}
		}
		

	}

}
