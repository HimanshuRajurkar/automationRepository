package assignment01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-kh3c9h0/login.do");
		Thread.sleep(3000);
		
		//identify usernameTB
		driver.findElement(By.name("username")).sendKeys("admin");
		
		//identify PasswordTB
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		//driver.close();
	}

}
