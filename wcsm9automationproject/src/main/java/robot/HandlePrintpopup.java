package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePrintpopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver= new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         
         driver.get("https://www.selenium.dev");
         
         Robot robot = new Robot();
         //press ctrl+p
         Thread.sleep(2000);
         robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_P);
         //release ctrl+p
         Thread.sleep(2000);
         robot.keyRelease(KeyEvent.VK_CONTROL);
         robot.keyRelease(KeyEvent.VK_P);
         
         //handle print popup
         robot.keyPress(KeyEvent.VK_TAB);
         robot.keyRelease(KeyEvent.VK_TAB);
         Thread.sleep(2000);
         robot.keyPress(KeyEvent.VK_ENTER);
         robot.keyRelease(KeyEvent.VK_ENTER);
         Thread.sleep(2000);
        driver.quit();
         
	}

}
