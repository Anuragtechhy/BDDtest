package pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagecode {      // create constructor in testclass by name of lp to link this class to testclass 

	WebDriver driver ;
	public void openurl() {            // this class call in @GIVEN in ( i am the user of this application)
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\software2\\chromedriver-win64 new\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");    
		}
	
	public void enterusername() {
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	}
	
	public void enterpassword() {
		driver.findElement(By.id("pass")).sendKeys("12345");
	}
	
	public void clickloginbutton() {
		System.out.println("login button clicked");
	}
	
	public void verifylogin() {
		System.out.println("login verified");
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

