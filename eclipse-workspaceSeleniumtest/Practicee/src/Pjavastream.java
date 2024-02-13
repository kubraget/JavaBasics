import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Pjavastream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> item = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> orginal = item.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sorted = orginal.stream().sorted().collect(Collectors.toList());
		Assert.assertEquals(orginal, sorted);
		List<String> product = item.stream().filter(s -> s.getText().contains("Beans")).map(s -> getVeggiePrice(s))
				.collect(Collectors.toList());
		product.stream().forEach(s->System.out.println(s));
		List<String> prize;
		do {
			List<WebElement> items = driver.findElements(By.xpath("//tr/td[1]"));
			prize = items.stream().filter(s -> s.getText().contains("Wheat")).map(s -> getVeggiePrice(s))
			.collect(Collectors.toList());
			prize.stream().forEach(s->System.out.println(s));
			if(prize.size()<1)
			{
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			
			}}while(prize.size()<1);
			
		}
	
		
	

	private static String getVeggiePrice(WebElement s) {
		// TODO Auto-generated method stub
		String price= s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
