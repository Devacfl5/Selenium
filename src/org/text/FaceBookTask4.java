package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTask4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/ ");
		WebElement btncreate = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btncreate.click();
		Thread.sleep(1000);
		WebElement txtfirstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		txtfirstname.sendKeys("ramkumar");
}}
