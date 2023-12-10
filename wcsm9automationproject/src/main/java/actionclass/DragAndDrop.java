package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		 WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.get("https://demoapps.qspiders.com/");
	      driver.findElement(By.xpath("//section[text()='Drag And Drop']")).click();
	      driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
	     WebElement source1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	    WebElement target1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
	      Actions act = new Actions(driver);
	      act.dragAndDrop(source1, target1).perform();
	      WebElement source2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		   
	      act.dragAndDrop(source2, target1).perform();
	      
	      WebElement target2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
	      
	      WebElement source3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
	      WebElement source4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
	       act.dragAndDrop(source3, target2).perform();
	       act.dragAndDrop(source4, target2).perform();
	
	}

}

