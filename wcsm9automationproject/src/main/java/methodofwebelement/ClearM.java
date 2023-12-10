package methodofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-kh3c9h0/login.do");
		Thread.sleep(2000);
		
		//identify usernameTB
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("admin");
		
		//identify PasswordTB
		WebElement passTB= driver.findElement(By.name("pwd"));
		passTB.sendKeys("admin@14");
		usnTB.clear();
		passTB.clear();
		
		//driver.findElement(By.id("loginButton")).click();
		
	}

}
