package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		WebElement DrDnMulti = driver.findElement(By.name("selenium_commands"));
		Select select=new Select(DrDnMulti);
		boolean multiple = select.isMultiple();
		if(multiple==true)
		{
			select.selectByIndex(0);
			select.selectByIndex(1);
		}
		
		
	}

}
