package org.asp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactHotelTask10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("rakesh");
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("984568");
		// driver.quit();

	}

}
