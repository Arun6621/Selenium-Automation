package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static WebDriver driver;
  @Test
  public void test1() {
	  
	  WebElement uname=driver.findElement(By.cssSelector("#username"));
		uname.sendKeys("ArunAk09");
	 driver.findElement(By.cssSelector("#password")).sendKeys("Arun@6621");
		driver.findElement(By.cssSelector("#login")).click();
		
		new Select(driver.findElement(By.id("location"))).selectByVisibleText("London");
		new Select(driver.findElement(By.id("hotels"))).selectByIndex(3);
		new Select(driver.findElement(By.id("room_type"))).selectByIndex(2);
		new Select(driver.findElement(By.id("room_nos"))).selectByIndex(4);
		
		WebElement date = driver.findElement(By.id ("datepick_in"));
		 date.click();
		 date.clear();
		 date.sendKeys("12/04/2022");
		
		 WebElement dat = driver.findElement(By.id ("datepick_out"));
		 dat.click();
		 dat.clear();
		 dat.sendKeys("14/04/2022");
		
	    new Select(driver.findElement(By.id("adult_room"))).selectByIndex(2);
		new Select(driver.findElement(By.name("child_room"))).selectByIndex(2);
		
		driver.findElement(By.cssSelector("#Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.cssSelector("#continue")).click();
		driver.findElement(By.name("first_name")).sendKeys("Arun");
		driver.findElement(By.name("last_name")).sendKeys("Kolekar");
		driver.findElement(By.name("address")).sendKeys("Ganeshwadi");
		driver.findElement(By.name("cc_num")).sendKeys("9876543210658943");
		
		new Select(driver.findElement(By.id("cc_type"))).selectByIndex(2);
		new Select(driver.findElement(By.id("cc_exp_month"))).selectByIndex(2);
		new Select(driver.findElement(By.id("cc_exp_year"))).selectByIndex(10);
		
		driver.findElement(By.name("cc_cvv")).sendKeys("009");
		driver.findElement(By.cssSelector("#book_now")).click();
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandip\\Desktop\\Arun\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.adactinhotelapp.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
