package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriverscript {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandip\\Desktop\\Arun\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.adactinhotelapp.com");
	driver.manage().window().maximize();
	WebElement uname=driver.findElement(By.id("username"));
	uname.sendKeys("ArunAk09");
 driver.findElement(By.id("password")).sendKeys("Arun@6621");
	driver.findElement(By.id("login")).click();
	//driver.quit();
		
	
	
	
	}

}
