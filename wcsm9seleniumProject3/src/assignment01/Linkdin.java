package assignment01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkdin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login/");
		Thread.sleep(3000);
		
		//identify usernameTB
		driver.findElement(By.id("username")).sendKeys("himanshurajurkar71@gmail.com");
		
		//identify PasswordTB
		driver.findElement(By.name("session_password")).sendKeys("Him46@nshuraj");
		
		driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
		
		//driver.close();
	}

	
}
