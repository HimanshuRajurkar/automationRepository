package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.get("https://www.google.com/");
	       Thread.sleep(2000);
	       
	       driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
	      // driver.switchTo().frame(1);
	      // driver.switchTo().frame("app");
	       WebElement frameElement = driver.findElement(By.name("app"));
	       driver.switchTo().frame(frameElement);
	       driver.findElement(By.xpath("(//a[@class='tX9u1b'])[3]")).click();
	}

}
