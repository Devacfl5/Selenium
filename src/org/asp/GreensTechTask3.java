package org.asp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechTask3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement txtsearch = driver.findElement(By.name("q"));
		txtsearch.sendKeys("GreensTechnology");

		
		// driver.quit();
		

	}
}
