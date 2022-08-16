package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTask5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html\r\n");
		driver.manage().window().maximize();
		WebElement btninterview = driver.findElement(By.xpath("//i[@class='fas fa-plus']"));
		btninterview.click();
		//Thread.sleep(1000);
		WebElement btncts = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
		btncts.click();
		//while debug working 
		
	}}
