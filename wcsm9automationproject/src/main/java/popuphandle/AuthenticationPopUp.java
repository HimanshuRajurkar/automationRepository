package popuphandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AuthenticationPopUp {

	
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Robot robot = new Robot();
		Actions act = new Actions(driver);
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Authentication']")).click();
		
		WebElement element = driver.findElement(By.xpath("(//b[text()='admin'])[1]"));
		Thread.sleep(2000);
		act.moveToElement(element).perform();
		act.doubleClick().perform();
		Thread.sleep(2000);
		act.clickAndHold(element).perform();
		Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyRelease(KeyEvent.VK_C);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyRelease(KeyEvent.VK_C);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		String currentWindow = driver.getWindowHandle();
		
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		System.out.println(currentWindow);
		
		
		for (String wh : allWindow) {
			if (!currentWindow.equals(wh)) {
				driver.switchTo().window(wh);
			}
		} 
		Thread.sleep(2000);
		
		
		  robot.keyPress(KeyEvent.VK_CONTROL);
		     robot.keyRelease(KeyEvent.VK_V);

			  robot.keyPress(KeyEvent.VK_CONTROL);
			     robot.keyRelease(KeyEvent.VK_V);
		    
		     
		     
		    
	}

}
