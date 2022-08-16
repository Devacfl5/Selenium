package keyboard;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement lnkgmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions actions=new Actions(driver);
		actions.contextClick(lnkgmail).perform();;
		Robot robot=new Robot();
		for(int i=1;i<=3;i++) {
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
