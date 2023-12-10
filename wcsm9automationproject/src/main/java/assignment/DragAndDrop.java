package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.get("https://demo.guru99.com/test/drag_drop.html");
      Thread.sleep(3000);
      WebElement element1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
    		  WebElement element2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
    				  WebElement element3 = driver.findElement(By.xpath("//a[text()=' 5000']"));
    		  WebElement element4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
    		  
    		  
      WebElement target1 = driver.findElement(By.id("bank"));
      WebElement target2 = driver.findElement(By.id("amt7"));
      WebElement target3 = driver.findElement(By.id("loan"));
       WebElement target4 = driver.findElement(By.id("amt8"));
       
       Actions act = new Actions(driver);
       act.dragAndDrop(element1, target1).perform();
       act.dragAndDrop(element2, target2).perform();
       act.dragAndDrop(element3, target3).perform();
       act.dragAndDrop(element4, target4).perform();
      
      
      
       
      
      
	}

}
