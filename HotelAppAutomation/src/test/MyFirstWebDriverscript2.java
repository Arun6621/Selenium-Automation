package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriverscript2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactinhotelapp.com");
		driver.manage().window().maximize();
		WebElement uname=driver.findElement(By.className("login_input"));
		uname.sendKeys("ArunAk09");
	 driver.findElement(By.id("password")).sendKeys("Arun@6621");
		driver.findElement(By.className("login_button")).click();
		driver.quit();
			
		
		
		
		}

	}