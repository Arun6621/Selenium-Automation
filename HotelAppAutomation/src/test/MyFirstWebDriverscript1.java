package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriverscript1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandip\\Desktop\\Arun\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactinhotelapp.com");
		driver.manage().window().maximize();
		WebElement uname=driver.findElement(By.name("username"));
		uname.sendKeys("ArunAk09");
	 driver.findElement(By.name("password")).sendKeys("Arun@6621");
		driver.findElement(By.name("login")).click();
		driver.quit();
			
		
		
		
		}

	}
