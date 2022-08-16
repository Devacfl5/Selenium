package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','iphone')",txtsearch);
		Object search = executor.executeScript("return arguments[0].getAttribute('value')",txtsearch);
	System.out.println(search);
	WebElement btnsearch = driver.findElement(By.xpath("//input[@type='submit']"));
	executor.executeScript("arguments[0].click()",btnsearch);
	WebElement txtup = driver.findElement(By.xpath("//span[text()='RESULTS']"));
	WebElement txtdown = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
	executor.executeScript("arguments[1].scrollIntoView(true)",txtup,txtdown);
	
	
	}

}
