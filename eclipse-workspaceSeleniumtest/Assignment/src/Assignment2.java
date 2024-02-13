import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// locators
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Kubrafathima");
		driver.findElement(By.name("email")).sendKeys("123@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement genderA = driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender = new Select(genderA);
		gender.selectByIndex(1);
		System.out.println(gender.getFirstSelectedOption().getText());
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("24/12/2023");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		

	}

}
