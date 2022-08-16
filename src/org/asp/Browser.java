package org.asp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.quit();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://gmail.com/");
		driver1.quit();
		WebDriver driver2 = new ChromeDriver();
		driver2.get("http://www.flipkart.com/");
		driver2.quit();
		WebDriver driver3 = new ChromeDriver();
		driver3.get("http://greenstech.in/selenium-course-content.html");
		driver3.quit();
	}

}
