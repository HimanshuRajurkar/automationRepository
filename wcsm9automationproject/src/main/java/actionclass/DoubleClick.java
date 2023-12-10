package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		 WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.get("https://demoapps.qspiders.com/");
	      driver.findElement(By.xpath("//section[text()='Button']")).click();
	      driver.findElement(By.xpath("//a[text()='Double Click']")).click();
	      
	      driver.findElement(By.xpath("//a[text()='Double Click']")).click();
	      WebElement element = driver.findElement(By.xpath("//button[text()='Yes']"));
	    Actions act = new Actions(driver);
	    act.doubleClick(element).perform();
	    
	    if (driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).isDisplayed())
	    {
			 System.out.println("Is Displayed");
		}
	      else {
		     	 System.out.println("Is Not Displayed");
		       }
		
	    
	}

}
