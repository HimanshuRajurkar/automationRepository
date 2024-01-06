package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.get("https://demoapps.qspiders.com/");
	      driver.findElement(By.xpath("//section[text()='Button']")).click();
	      driver.findElement(By.xpath("//a[text()='Right Click']")).click();
	      
	      Actions act = new Actions(driver);
	  Thread.sleep(2000);
	    		  WebElement rightClk = driver.findElement(By.xpath("//button[text()='Right Click']"));
	    		  act.contextClick(rightClk).perform();
	    		  driver.findElement(By.xpath("//div[text()='Yes']")).click();
	    		if(driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).isDisplayed())
	    		{
	    			System.out.println("isDisplayed");
	    		}
	    		else
	    		{
	    			System.out.println("notDisplayed");
	    		}
	    		driver.quit();
	}

}
