import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filterstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
//to automate and verify filter functionallity is working fine in the table
		List<WebElement> veggie = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> veggies =veggie.stream().map(s->s.getText()).collect(Collectors.toList());
		//veggies.stream().forEach(s -> System.out.println(s));//5result
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> item = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> items = item.stream().map(s->s.getText()).collect(Collectors.toList());
		items.stream().forEach(s -> System.out.println(s));//1result
		List<WebElement> filteredList = item.stream().filter(s -> s.getText().contains("Rice"))
				.collect(Collectors.toList());
		List<String> filter = filteredList.stream().map(s->s.getText()).collect(Collectors.toList());
		filter.stream().forEach(s -> System.out.println(s));//1result
		Assert.assertEquals(items.size(),filter.size());

	}

}
