package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelTask1 {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://adactinhotelapp.com/");
			WebElement text = driver.findElement(By.xpath("//p[contains(text(),'Launches')]"));
			String textpri = text.getText();
			System.out.println(textpri);
			driver.quit();
		}

}
