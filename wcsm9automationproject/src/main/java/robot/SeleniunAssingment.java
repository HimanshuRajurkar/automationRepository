package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniunAssingment {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver= new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         
         driver.get("https://www.selenium.dev");
         Robot robot = new Robot();
     WebElement newsElement = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
         /*
          for(int i=0;i<22;i++)
         {
     robot.keyPress(KeyEvent.VK_PAGE_DOWN);
         }
     WebElement newsElement = driver.findElement(By.xpath("//h2[text()='News']"));
     */
     Thread.sleep(2000);
     Actions act = new Actions(driver);
     act.contextClick(newsElement).perform();
     Thread.sleep(2000);
    
     for(int i=0;i<10;i++)
     {
    	 Thread.sleep(1000);
     robot.keyPress(KeyEvent.VK_PAGE_DOWN);
     robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
     }
     
     robot.keyPress(KeyEvent.VK_ENTER);
     robot.keyRelease(KeyEvent.VK_ENTER);
     
	}
	//h2[text()='News']
}
