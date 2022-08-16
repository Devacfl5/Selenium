package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpTask11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement txtfirstn = driver.findElement(By.id("firstName"));
		txtfirstn.sendKeys("ramu");
		WebElement txtlastn = driver.findElement(By.id("lastName"));
		txtlastn.sendKeys("kumar");
		WebElement txtemail = driver.findElement(By.id("username"));
		txtemail.sendKeys("ramu6f58k");
		WebElement txtpass1 = driver.findElement(By.name("Passwd"));
		txtpass1.sendKeys("ram@25874");
		WebElement txtpassc = driver.findElement(By.name("ConfirmPasswd"));
		txtpassc.sendKeys("ram@25874");
		WebElement btnnext = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
		btnnext.click();
		Thread.sleep(3000);
		WebElement txtphone = driver.findElement(By.xpath("//input[@type='tel']"));
		txtphone.sendKeys("8072361236");
		WebElement btnnext1 = driver.findElement(By.xpath("//span[text()='Next']"));
		btnnext1.click();
		WebElement btnverify = driver.findElement(By.xpath("//span[text()='Next']"));
		btnverify.click();
		
}}
