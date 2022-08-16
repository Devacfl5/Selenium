package org.asp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramTask8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		WebElement txtusername = driver.findElement(By.xpath("//input[@name='username']"));
		txtusername.sendKeys("rakesh");
		WebElement txtpassword = driver.findElement(By.name("password"));
		txtpassword.sendKeys("985647");
		// text can be filled while debugging
	}

}
