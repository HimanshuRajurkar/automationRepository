package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollLeftAndRight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://dashboards.handmadeinteractive.com/jasonlove");
        
        //Scroll Down Operation
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(7000,0)");
       for(int i=0;i<2;i++)
       {
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(-7000,0)");
       }
       driver.close();
	}

}
