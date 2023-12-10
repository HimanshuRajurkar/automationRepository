package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-kh3c9h0/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		 
		 WebElement logoutLinkElement = driver.findElement(By.partialLinkText("Logout"));
		 boolean status = logoutLinkElement.isDisplayed();
		 System.out.println(status);
	}

}
