package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTask3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement btnover = driver.findElement(By.xpath("//span[@title='Overview']"));
		btnover.click();
		//Thread.sleep(1000);
		WebElement text = driver.findElement(By.xpath("(//p[contains(text(),'Greens')])[1]"));
		String textpri = text.getText();
		System.out.println(textpri);
		
	}}
