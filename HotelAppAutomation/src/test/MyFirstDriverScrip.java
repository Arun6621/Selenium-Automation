package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstDriverScrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandip\\Desktop\\Arun\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactinhotelapp.com");
	//	driver.manage().window().maximize();
		
		
	      
	       driver.manage().window().maximize();
	       driver.navigate().to("https://www.google.com");
	       driver.navigate().back();
	       driver.navigate().forward();
		

	}

}
