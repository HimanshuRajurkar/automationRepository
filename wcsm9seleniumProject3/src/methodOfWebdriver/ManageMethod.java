package methodOfWebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        //minimize the browser
        driver.manage().window().minimize();
        Thread.sleep(2000);
        
        // set the full screen
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        
        // set the size of browser
        Dimension targetSize = new Dimension(350, 450);
        driver.manage().window().setSize(targetSize);
        Thread.sleep(2000);
        
        // set the position of browser
        Point targetPosition = new Point(450, 350);
      driver.manage().window().setPosition(targetPosition);
      driver.close();
        
	}

}
