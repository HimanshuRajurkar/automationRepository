package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class TakeScreenshotOfWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
     
		 WebDriver driver= new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
	        driver.get("https://www.bluestone.com");
	        driver.findElement(By.id("denyBtn")).click();
	        Thread.sleep(2000);
	       
	        WebElement element1 = driver.findElement(By.xpath("//a[text()='Coins ']"));
		       Actions act = new Actions(driver);
			      act.moveToElement(element1).perform();
			      driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
			      WebElement coinElement = driver.findElement(By.xpath("//img[@alt='50 gram 24 KT Lakshmi Gold Coin']"));
			      Thread.sleep(2000);
			      File src = coinElement.getScreenshotAs(OutputType.FILE);
			     File dest=new File("./Screenshot/Coin.png");
			     Files.copy(src, dest);
	      
	}

}
