package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.get("https://www.bluestone.com/");
	       Thread.sleep(2000);
	       driver.findElement(By.id("denyBtn")).click();
	      // driver.switchTo().frame(6);
	       Thread.sleep(2000);
	      driver.switchTo().frame("fc_widget");
	     // WebElement frameElement = driver.findElement(By.xpath(""));
	       driver.findElement(By.id("chat-icon")).click();
	       driver.switchTo().defaultContent();
	       Thread.sleep(2000);
	       driver.findElement(By.id("chat-fc-name")).sendKeys("himanshu");
	       Thread.sleep(2000);
	       driver.findElement(By.id("chat-fc-email")).sendKeys("himanshurajurkar81@gmail.com");
	       Thread.sleep(2000);
	       driver.findElement(By.id("chat-fc-phone")).sendKeys("7745678434");
	       
	       driver.findElement(By.xpath("//a[text()='Start Chat']")).click();
	      // driver.findElement(By.xpath("//i[@class='icon icon-ic_close mild']")).click();
	       
	}

}
