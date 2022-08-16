package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTask13 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/\r\n");
		WebElement txtphone = driver.findElement(By.xpath("//input[@class=\"form-control mobileNumberInput\"]"));
txtphone.sendKeys("9874563210");
WebElement btnsubmit = driver.findElement(By.className("submitBottomOption"));
btnsubmit.click();
}}
