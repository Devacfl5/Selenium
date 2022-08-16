package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SchoolTask1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> tablerow = table.findElements(By.tagName("tr"));
		//task1 to get lastrow
		System.out.println("last row\n");
		for(int i=tablerow.size()-1;i<tablerow.size();i++) {
			WebElement rowelement = tablerow.get(i);
			String text = rowelement.getText();
			System.out.println(text);
		}
		//task2 to get middle row
		System.out.println("\n middle row\n");
		for(int i=0;i<tablerow.size();i++) {
			if(i==tablerow.size()/2)
			{WebElement rowelement = tablerow.get(i);
			String text = rowelement.getText();
			System.out.println(text);
			break;
		}
	}
		//task3 to get alternate columns
		System.out.println("\n alternate column\n ");
		List<WebElement> alltabdata = table.findElements(By.tagName("td"));
		for(int i=0;i<alltabdata.size();i++) {
			if(i%2==0) {
			WebElement column = alltabdata.get(i);
			String text = column.getText();
			System.out.println(text);
		}	}}}


