package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMYTripTask2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.makemytrip.com/");
		WebElement btnSearch = driver.findElement(By.xpath("//a[text()='Search']"));
		btnSearch.click();
		WebElement element2 = driver.findElement(By.xpath("//button[contains(text(),'OKAY, GOT IT!')]"));
		element2.click();
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'06:15')]//following::p[7]"));
			System.out.println(element.getText());
		}
	
	}


