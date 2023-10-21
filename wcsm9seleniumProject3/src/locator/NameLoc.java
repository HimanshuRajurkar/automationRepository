package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLoc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("file:///C:/Users/Himanshu%20Rajurkar/Desktop/Nishant.html");
		Thread.sleep(3000);
		
		//Identify the radio button by using name Locater
		driver.findElement(By.name("name1")).click();
		
		//identify PasswordTB
		//driver.findElement(By.name("na2")).sendKeys("Manager");
	}

}
