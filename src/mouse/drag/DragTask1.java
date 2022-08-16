package mouse.drag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragTask1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		WebElement sbank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dbank = driver.findElement(By.xpath("//ol[@id='bank']"));
		actions.dragAndDrop(sbank, dbank).perform();
		WebElement s5000 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement d5000 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		actions.dragAndDrop(s5000, d5000).perform();
		WebElement ssales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement dsales = driver.findElement(By.xpath("//ol[@id='loan']"));
		actions.dragAndDrop(ssales, dsales).perform();
		WebElement d5000ii = driver.findElement(By.xpath("//ol[@id='amt8']"));
		actions.dragAndDrop(s5000, d5000ii).perform();
		WebElement txt = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		String text = txt.getText();
		System.out.println(text);

}}
