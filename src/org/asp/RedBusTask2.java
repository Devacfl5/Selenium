package org.asp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusTask2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/ ");
		WebElement txtFrom = driver.findElement(By.id("src"));
		txtFrom.sendKeys("chennai");
		WebElement txtTo = driver.findElement(By.id("dest"));
		txtTo.sendKeys("marthandam");

	
	}}
