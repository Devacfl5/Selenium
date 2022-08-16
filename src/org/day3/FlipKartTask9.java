package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartTask9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement txtusername = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtusername.sendKeys("ramu@gmail.com");
		WebElement txtpassword = driver.findElement(By.xpath("//input[@type='password']"));
		txtpassword.sendKeys("9845632145");
		WebElement btnlogin = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		btnlogin.click();
		
	}}
