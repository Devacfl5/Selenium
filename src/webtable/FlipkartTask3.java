package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartTask3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		WebElement txtSearch = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		txtSearch.sendKeys("iphone 13",Keys.ENTER);
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		//List<WebElement> phoneName = driver.findElements(By.xpath("//img[@height='21']//parent::div//following::div[246]"));
		List<WebElement> phoneName = driver.findElements(By.xpath("//img[@height='21']/ancestor::div/descendant::div[@class='_4rR01T']"));
		System.out.println(phoneName.size());
		for(int i=0;i<phoneName.size();i++) {
			WebElement element = phoneName.get(i);
			String text = element.getText();
			//if(text.contains("APPLE iPhone 13")) {
				System.out.println(text);
			//}
		}
		List<WebElement> phonePrice = driver.findElements(By.xpath("//div[@class='_4rR01T']//ancestor::div//descendant::div[@class='_30jeq3 _1_WHN1']"));
		System.out.println(phonePrice.size());
		for(int i=0;i<phonePrice.size();i++) {
			WebElement price = phonePrice.get(i);
			String text2 = price.getText();
			//if(text2.contains("₹")) {
				System.out.println(text2);		
			//}
			
		}
	
	}

}
