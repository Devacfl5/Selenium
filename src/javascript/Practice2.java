package javascript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File s = screenshot.getScreenshotAs(OutputType.FILE);
		File d=new File("D:\\deva pro and details\\devait\\practice\\screenshot\\output.png");
		FileUtils.copyFile(s, d);
		WebElement locator = driver.findElement(By.className("_9vtf"));
		File s1 = locator.getScreenshotAs(OutputType.FILE);
		File d1=new File("D:\\deva pro and details\\devait\\practice\\screenshot\\output1.png");
		FileUtils.copyFile(s1, d1);
		
		
		
	}

}
