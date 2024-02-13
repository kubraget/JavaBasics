package intro1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Additems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String[] name = {"Cucumber","Brocolli","Brinjal"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j=0;
		for(int i=0;i<products.size();i++)
		{
			String[] names = products.get(i).getText().split("-");
			String FormattedName = names[0].trim();
//check whether name extracted is present in array or not
//convert array in arrayList
	List<String> nam	= Arrays.asList(name);
			if(nam.contains(FormattedName))
			{
				j++;
				//click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==3)
				{
					break;
				}
			
			}
		
		}
		

	}

}
