package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyTask14 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/\r\n");
		WebElement btnsignup = driver.findElement(By.className("r2iyh"));
		btnsignup.click();
		WebElement txtmobile = driver.findElement(By.id("mobile"));
		txtmobile.sendKeys("9874562210");
		WebElement txtname = driver.findElement(By.id("name"));
		txtname.sendKeys("ramu");
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("ramu24@gmail.com");
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("ram@1233");
		WebElement btnsubmit = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		btnsubmit.click();
}}
