package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraCom {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("https://www.myntra.com/");
	      driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("Bags",Keys.ENTER);
	      String parentHandles = driver.getWindowHandle();
	      driver.findElement(By.xpath("(//img[contains(@title,'MINI WESST Geometric Printed Bucket Tote Bag')])[2]")).click();
	      Set<String> allHandles = driver.getWindowHandles();
	      for (String wh : allHandles)
	       {
			if (!parentHandles.equals(wh))
		    	{
				  driver.switchTo().window(wh);
		    	}
	       }
	      driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[2]/div[2]/div[2]/div[3]/div/div[1]")).click();
	      
   }
}