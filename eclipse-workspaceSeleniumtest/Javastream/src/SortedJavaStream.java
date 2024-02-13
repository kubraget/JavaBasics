import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SortedJavaStream {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//sorting
//1st -click on column
//2nd-capture all webelements into list
//capture text of all webelements into new(orginal) list based on 2nd step
//sort in the orginal list of step 3 ->sorted list
//compare orginal list vs sorted list
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> orginalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());
		// orginalList.stream().forEach(s -> System.out.println(s));
		List<String> sortedList = orginalList.stream().sorted().collect(Collectors.toList());
		// sortedList.stream().forEach(s -> System.out.println(s));
		Assert.assertTrue(orginalList.equals(sortedList));
//scan the name column with getText->Beans->print the price of the Beans
		Thread.sleep(1000);
		List<String> price = elementsList.stream().filter(s -> s.getText().contains("Beans"))
				.map(s -> getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(a -> System.out.println(a));
//pagination is used  to find the price of product that is not present in firstpage
		List<String> prize ;
		do {
		List<WebElement> item = driver.findElements(By.xpath("//tr/td[1]"));
		prize = item.stream().filter(s -> s.getText().contains("Rice")).map(s -> getProductprize(s)).collect(Collectors.toList());
		prize.forEach(a->System.out.println(a));
		if(prize.size()<1)
		{
			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		}
		}while(prize.size()<1);
	}

	private static String getProductprize(WebElement s) {
		// TODO Auto-generated method stub
		String prizevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return prizevalue;
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
