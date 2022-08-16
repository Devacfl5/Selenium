package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask2 {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement text = driver.findElement(By.xpath("//a[contains(text(),'Condition')]"));
		//boolean displayed = driver.findElement(By.xpath("//a[contains(text(),'Cndition')]")).isDisplayed();
			text = driver.findElement(By.xpath("//a[contains(text(),'Condition')]"));
			String textpri = text.getText();
			System.out.println(textpri);
			driver.quit();		
		
	
	}}
