package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01 {

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://www.google.com/");
      driver.switchTo().activeElement().sendKeys("flipkart",Keys.ENTER);
      driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
      driver.findElement(By.xpath("//span[text()='✕']")).click();
      driver.findElement(By.name("q")).sendKeys("Iphone",Keys.ENTER);
      
     //get the address of parent window
     String parentHandles = driver.getWindowHandle(); 
     // driver.findElement(By.xpath("//button[contains(@aria-label,'Search for Prod')]")).click();
      driver.findElement(By.xpath("(//div[contains(@class,'CXW8mj')])[2]")).click();
      //get the address of all the window
      Set<String> allHandles = driver.getWindowHandles();
      for (String wh : allHandles)
       {

		if (!parentHandles.equals(wh))
	    	{
			  driver.switchTo().window(wh);
	    	}
       }
      driver.findElement(By.xpath("//*[@id=\"swatch-2-color\"]/a/div")).click();
      Thread.sleep(2000);
      driver.findElement(By.partialLinkText("512 GB")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[text()='Remove']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[text()='Remove']")).click();
    
	}

}
