package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusTask6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement btndrop = driver.findElement(By.xpath("//div[@id='signin-block']"));
		btndrop.click();
		WebElement btnsign = driver.findElement(By.xpath("//li[@id='signInLink']"));
		btnsign.click();
		Thread.sleep(1000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame);
		WebElement txtphone = driver.findElement(By.xpath("//input[@type='number']"));
		txtphone.sendKeys("9874563210");
		//frame-working
		
	}
}
