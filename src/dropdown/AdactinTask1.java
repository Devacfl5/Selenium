package dropdown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinTask1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\deva pro and details\\devait\\practice\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://adactinhotelapp.com/");
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("Devacfl5");
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("Devacfl5");
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
		//location
		WebElement drDnLoc = driver.findElement(By.id("location"));
		Select select=new Select(drDnLoc);
		select.selectByValue("Paris");
		//hotel
		WebElement drDnHot = driver.findElement(By.id("hotels"));
		Select select1=new Select(drDnHot);
		select1.selectByIndex(1);
		//room type
		WebElement DrDnType = driver.findElement(By.id("room_type"));
		Select select2=new Select(DrDnType);
		select2.selectByVisibleText("Standard");
		//no.of room
		WebElement drDnNo = driver.findElement(By.id("room_nos"));
		Select select3=new Select(drDnNo);
		select3.selectByIndex(1);
		//check-in date
		//JavascriptExecutor executor=(JavascriptExecutor) driver;
		WebElement txtdate1 = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		txtdate1.clear();
		txtdate1.sendKeys("10/07/2022");
		//executor.executeScript("arguments[0].setAttribute('value','10/07/2022')",txtdate1);
		//check-out date
		WebElement txtdate2 = driver.findElement(By.name("datepick_out"));
		txtdate2.clear();
		txtdate2.sendKeys("12/07/2022");
		//executor.executeScript("arguments[0].setAttribute('value','12/07/2022')",txtdate2);
		
		//adult per room
		WebElement drDnAdult = driver.findElement(By.id("adult_room"));
		Select select4=new Select(drDnAdult);
		select4.selectByIndex(1);
		//children per room
		WebElement drDnChild = driver.findElement(By.id("child_room"));
		Select select5=new Select(drDnChild);
		select5.selectByIndex(1);
		//to clcik search
		WebElement btnsearch = driver.findElement(By.id("Submit"));
		btnsearch.click();
		//to select
		WebElement btnradio = driver.findElement(By.id("radiobutton_0"));
		btnradio.click();
		//to click hotel
		WebElement btncontinue = driver.findElement(By.id("continue"));
		btncontinue.click();
		//details fill in
		WebElement txtfirstname = driver.findElement(By.id("first_name"));
		txtfirstname.sendKeys("Rakesh");
		WebElement txtlastname = driver.findElement(By.id("last_name"));
		txtlastname.sendKeys("G");
		WebElement txtadd = driver.findElement(By.id("address"));
		txtadd.sendKeys("no.7,rajiv nagar,chennai");
		WebElement txtcredit = driver.findElement(By.id("cc_num"));
		txtcredit.sendKeys("1234567890123456");
		//select credit type
		WebElement drDncredittype = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select select6=new Select(drDncredittype);
		select6.selectByValue("VISA");
		//select month
		WebElement drDnmon = driver.findElement(By.id("cc_exp_month"));
		Select select7=new Select(drDnmon);
		select7.selectByIndex(12);
		//select year
		WebElement drDnyear = driver.findElement(By.id("cc_exp_year"));
		Select select8=new Select(drDnyear);
		select8.selectByValue("2022");
		//cvv
		WebElement txtcvv = driver.findElement(By.id("cc_cvv"));
		txtcvv.sendKeys("565");
		//clcick booknow
		WebElement btnbook = driver.findElement(By.id("book_now"));
		btnbook.click();
		//orderno
		WebElement txtorder = driver.findElement(By.xpath("//input[@name='order_no']"));
		String text1 = txtorder.getAttribute("value");
		System.out.println(text1);

	}
		
	}


