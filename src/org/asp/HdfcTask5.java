package org.asp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcTask5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/ ");
		driver.switchTo().frame("login_page");
		WebElement txtUserid = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		txtUserid.sendKeys("1487");
		WebElement btncontinue = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		btncontinue.click();
		WebElement txtpass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		txtpass.sendKeys("Ram1997");
		// driver.quit();
		// frame working

	}

}
