package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program01 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/");
		Thread.sleep(1200);
		  driver.findElement(By.partialLinkText("height: 180px; border-radius: 15px;\">")).click();
		  driver.findElement(By.partialLinkText("Java Interview Questions")).click();
		  driver.findElement(By.partialLinkText("Java Interview Questions For Freshers")).click();
		  Thread.sleep(2000);
	}

}
