package org.asp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTestTask9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html\r\n");
		WebElement txtfirstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtfirstname.sendKeys("rakesh");
		WebElement txtlastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtlastname.sendKeys("marza");
		WebElement txtaddress = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtaddress.sendKeys("8,nehru street,indira nagar,chennai-600001");
		WebElement txtemail = driver.findElement(By.xpath("//input[@type='email']"));
		txtemail.sendKeys("ramu@gmail.com");
		WebElement txtphone = driver.findElement(By.xpath("//input[@type='tel']"));
		txtphone.sendKeys("9850689811");
		WebElement txtpass = driver.findElement(By.id("firstpassword"));
		txtpass.sendKeys("ram@1234");
		WebElement txtpass1 = driver.findElement(By.id("secondpassword"));
		txtpass1.sendKeys("ram@1234");
	}
}
