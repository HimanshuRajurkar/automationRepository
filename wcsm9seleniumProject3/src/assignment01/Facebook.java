package assignment01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//identify usernameTB
		driver.findElement(By.id("email")).sendKeys("himanshu");
		
		//identify PasswordTB
		driver.findElement(By.id("pass")).sendKeys("himanhu4576");
		
		driver.findElement(By.name("login")).click();
		
		//driver.close();
	}
}
