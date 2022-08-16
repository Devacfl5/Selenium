package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDealTask12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/\r\n");
		WebElement btnsign = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		btnsign.click();
		WebElement btnreg = driver.findElement(By.xpath("//span[text()='Register']"));
		btnreg.click();
		Thread.sleep(1000);
		driver.switchTo().frame("loginIframe");
		WebElement txtuser = driver.findElement(By.xpath("//input[@id='userName']"));
		txtuser.sendKeys("9884330446");
		WebElement btncontinue = driver.findElement(By.xpath("(//button[text()='continue'])[1]"));
		btncontinue.click();
		//frame-working

		
}}
