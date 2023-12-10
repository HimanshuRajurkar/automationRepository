package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment03 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.get("https://www.flipkart.com/");
	      driver.findElement(By.xpath("//span[text()='✕']")).click();
	      driver.findElement(By.name("q")).sendKeys("laptops",Keys.ENTER);
	      driver.findElement(By.xpath("//div[text()='Brand']")).click();
	      driver.findElement(By.xpath("//div[text()='HP']")).click();
	      
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//span[text()='13 MORE']")).click();
	     // Thread.sleep(3000);
	     driver.findElement(By.xpath("//div[text()='Core i7']")).click();
	      driver.findElement(By.xpath("//div[text()='4 GB']")).click();
	      driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
     driver.findElement(By.xpath("//div[text()='//div[text()='4★ & above']'")).click();
     	  
	}

}
