package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrainTask7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains\r\n");
		WebElement txtfrom = driver.findElement(By.id("from_station"));
		txtfrom.sendKeys("chennai");
		WebElement txtTo = driver.findElement(By.id("to_station"));
		txtTo.sendKeys("nagercoil");
		WebElement btnsearch = driver.findElement(By.id("trainFormButton"));
		btnsearch.click();

}}
