package mouse.drag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartTask2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement btnclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnclose.click();
		//Thread.sleep(3000);
		WebElement lnkelectronics = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
		Actions action=new Actions(driver);
		action.moveToElement(lnkelectronics).perform();
		WebElement lnklaptop = driver.findElement(By.xpath("//a[text()='Laptop and Desktop']"));
		action.moveToElement(lnklaptop).perform();
		WebElement lnklap = driver.findElement(By.xpath("(//a[text()='Laptops'])[1]"));
		lnklap.click();
		WebElement txtseller = driver.findElement(By.xpath("(//span[text()='Become a Seller'])[2]"));
		String textpri = txtseller.getText();
		System.out.println(textpri);

}}
