package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTestTask1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement btnclick = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		btnclick.click();
		WebElement btnprompt = driver.findElement(By.xpath("//button[contains(text(),'prompt')]"));
		btnprompt.click();
		Alert click = driver.switchTo().alert();
		click.sendKeys("rakesh");
		click.accept();
		WebElement txtpri = driver.findElement(By.id("demo1"));
		String text = txtpri.getText();
		System.out.println(text);
		System.out.println("Ram");
}}
