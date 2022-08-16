package org.asp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyTask6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.swiggy.com/");
		WebElement txtlocation = driver1.findElement(By.id("location"));
		txtlocation.sendKeys("thoraipakam");
		driver1.quit();

	}

}
