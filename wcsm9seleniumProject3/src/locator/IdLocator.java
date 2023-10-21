package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Himanshu%20Rajurkar/Desktop/123.html");
		Thread.sleep(3000);
		
		//identify usernameTB
		driver.findElement(By.id("id1")).sendKeys("Admin");
		
		//identify PasswordTB
		driver.findElement(By.id("id2")).sendKeys("Manager");
		
		
		

	}

}

