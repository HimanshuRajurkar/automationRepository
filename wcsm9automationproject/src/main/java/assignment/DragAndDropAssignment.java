package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       Thread.sleep(2000);
       driver.get("https://jqueryui.com/droppable/");
       
       //handle by index Value
       driver.switchTo().frame(0);
       Thread.sleep(2000);
      WebElement src = driver.findElement(By.id("draggable"));
      WebElement dest = driver.findElement(By.id("droppable"));
      Actions act = new Actions(driver);
      act.dragAndDrop(src, dest).perform();
      
	}

}
